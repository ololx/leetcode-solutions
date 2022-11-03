package io.github.ololx.leetcode.solutions.easy.task492;

/**
 * 492. Construct the Rectangle
 *
 * A web developer needs to know how to design a web page's size.
 * So, given a specific rectangular web page’s area, your job by now is
 * to design a rectangular web page, whose length L and width W satisfy
 * the following requirements:
 *
 * <ul>
 *     <li>
 *         The area of the rectangular web page you designed must equal to the given target area.
 *     </li>
 *     <li>
 *         The width W should not be larger than the length L, which means L >= W.
 *     </li>
 *     <li>
 *         The difference between length L and width W should be as small as possible.
 *     </li>
 * </ul>
 *
 * Return an array [L, W] where L and W are the length and width of the web page
 * you designed in sequence.
 *
 * Example 1:
 * <p>Input: area = 4
 * Output: [2,2]
 * Explanation: The target area is 4, and all the possible ways to construct
 * it are [1,4], [2,2], [4,1].
 * But according to requirement 2, [1,4] is illegal;
 * according to requirement 3,  [4,1] is not optimal compared to [2,2].
 * So the length L is 2, and the width W is 2.</p>
 *
 * Example 2:
 * <p>Input: area = 37
 * Output: [37,1]</p>
 *
 * Example 3:
 * <p>Input: area = 122122
 * Output: [427,286]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= area <= 10^7
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 01.11.2022 21:44
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area) + 1;

        while (--w > 0) {
            int l = area / w;

            if (l * w == area) {
                return new int[] {l, w};
            }
        }

        return new int[] {area, 1};
    }
}
