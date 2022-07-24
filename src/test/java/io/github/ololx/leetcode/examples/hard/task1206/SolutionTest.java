package io.github.ololx.leetcode.examples.hard.task1206;

import org.testng.annotations.Test;

/**
 * project leetcode-solutions
 * created 27.03.2022 18:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test(enabled = true)
    public void test() {
        Solution.Skiplist skiplist = new Solution.Skiplist();

        skiplist.add(3);
        skiplist.add(2);
        skiplist.add(13);
        skiplist.add(5);

        skiplist.search(3);
    }
}

