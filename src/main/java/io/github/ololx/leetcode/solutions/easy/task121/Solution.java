package io.github.ololx.leetcode.solutions.easy.task121;

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
 * to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 * <p>Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.</p>
 *
 * Example 2:
 * <p>Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= prices.length <= 105
 *     </li>
 *     <li>
 *         0 <= prices[i] <= 104
 *     </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 05/05/2024 9:29am
 */
public class Solution {

    public int maxProfit(int[] prices) {
        var minimumPrice = Integer.MAX_VALUE;
        var profit = 0;

        for (var currentPrice : prices) {
            minimumPrice = Math.min(minimumPrice, currentPrice);
            profit = Math.max(profit, currentPrice - minimumPrice);
        }

        return profit;
    }
}
