package io.github.ololx.leetcode.solutions.hard.task68;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.hard.task68.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.10.2022 19:34
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesWordsAndMaxWidth")
    public static Object[][] providesWordsAndMaxWidth() {
        return new Object[][] {
                {
                    new String[] {"This", "is", "an", "example", "of", "text", "justification."},
                        16,
                        List.of(
                                "This    is    an",
                                "example  of text",
                                "justification.  "
                        )
                }
        };
    }

    @LogParam
    @Test(dataProvider = "providesWordsAndMaxWidth")
    public void test(String[] words, int maxWidth, List<String> expected) {
        assertEquals(new Solution().fullJustify(words, maxWidth), expected);
    }
}
