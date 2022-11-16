package io.github.ololx.leetcode.solutions.easy.task2469;

import java.util.function.Function;

/**
 * 2469. Convert the Temperature
 *
 * You are given a non-negative floating point number rounded to two decimal
 * places celsius, that denotes the temperature in Celsius.
 *
 * You should convert Celsius into Kelvin and Fahrenheit and return
 * it as an array ans = [kelvin, fahrenheit].
 *
 * Return the array ans. Answers within 10-5 of the actual answer will be accepted.
 *
 * Note that:
 * <ol>
 *     <li>
 *         Kelvin = Celsius + 273.15
 *     </li>
 *     <li>
 *         Fahrenheit = Celsius * 1.80 + 32.00
 *     </li>
 * </ol>
 *
 * Example 1:
 * <p>Input: celsius = 36.50
 * Output: [309.65000,97.70000]
 * Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65
 * and converted in Fahrenheit is 97.70.</p>
 *
 * Example 2:
 * <p>Input: celsius = 122.11
 * Output: [395.26000,251.79800]
 * Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26
 * and converted in Fahrenheit is 251.798.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          0 <= celsius <= 1000
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 16/11/2022 16:10
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    private static final Function<Double, Double> convertCelsiusToKelvin = t -> t + 273.15;

    private static final Function<Double, Double> convertCelsiusToFahrenheit = t -> t * 1.80 + 32.00;

    public double[] convertTemperature(double celsius) {
        return new double[] {
                convertCelsiusToKelvin.apply(celsius),
                convertCelsiusToFahrenheit.apply(celsius)
        };
    }
}
