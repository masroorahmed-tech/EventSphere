package com.eventsphere.model;

import java.math.BigDecimal;

public class Expense {
    private int id;
    private int eventId;
    private String category;
    private BigDecimal amount;
    private String description;

    public Expense() {
    }

    public Expense(int id, int eventId, String category, BigDecimal amount, String description) {
        this.id = id;
        this.eventId = eventId;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
