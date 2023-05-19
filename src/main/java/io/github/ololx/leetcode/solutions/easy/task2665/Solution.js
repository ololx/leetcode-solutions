/**
 * 2665. Counter II
 *
 * project leetcode-solutions
 * created 19.05.2023 8:33
 *
 * @author Alexander A. Kropotin
 *
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
 var createCounter = function(init) {
     var count = init;

     return {
         increment: function() {
             return ++count;
         },

         decrement: function() {
             return --count;
         },

         reset: function() {
             count = init;
             return count;
         }
     };
 };

 /**
  * const counter = createCounter(5)
  * counter.increment(); // 6
  * counter.reset(); // 5
  * counter.decrement(); // 4
  */
