package io.github.ololx.leetcode.solutions.easy.task118;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *    1
 *   1 1
 *  1 2 1
 * 1 3 3 1
 *
 * Example1:
 * <p>Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]</p>
 *
 * Example2:
 * <p>Input: numRows = 1
 * Output: [[1]]</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= numRows <= 30
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 20.07.2022 11:08
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> triangle = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            final List<Integer> currentRow = new ArrayList<>();

            for (int columnIndex = 0; columnIndex <= rowIndex; columnIndex++) {
                if (rowIndex == 0 || columnIndex == 0 || columnIndex == rowIndex) {
                    currentRow.add(columnIndex, 1);

                    continue;
                }

                final List<Integer> previousRow = triangle.get(rowIndex - 1);
                currentRow.add(previousRow.get(columnIndex - 1) + previousRow.get(columnIndex));
            }

            triangle.add(currentRow);
        }

        return triangle;
    }
}
