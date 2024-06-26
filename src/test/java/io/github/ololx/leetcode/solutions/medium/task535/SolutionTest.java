package io.github.ololx.leetcode.solutions.medium.task535;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 23.04.2022 19:09
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesUrls")
    public static Object[][] providesUrls() {
        return new Object[][] {
                {"https://leetcode.com/problems/design-tinyurl", "http://tinyurl.com/-1163677885"}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesUrls")
    public void encode_whenLongUrlIsNotNull_thenReturnTinyUrl(String longUrl, String shortUrl) {
        assertEquals(new Solution.Codec().encode(longUrl), shortUrl);
    }

    @Test(timeOut = 3000L, dataProvider = "providesUrls")
    public void decode_whenLongUrlIsNotNull_thenReturnTinyUrl(String longUrl, String shortUrl) {
        //We need to create short url and add the hash
        Solution.Codec codec = new Solution.Codec();
        codec.encode(longUrl);

        assertEquals(new Solution.Codec().decode(shortUrl), longUrl);
    }
}
