package com.example.eventscheduler.controllers;

import com.example.eventscheduler.models.Event;
import com.example.eventscheduler.services.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping
    public ResponseEntity getAllTheEvents() {
        return ResponseEntity.status(HttpStatus.OK).body(eventService.getAllEventsList());
    }
}
