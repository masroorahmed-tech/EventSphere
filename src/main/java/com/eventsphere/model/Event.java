package com.eventsphere.model;

import java.time.LocalDateTime;

public class Event {
    private int id;
    private String title;
    private String description;
    private EventType eventType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int venueId;
    private int organizerId;

    public Event() {
    }

    public Event(int id, String title, String description, EventType eventType, LocalDateTime startTime, LocalDateTime endTime, int venueId, int organizerId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventType = eventType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.venueId = venueId;
        this.organizerId = organizerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public int getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(int organizerId) {
        this.organizerId = organizerId;
    }
}
