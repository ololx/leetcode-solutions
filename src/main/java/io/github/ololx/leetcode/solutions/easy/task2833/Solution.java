package io.github.ololx.leetcode.solutions.easy.task2833;

/**
 * 2833. Furthest Point From Origin
 *
 * You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your
 * movement on a number line starting from the origin 0.
 *
 * In the ith move, you can choose one of the following directions:
 * <ul>
 *      <li>
 *          move to the left if moves[i] = 'L' or moves[i] = '_'
 *      </li>
 *      <li>
 *          move to the right if moves[i] = 'R' or moves[i] = '_'
 *      </li>
 * </ul>
 * Return the distance from the origin of the furthest point you can get to after n moves.
 *
 * Example 1:
 * <p>Input: moves = "L_RL__R"
 * Output: 3
 * Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves
 * "LLRLLLR".</p>
 *
 * Example 2:
 * <p>Input: moves = "_R__LL_"
 * Output: 5
 * Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves
 * "LRLLLLL".</p>
 *
 * Example 3:
 * <p>Input: moves = "_______"
 * Output: 7
 * Explanation: The furthest point we can reach from the origin 0 is point 7 through the following sequence of moves
 * "RRRRRRR".</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= moves.length == n <= 50
 *      </li>
 *      <li>
 *          moves consists only of characters 'L', 'R' and '_'.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 28.08.2023 21:19
 *
 * @author Alexander A. Kropotin
 */
class Solution {

    public int furthestDistanceFromOrigin(String moves) {
        int leftMoveCount = 0;
        int rightMoveCount = 0;

        for (char move : moves.toCharArray()) {
            leftMoveCount += move == 'L' ? 1 : 0;
            rightMoveCount += move == 'R' ? 1 : 0;
        }

        return (moves.length() - (leftMoveCount + rightMoveCount)) +
            (Math.max(leftMoveCount, rightMoveCount) - Math.min(leftMoveCount, rightMoveCount));
    }
}
