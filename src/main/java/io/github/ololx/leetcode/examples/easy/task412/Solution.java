package io.github.ololx.leetcode.examples.easy.task412;

import java.util.ArrayList;
import java.util.List;

/**
 * project leetcode-solutions
 * created 14.08.2022 22:41
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
