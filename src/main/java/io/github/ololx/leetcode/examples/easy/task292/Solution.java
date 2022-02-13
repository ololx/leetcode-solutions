package io.github.ololx.leetcode.examples.easy.task292;

/**
 * 292. Nim Game
 *
 * You are playing the following Nim Game with your friend:
 * <ul>
 *     <li>
 *         Initially, there is a heap of stones on the table.
 *     </li>
 *     <li>
 *         You and your friend will alternate taking turns, and you go first.
 *     </li>
 *     <li>
 *         On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
 *     </li>
 *     <li>
 *         The one who removes the last stone is the winner.
 *     </li>
 * </ul>
 *
 * Given n, the number of stones in the heap, return true if you can win the game assuming
 * both you and your friend play optimally, otherwise return false.
 *
 * Example 1:
 * <p>Input: n = 4
 * Output: false
 * Explanation: These are the possible outcomes:
 * 1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
 * 2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
 * 3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
 * In all outcomes, your friend wins.</p>
 *
 * Example 2:
 * <p>Input: n = 1
 * Output: true</p>
 *
 * Example 3:
 * <p>Input: n = 2
 * Output: true</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= n <= 2^31 - 1
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 12.02.2022 15:44
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
