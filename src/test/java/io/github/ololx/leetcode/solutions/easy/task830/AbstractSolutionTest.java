package io.github.ololx.leetcode.solutions.easy.task830;

import org.testng.annotations.DataProvider;

import java.util.List;

/**
 * project leetcode-solutions
 * created 09.10.2022 21:20
 *
 * @author Alexander A. Kropotin
 */
public class AbstractSolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"aaa", List.of(List.of(0, 2))},
                {"babaaaabbb", List.of(List.of(3, 6), List.of(7, 9))}
        };
    }
}
