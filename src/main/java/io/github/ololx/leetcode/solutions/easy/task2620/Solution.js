/**
 * 2620. Counter
 *
 * Given an integer n, return a counter function. This counter function
 * initially returns n and then returns 1 more than the previous value every
 * subsequent time it is called (n, n + 1, n + 2, etc).
 *
 * project leetcode-solutions
 * created 18.05.2023 11:33
 *
 * @author Alexander A. Kropotin
 *
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var count = n;

    return function() {
        return count++;
    };
};

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
