package com.eventsphere.dsa.graph;

import java.util.*;

public class TopologicalSort {
    public List<String> sort(Map<String, List<String>> graph) {
        Map<String, Integer> indegree = new HashMap<>();
        for (String node : graph.keySet()) {
            indegree.put(node, 0);
        }

        for (List<String> neighbors : graph.values()) {
            for (String neighbor : neighbors) {
                indegree.put(neighbor, indegree.getOrDefault(neighbor, 0) + 1);
            }
        }

        Queue<String> queue = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : indegree.entrySet()) {
            if (entry.getValue() == 0) {
                queue.add(entry.getKey());
            }
        }

        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            String node = queue.poll();
            result.add(node);
            for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0) {
                    queue.add(neighbor);
                }
            }
        }

        return result;
    }
}
