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
package io.github.ololx.leetcode.examples.medium.task12;

import io.github.ololx.leetcode.examples.medium.task12.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @project leetcode-solutions
 * @created 11.02.2022 19:14
 * <p>
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "integerAndRomanNumbers")
    public static Object[][] integerAndRomanNumbers() {
        return new Object[][] {
                {3, "III"},
                {58, "LVIII"},
                {33, "XXXIII"},
                {1994, "MCMXCIV"},
        };
    }

    @Test(dataProvider = "integerAndRomanNumbers")
    public void intToRoman_whenRomanNumberIsDefine_thenReturnNonZeroIntegerNumber(int integer, String roman) {
        assertEquals(new Solution().intToRoman(integer), roman);
    }
}
