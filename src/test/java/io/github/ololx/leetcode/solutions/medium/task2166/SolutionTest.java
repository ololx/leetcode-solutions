package io.github.ololx.leetcode.solutions.medium.task2166;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.medium.task2166.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * project leetcode-solutions
 * created 17.03.2023 13:55
 * 
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesSizes() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {100, 100},
                {Integer.MAX_VALUE, Integer.MAX_VALUE}
        };
    }

    @LogParam
    @Test(dataProvider = "providesSizes")
    public void size_whenBitSetCreated_thenReturnCorrectSize(int size, int expected) {
        assertEquals(new Solution.Bitset(size).size(), expected);
    }

    @DataProvider
    public static Object[][] providesSizesAndWordsCounts() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 1},
                {100, 2},
                {200, 4},
        };
    }

    @LogParam
    @Test(dataProvider = "providesSizesAndWordsCounts")
    public void words_whenBitSetCreated_thenReturnCorrectWordsCount(int size, int expected) {
        assertEquals(new Solution.Bitset(size).words(), expected);
    }

    @DataProvider
    public static Object[][] providesSizesAndIndexes() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {100, 3},
                {200, 4},
        };
    }

    @LogParam
    @Test(dataProvider = "providesSizesAndIndexes")
    public void fix_whenFixConcreteBit_thenBitIsOne(int size, int idx) {
        var bs = new Solution.Bitset(size);
        bs.fix(idx);
    }


    @LogParam
    @Test(dataProvider = "providesSizesAndIndexes")
    public void unfix_whenUnfixConcreteBit_thenBitIsZero(int size, int idx) {
        var bs = new Solution.Bitset(size);
        bs.fix(idx);
        bs.unfix(idx);
    }

    @LogParam
    @Test(dataProvider = "providesSizesAndIndexes")
    public void flip_whenUnfixConcreteBit_thenBitIsZero(int size, int idx) {
        var bs = new Solution.Bitset(size);
        bs.flip();
    }

    @LogParam
    @Test(dataProvider = "providesSizesAndIndexes")
    public void all_whenUnfixConcreteBit_thenBitIsZero(int size, int idx) {
        var bs = new Solution.Bitset(size);

        bs.fix(idx);
        assertFalse(bs.all());

        bs.flip();
        assertFalse(bs.all());

        bs.fix(idx);
        assertTrue(bs.all());
    }

    @LogParam
    @Test(dataProvider = "providesSizesAndIndexes")
    public void one_whenUnfixConcreteBit_thenBitIsZero(int size, int idx) {
        var bs = new Solution.Bitset(size);

        bs.fix(idx);
        assertTrue(bs.one());

        bs.flip();
        assertTrue(bs.one());

        bs.fix(idx);
        bs.flip();
        assertFalse(bs.one());
    }
}
