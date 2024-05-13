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
package io.github.ololx.leetcode.solutions.easy.task415;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 19.04.2022 22:24
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNumbers")
    public static Object[][] providesNumbers() {
        return new Object[][] {
                {"456", "77", "533"},
                {"11", "123", "134"},
                {"0", "0", "0"}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesNumbers")
    public void addString_whenNumberIsNotNull_thenReturnSumOf(String num1, String num2, String expected) {
        assertEquals(new Solution().addStrings(num1, num2), expected);
    }
}
