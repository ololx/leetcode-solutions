package io.github.ololx.leetcode.examples.hard.task1206;

import io.github.ololx.leetcode.examples.hard.task1206.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 27.03.2022 18:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    public void test() {
        Solution.Skiplist skiplist = new Solution.Skiplist();

        skiplist.add(3);
        skiplist.add(13);
        skiplist.add(5);

        skiplist.search(3);
    }
}

