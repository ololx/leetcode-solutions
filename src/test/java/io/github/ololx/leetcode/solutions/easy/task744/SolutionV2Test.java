package io.github.ololx.leetcode.solutions.easy.task744;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.05.2022 16:49
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2Test extends AbstractSolutionTest {

    @LogParam
    @Test(dataProvider = "providesLettersAndTarget")
    public void nextGreatestLetter_whenGreatestLetterExists_thenReturnIt(char[] letters,
                                                                         char target,
                                                                         char expected) {
        assertEquals(new SolutionV2().nextGreatestLetter(letters, target), expected);
    }
}
