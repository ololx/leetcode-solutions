package io.github.ololx.leetcode.examples.easy.task1694;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 23.02.2022 13:17
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "phoneNumbersAndReformatNumbers")
    public static Object[][] phoneNumbersAndReformatNumbers() {
        return new Object[][] {
                {"123 4-567", "123-45-67"},
                {"1-23-45 6", "123-456"},
                {"123 4-5678", "123-456-78"}
        };
    }

    @Test(dataProvider = "phoneNumbersAndReformatNumbers")
    public void reformatNumber_whenPhoneNumberIsNotBlank_thenReturnReformatNumber(String phoneNumber , String reformatNumber) {
        assertEquals(new Solution().reformatNumber(phoneNumber), reformatNumber);
    }
}
