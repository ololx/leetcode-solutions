/**
 * Copyright 2024 the project leetcode-solutions authors
 * and the original author or authors annotated by {@author}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.ololx.leetcode.solutions.medium.task695;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 13/05/2024 7:10am
 */
public class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int maxAreaOfIsland = 0;

        for (var x = 0; x < grid.length; x++) {
            for (var y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == 1) {
                    maxAreaOfIsland = Math.max(maxAreaOfIsland, calcAreaOfIsland(grid, x, y));
                }
            }
        }

        return maxAreaOfIsland;
    }

    public int calcAreaOfIsland(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length) {
            return 0;
        }

        if (grid[x][y] == 0) {
            return 0;
        }

        grid[x][y] = 0;

        var areaOfIsland = 1;
        areaOfIsland += calcAreaOfIsland(grid, x + 1, y);
        areaOfIsland += calcAreaOfIsland(grid, x - 1, y);
        areaOfIsland += calcAreaOfIsland(grid, x, y + 1);
        areaOfIsland += calcAreaOfIsland(grid, x, y - 1);

        return areaOfIsland;
    }
}
