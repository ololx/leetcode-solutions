package io.github.ololx.leetcode.solutions.medium.task2166;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * project leetcode-solutions
 * created 17.03.2023 13:55
 * 
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesSize() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2},
                {100, 100}
        };
    }

    //@LogParam
    @Test(dataProvider = "providesSize")
    public void size_whenBitSetCreated_thenReturnCorrectSize(int size, int expected) {
        assertEquals(new Solution.Bitset(size).size(), expected);
    }

    @DataProvider
    public static Object[][] providesDataForFixTest() {
        return new Object[][] {
                {1, 0, "1"},
                {2, 1, "01"},
                {5, 3, "00010"},
                {10, 4, "0000100000"},
        };
    }

    //@LogParam
    @Test(dataProvider = "providesDataForFixTest")
    public void fix_whenFixConcreteBit_thenBitIsOne(int size, int idx, String expectedStr) {
        var bs = new Solution.Bitset(size);
        bs.fix(idx);
        
        assertEquals(bs.toString(), expectedStr);
    }

    @DataProvider
    public static Object[][] providesDataForUnfixTest() {
        return new Object[][] {
                {1, 0, "0"},
                {2, 1, "10"},
                {5, 3, "11101"},
                {10, 4, "1111011111"},
        };
    }

    //@LogParam
    @Test(dataProvider = "providesDataForUnfixTest")
    public void unfix_whenUnfixConcreteBit_thenBitIsZero(int size, int idx, String expectedStr) {
        var bs = new Solution.Bitset(size);
        bs.flip();
        bs.unfix(idx);

        assertEquals(bs.toString(), expectedStr);
    }

    @DataProvider
    public static Object[][] providesDataForFlipTest() {
        return new Object[][] {
                {1, 0, "1"},
                {2, 1, "11"},
                {5, 3, "11111"},
                {10, 4, "1111111111"},
        };
    }

    //@LogParam
    @Test(dataProvider = "providesDataForFlipTest")
    public void flip_whenUnfixConcreteBit_thenBitIsZero(int size, int idx, String expectedStr) {
        var bs = new Solution.Bitset(size);
        bs.flip();

        assertEquals(bs.toString(), expectedStr);
    }

    //@LogParam
    @Test
    public void all_whenUnfixConcreteBit_thenBitIsZero() {
        var bs = new Solution.Bitset(3);

        bs.fix(0);
        assertFalse(bs.all());

        bs.flip();
        assertFalse(bs.all());

        bs.fix(0);
        assertTrue(bs.all());
    }

    //@LogParam
    @Test
    public void one_whenUnfixConcreteBit_thenBitIsZero() {
        var bs = new Solution.Bitset(3);

        bs.fix(0);
        assertTrue(bs.one());

        bs.flip();
        assertTrue(bs.one());

        bs.fix(0);
        bs.flip();
        assertFalse(bs.one());
    }
}
