package com.eventsphere.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EventServiceTest {
    @Test
    void createEventShouldWork() {
        EventService service = new EventService();
        assertNotNull(service);
        service.createEvent();
    }
}
