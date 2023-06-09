package io.github.ololx.leetcode.solutions.easy.task744;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.05.2022 16:49
 *
 * @author Alexander A. Kropotin
 */
public class AbstractSolutionTest {

    @DataProvider(name = "providesLettersAndTarget")
    public static Object[][] providesLettersAndTarget() {
        return new Object[][] {
                {new char[] {'c','f','j'}, 'a', 'c'},
                {new char[] {'c','f','j'}, 'c', 'f'},
                {new char[] {'c','f','j'}, 'a', 'c'},
                {new char[] {'c','f','j'}, 'd', 'f'},
        };
    }
}
