/**
 * Copyright 2022 the project leetcode-solutions authors
 * and the original author or authors annotated by {@author}
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.ololx.leetcode.solutions.easy.task1534;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 23/11/2022 16:33
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesArraysAndABC")
    public static Object[][] providesArraysAndABC() {
        return new Object[][] {
                {new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3, 4},
                {new int[] {1, 1, 2, 2, 3}, 0, 0, 1, 0}
        };
    }

    @LogParam
    @Test(dataProvider = "providesArraysAndABC")
    public void countGoodTriplets_whenGoodTripletsAreExist_thenReturnCountOfAll(int[] arr,
                                                                                int a,
                                                                                int b,
                                                                                int c,
                                                                                int expected) {
        assertEquals(new Solution().countGoodTriplets(arr, a, b , c), expected);
    }
}
