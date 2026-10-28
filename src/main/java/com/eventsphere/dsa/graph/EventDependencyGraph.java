package com.eventsphere.dsa.graph;

import java.util.*;

public class EventDependencyGraph {
    private final Map<String, List<String>> adjacencyList = new HashMap<>();

    public void addEdge(String from, String to) {
        adjacencyList.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        adjacencyList.computeIfAbsent(to, k -> new ArrayList<>());
    }

    public Map<String, List<String>> getAdjacencyList() {
        return adjacencyList;
    }
}
