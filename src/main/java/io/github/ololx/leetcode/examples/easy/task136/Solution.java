package io.github.ololx.leetcode.examples.easy.task136;

import java.util.HashMap;
import java.util.Map;

/**
 * project leetcode-solutions
 * created 15.02.2022 10:16
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, 1 + numMap.getOrDefault(num, 0));

            if (numMap.get(num) >= 2) {
                numMap.remove(num);
            }
        }

        return numMap.keySet().iterator().next();
    }
}
