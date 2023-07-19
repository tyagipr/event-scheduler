package com.example.eventscheduler.models;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Event {
    private Integer id;
    private String name;
    private String location;
    private Timestamp startAt;
    private Timestamp endAt;
}
