package io.github.ololx.leetcode.examples.medium.task535;

import java.util.HashMap;
import java.util.Map;

/**
 * 535. Encode and Decode TinyURL
 *
 * Note: This is a companion problem to the System Design problem: Design TinyURL.
 *
 * TinyURL is a URL shortening service where you enter a URL such
 * as https://leetcode.com/problems/design-tinyurl and it returns
 * a short URL such as http://tinyurl.com/4e9iAk.
 * Design a class to encode a URL and decode a tiny URL.
 *
 * There is no restriction on how your encode/decode algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL
 * and the tiny URL can be decoded to the original URL.
 *
 * Implement the Solution class:
 * <ul>
 *      <li>
 *          Solution() Initializes the object of the system.
 *      </li>
 *      <li>
 *          String encode(String longUrl) Returns a tiny URL for the given longUrl.
 *      </li>
 *      <li>
 *          String decode(String shortUrl) Returns the original long URL for the given shortUrl.
 *          It is guaranteed that the given shortUrl was encoded by the same object.
 *      </li>
 * </ul>
 *
 * Example 1:
 * <p>Input: url = "https://leetcode.com/problems/design-tinyurl"
 * Output: "https://leetcode.com/problems/design-tinyurl"
 *
 * Explanation:
 * Solution obj = new Solution();
 * string tiny = obj.encode(url); // returns the encoded tiny url.
 * string ans = obj.decode(tiny); // returns the original url after deconding it.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= url.length <= 10^4
 *      </li>
 *      <li>
 *          url is guranteed to be a valid URL.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 23.04.2022 18:55
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class Codec {

        private static final String baseUrl = "http://tinyurl.com";

        private static final Map<Integer, String> urls = new HashMap<>();

        public String encode(String longUrl) {
            if (longUrl == null) {
                return longUrl;
            }

            int hash = longUrl.hashCode();
            urls.put(longUrl.hashCode(), longUrl);

            return baseUrl + "/" + hash;
        }

        public String decode(String shortUrl) {
            if (shortUrl == null) {
                return shortUrl;
            }

            int hash = Integer.parseInt(shortUrl.substring(shortUrl.lastIndexOf("/") + 1, shortUrl.length()));
            String longUrl = urls.get(hash);

            return longUrl != null ? longUrl : shortUrl;
        }
    }
}
