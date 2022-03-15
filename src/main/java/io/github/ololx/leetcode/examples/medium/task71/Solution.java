package io.github.ololx.leetcode.examples.medium.task71;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 71. Simplify Path
 *
 * Given a string path, which is an absolute path (starting with a slash '/')
 * to a file or directory in a Unix-style file system, convert it to
 * the simplified canonical path.
 *
 * In a Unix-style file system, a period '.' refers to the current directory,
 * a double period '..' refers to the directory up a level, and any multiple
 * consecutive slashes (i.e. '//') are treated as a single slash '/'.
 * For this problem, any other format of periods such as '...'
 * are treated as file/directory names.
 *
 * The canonical path should have the following format:
 * <ul>
 *     <li>The path starts with a single slash '/'.</li>
 *     <li>Any two directories are separated by a single slash '/'.</li>
 *     <li>The path does not end with a trailing '/'.</li>
 *     <li>The path only contains the directories on the path from the root
 *     directory to the target file or directory (i.e., no period '.'
 *     or double period '..')</li>
 * </ul>
 *
 * Return the simplified canonical path.
 *
 * Example 1:
 * <p>nput: path = "/home/"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last
 * directory name.</p>
 *
 * Example 2:
 * <p>Input: path = "/../"
 * Output: "/"
 * Explanation: Going one level up from the root directory is a no-op,
 * as the root level is the highest level you can go.</p>
 *
 * Example 3:
 * <p>Input: path = "/home//foo/"
 * Output: "/home/foo"
 * Explanation: In the canonical path, multiple consecutive slashes
 * are replaced by a single one.</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= path.length <= 3000
 *     </li>
 *     <li>
 *         path consists of English letters, digits, period '.', slash '/' or '_'.
 *     </li>
 *     <li>
 *         path is a valid absolute Unix path.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 14.03.2022 17:43
 *
 * @author Alexander A. Kropotin
 */
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
