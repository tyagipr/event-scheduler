package com.example.eventscheduler.cron;

import com.example.eventscheduler.mapper.EventMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class Scheduler {

    @Autowired
    EventMapper eventMapper;

    private List<Long> pastEventIds = new ArrayList<>();

    /*
        Scheduler to remove past events from database
     */
    @Scheduled(cron = "0 0 * * * *", zone = "GMT+5:30")
    public void removeScheduler() {
        if(!pastEventIds.isEmpty()) {
            for (Long id : pastEventIds) {
                log.info("deleting event at 12 am everyday if available");
                try {
                    eventMapper.deleteEventById(id);
                }catch (Exception e) {
                    log.info("exception in event deletion from database id {} ", id);
                }
            }
        }

    }
}
