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

package io.github.ololx.leetcode.solutions.medium.task1306;

/**
 * 1306. Jump Game III
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 07/05/2024 3:17pm
 */
public class Solution {

    public boolean canReach(int[] arr, int start) {
        return canReach(arr, start, new int[arr.length]);
    }

    public boolean canReach(int[] arr, int i, int[] visited) {
        if (i < 0 || i >= arr.length) {
            return false;
        } else if (visited[i] == 1) {
            return false;
        }

        if (arr[i] == 0) {
            return true;
        }

        visited[i] = 1;

        return canReach(arr, i + arr[i], visited) || canReach(arr, i - arr[i], visited);
    }
}
