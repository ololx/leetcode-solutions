package io.github.ololx.leetcode.examples.easy.task412;

import io.github.ololx.leetcode.examples.easy.task412.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.08.2022 08:23
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {1, List.of("1")},
                {2, List.of("1", "2")},
                {3, List.of("1", "2", "Fizz")},
                {4, List.of("1", "2", "Fizz", "4")},
                {5, List.of("1", "2", "Fizz", "4", "Buzz")},
                {
                    15,
                        List.of(
                                "1", "2", "Fizz", "4", "Buzz",
                                "Fizz", "7", "8", "Fizz", "Buzz",
                                "11", "Fizz", "13", "14", "FizzBuzz"
                        )
                },
        };
    }

    @Test(dataProvider = "providesN")
    public void fizzBuzz_whenNMoreThanZero_thenReturnFizzBuzzString(int n , List<String> expected) {
        assertEquals(new Solution().fizzBuzz(n), expected);
    }
}
