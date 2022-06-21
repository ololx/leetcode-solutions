package io.github.ololx.leetcode.examples.easy.task557;

import org.testng.annotations.DataProvider;

/**
 * project leetcode-solutions
 * created 01.06.2022 14:08
 *
 * @author Alexander A. Kropotin
 */
public abstract class AbstractSolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"},
                {"God Ding", "doG gniD"}
        };
    }
}
