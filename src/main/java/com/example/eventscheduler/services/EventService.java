package com.example.eventscheduler.services;

import com.example.eventscheduler.mapper.EventMapper;
import com.example.eventscheduler.models.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EventService {

    @Autowired
    EventMapper eventMapper;

    public List<Event> getAllEventsList() {
        /*
        add more error specific exceptions
         */
        List<Event> events = new ArrayList<>();
        events = eventMapper.getAllEvents();
        return events;
    }
}
