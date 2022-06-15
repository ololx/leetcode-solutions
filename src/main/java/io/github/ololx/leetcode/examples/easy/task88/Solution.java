package io.github.ololx.leetcode.examples.easy.task88;

/**
 * 88. Merge Sorted Array
 *
 * You are given two integer arrays nums1 and nums2, sorted in
 * non-decreasing order, and two integers m and n, representing the number
 * of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1. To accommodate this,
 * nums1 has a length of m + n, where the first m elements denote
 * the elements that should be merged, and the last n elements are
 * set to 0 and should be ignored. nums2 has a length of n.
 *
 * Example 1:
 * <p>Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined
 * elements coming from nums1.</p>
 *
 * Example 2:
 * <p>Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].</p>
 *
 * Example 3:
 * <p>Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1.
 * The 0 is only there to ensure the merge result can fit in nums1.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          nums1.length == m + n
 *      </li>
 *      <li>
 *          nums2.length == n
 *      </li>
 *      <li>
 *          0 <= m, n <= 200
 *      </li>
 *      <li>
 *          1 <= m + n <= 200
 *      </li>
 *      <li>
 *          -10^9 <= nums1[i], nums2[j] <= 10^9
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 15.06.2022 17:44
 *
 * @author Alexander A. Kropotin
 */
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m - 1, nums2Pointer = n - 1, mainPointer = (m + n);

        while (--mainPointer >= 0 && nums1Pointer >= 0 && nums2Pointer >= 0) {
            if (nums1[nums1Pointer] < nums2[nums2Pointer]) {
                nums1[mainPointer] = nums2[nums2Pointer];
                nums2Pointer--;
            } else {
                nums1[mainPointer] = nums1[nums1Pointer];
                nums1Pointer--;
            }
        }

        while (nums2Pointer >= 0) {
            nums1[mainPointer] = nums2[nums2Pointer];
            nums2Pointer--;
            mainPointer--;
        }
    }
}