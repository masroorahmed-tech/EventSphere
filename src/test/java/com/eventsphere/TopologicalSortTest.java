package com.eventsphere.dsa.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class TopologicalSortTest {
    @Test
    void shouldSortGraph() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", List.of("B", "C"));
        graph.put("B", List.of("D"));
        graph.put("C", List.of("D"));
        graph.put("D", List.of());

        TopologicalSort sorter = new TopologicalSort();
        List<String> result = sorter.sort(graph);

        assertTrue(result.indexOf("A") < result.indexOf("B"));
        assertTrue(result.indexOf("A") < result.indexOf("C"));
        assertTrue(result.indexOf("B") < result.indexOf("D"));
        assertTrue(result.indexOf("C") < result.indexOf("D"));
    }
}
