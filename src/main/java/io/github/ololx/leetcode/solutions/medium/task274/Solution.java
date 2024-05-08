package io.github.ololx.leetcode.solutions.medium.task274;

import java.util.Arrays;

/**
 * 274. H-Index
 *
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their
 * ith paper, return the researcher's h-index.
 *
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the
 * given researcher has published at least h papers that have each been cited at least h times.
 *
 * Example 1:
 * <p>Input: citations = [3,0,6,1,5]
 * Output: 3
 * Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5
 * citations respectively.
 * Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations
 * each, their h-index is 3.</p>
 *
 * Example 2:
 * <p>Input: citations = [1,3,1]
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          n == citations.length
 *      </li>
 *      <li>
 *          1 <= n <= 5000
 *      </li>
 *      <li>
 *          0 <= citations[i] <= 1000
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 07/10/2023 4:53 pm
 */
public class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int citationsCount = citations.length;
        int hIndex = 0;

        for (int citationsIndex = 0; citationsIndex < citationsCount; citationsIndex++) {
            if (citations[citationsIndex] >= citationsCount - citationsIndex) {
                hIndex = citationsCount - citationsIndex;
                break;
            }
        }

        return hIndex;
    }
}
