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
package io.github.ololx.leetcode.solutions.easy.task2423;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 23.10.2022 18:00
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesWords")
    public static Object[][] providesWords() {
        return new Object[][] {
                {"abcc", true},
                {"bac", true},
                {"cccaa", true}
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesWords")
    public void equalFrequency_whendecOneFrequencyAndAllFrequenciesAreSame_thenReturnTrue(String word,
                                                                                          boolean expected) {
        assertEquals(new Solution().equalFrequency(word), expected);
    }
}
