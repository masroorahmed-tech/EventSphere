package com.eventsphere.model;

public class Venue {
    private int id;
    private String name;
    private String location;
    private int capacity;
    private String venueType;

    public Venue() {
    }

    public Venue(int id, String name, String location, int capacity, String venueType) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.venueType = venueType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }
}
