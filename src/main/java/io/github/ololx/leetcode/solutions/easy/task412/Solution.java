package io.github.ololx.leetcode.solutions.easy.task412;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 *
 * Given an integer n, return a string array answer (1-indexed) where:
 * <ul>
 *     <ol>
 *         answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 *     </ol>
 *     <ol>
 *         answer[i] == "Fizz" if i is divisible by 3.
 *     </ol>
 *     <ol>
 *         answer[i] == "Buzz" if i is divisible by 5.
 *     </ol>
 *     <ol>
 *         answer[i] == i (as a string) if none of the above conditions are true.
 *     </ol>
 * </ul>
 *
 * Example 1:
 * <p>Input: n = 3
 * Output: ["1","2","Fizz"]</p>
 *
 * Example 2:
 * <p>Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]</p>
 *
 * Example 3:
 * <p>Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz",
 * "11","Fizz","13","14","FizzBuzz"]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 10^4
 *      </li>
 * </ul>
 *
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
