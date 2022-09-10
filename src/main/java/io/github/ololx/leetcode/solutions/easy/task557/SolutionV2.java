package io.github.ololx.leetcode.solutions.easy.task557;

/**
 * 557. Reverse Words in a String III
 *
 * Given a string s, reverse the order of characters in each word within
 * a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * <p>Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"</p>
 *
 * Example 2:
 * <p>Input: s = "God Ding"
 * Output: "doG gniD"</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= s.length <= 5 * 10^4
 *      </li>
 *      <li>
 *          s contains printable ASCII characters.
 *      </li>
 *      <li>
 *          s does not contain any leading or trailing spaces.
 *      </li>
 *      <li>
 *          There is at least one word in s.
 *      </li>
 *      <li>
 *          All the words in s are separated by a single space.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 01.06.2022 14:08
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public String reverseWords(String s) {
        StringBuilder reversedString = new StringBuilder();
        StringBuilder reversedWord = new StringBuilder();

        for (int currentIndex = 0; currentIndex < s.length(); currentIndex++) {
            if (s.charAt(currentIndex) == ' ') {
                reversedString.append(reversedWord.append(' '));
                reversedWord = new StringBuilder();
            } else if (currentIndex == s.length() - 1) {
                reversedString.append(reversedWord.insert(0, s.charAt(currentIndex)));
                reversedWord = new StringBuilder();
            } else {
                reversedWord.insert(0, s.charAt(currentIndex));
            }
        }

        return reversedString.toString();
    }
}
