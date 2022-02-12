package io.github.ololx.leetcode.examples.easy.task278;

/**
 * 278. First Bad Version
 *
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after
 * a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number
 * of calls to the API.
 *
 * Example 1:
 * <p>Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.</p>
 *
 * Example 2:
 * <p>Input: n = 1, bad = 1
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= bad <= n <= 2^31 - 1
 *      </li>
 * </ul>
 *
 * @implNote The isBadVersion API is defined in the parent class VersionControl.
 * boolean isBadVersion(int version);
 *
 * project leetcode-solutions
 * created 10.02.2022 17:40
 *
 * @author Alexander A. Kropotin
 */
public class Solution extends VersionControl {

    public Solution(int badVersionNumber) {
        super(badVersionNumber);
    }

    public int firstBadVersion(int n) {
        int firstVersion = 1;
        int lastVersion = n;

        while (lastVersion > firstVersion) {
            int medianVersion = firstVersion + (lastVersion - firstVersion) / 2;

            if (isBadVersion(medianVersion)) {
                lastVersion = medianVersion;
            } else {
                firstVersion = ++medianVersion;
            }
        }

        return firstVersion;
    }
}
