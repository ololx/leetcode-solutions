package io.github.ololx.leetcode.solutions.easy.task1598;

/**
 * 1598. Crawler Log Folder
 *
 * The Leetcode file system keeps a log each time some user performs
 * a change folder operation.
 *
 * The operations are described below:
 * <ul>
 *     <li>
 *         "../" : Move to the parent folder of the current folder.
 *         (If you are already in the main folder, remain in the same folder).
 *     </li>
 *     <li>
 *         "./" : Remain in the same folder.
 *     </li>
 *     <li>
 *         "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
 *     </li>
 * </ul>
 *
 * You are given a list of strings logs where logs[i] is
 * the operation performed by the user at the i^th step.
 *
 * The file system starts in the main folder, then
 * the operations in logs are performed.
 *
 * Return the minimum number of operations needed to go back
 * to the main folder after the change folder operations.
 *
 * Example 1:
 * <p>Input: logs = ["d1/","d2/","../","d21/","./"]
 * Output: 2
 * Explanation: Use this change folder operation "../"
 * 2 times and go back to the main folder.</p>
 *
 * Example 2:
 * <p>Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
 * Output: 3</p>
 *
 * Example 3:
 * <p>Input: logs = ["d1/","../","../","../"]
 * Output: 0</p>
 *
 * project leetcode-solutions
 * created 11.04.2022 22:07
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int minOperations(String[] logs) {
        if (logs == null) {
            return 0;
        }

        int stepsToRootCount = 0;
        for (String log : logs) {
            switch (log) {
                case "./":
                    break;
                case "../":
                    stepsToRootCount = stepsToRootCount > 0
                            ? --stepsToRootCount
                            : stepsToRootCount;
                    break;
                default:
                    stepsToRootCount++;
            }
        }

        return stepsToRootCount;
    }
}
