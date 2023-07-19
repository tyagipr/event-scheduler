package com.example.eventscheduler.controllers;

import com.example.eventscheduler.services.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/events/")
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping(path = "all")
    public ResponseEntity getAllTheEvents() {
        return ResponseEntity.status(HttpStatus.OK).body(eventService.getAllEventsList());
    }
}
