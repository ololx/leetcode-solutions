package io.github.ololx.leetcode.examples.medium.task71;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public String simplifyPath(String path) {
        if (path == null || path.isBlank()) {
            return null;
        }

        List<String> canonicalPathParts = new ArrayList<>();
        String[] pathParts = path.split("/");

        for (int partIndex = 0; partIndex < pathParts.length; partIndex++) {
            String partPath = pathParts[partIndex];

            if ("/".equals(partPath) || ".".equals(partPath) || partPath.isBlank()) {
                continue;
            }

            if ("..".equals(partPath)) {
                if (canonicalPathParts.size() > 0) {
                    canonicalPathParts.remove(canonicalPathParts.size() - 1);
                }
                
                continue;
            }

            canonicalPathParts.add(partPath);
        }

        return "/" + canonicalPathParts.stream().collect(Collectors.joining("/"));
    }
}
