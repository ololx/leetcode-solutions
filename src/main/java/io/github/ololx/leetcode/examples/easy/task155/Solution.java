package io.github.ololx.leetcode.examples.easy.task155;

import java.util.Stack;

/**
 * 155. Min Stack
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 * <ul>
 *     <li>
 *         MinStack() initializes the stack object.
 *     </li>
 *     <li>
 *         void push(int val) pushes the element val onto the stack.
 *     </li>
 *     <li>
 *         void pop() removes the element on the top of the stack.
 *     </li>
 *     <li>
 *         int top() gets the top element of the stack.
 *     </li>
 *     <li>
 *         int getMin() retrieves the minimum element in the stack.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * Output
 * [null,null,null,null,-3,null,0,-2]
 *
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          -2^31 <= val <= 2^31 - 1
 *      </li>
 *      <li>
 *          Methods pop, top and getMin operations will always
 *          be called on non-empty stacks.
 *      </li>
 *      <li>
 *          At most 3 * 10^4 calls will be made to push, pop, top, and getMin.
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 17.05.2022 21:45
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class MinStack {

        final Stack<Element> elements;

        public MinStack() {
            this.elements = new Stack<>();
        }

        public void push(int val) {
            Element element = null;

            if (this.elements.empty()) {
                element = new Element(val, val);
            } else {
                element = new Element (val, Math.min(val, this.elements.peek().minValue));
            }

            this.elements.push(element);
        }

        public void pop() {
            this.elements.pop();
        }

        public int top() {
            return this.elements.peek().value;
        }

        public int getMin() {
            return this.elements.peek().minValue;
        }

        private static final class Element {

            private final int value;

            private final int minValue;

            Element (int value, int minValue) {
                this.value = value;
                this.minValue = minValue;
            }
        }
    }
}
