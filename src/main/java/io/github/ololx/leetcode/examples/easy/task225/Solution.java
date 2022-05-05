package io.github.ololx.leetcode.examples.easy.task225;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 225. Implement Stack using Queues
 *
 * mplement a last-in-first-out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal
 * stack (push, top, pop, and empty).
 *
 * Implement the MyStack class:
 * <ul>
 *     <li>
 *         void push(int x) Pushes element x to the top of the stack.
 *     </li>
 *     <li>
 *         int pop() Removes the element on the top of the stack and returns it.
 *     </li>
 *     <li>
 *         int top() Returns the element on the top of the stack.
 *     </li>
 *     <li>
 *         boolean empty() Returns true if the stack is empty, false otherwise.
 *     </li>
 * </ul>
 *
 * Notes:
 * <ul>
 *     <li>
 *         You must use only standard operations of a queue, which means
 *         that only push to back, peek/pop from front, size and
 *         is empty operations are valid.
 *     </li>
 *     <li>
 *         Depending on your language, the queue may not be supported natively.
 *         You may simulate a queue using a list or deque (double-ended queue)
 *         as long as you use only a queue's standard operations.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 2, 2, false]
 *
 * Explanation
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // return 2
 * myStack.pop(); // return 2
 * myStack.empty(); // return False</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= x <= 9
 *      </li>
 *      <li>
 *          At most 100 calls will be made to push, pop, top, and empty.
 *      </li>
 *      <li>
 *         All the calls to pop and top are valid.
 *      </li>
 * </ul>
 *
 * Follow-up: Can you implement the stack using only one queue?
 *
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 *
 * project leetcode-solutions
 * created 05.05.2022 13:12
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static class MyStack {

        public static final int DEFAULT_INITIAL_SIZE = 2;

        private final Deque<Integer> values;

        public MyStack() {
            this(DEFAULT_INITIAL_SIZE);
        }

        public MyStack(int size) {
            this.values = new ArrayDeque(size);
        }

        public void push(int x) {
            this.values.add(x);
        }

        public int pop() {
            return this.values.pollLast();
        }

        public int top() {
            return this.values.getLast();
        }

        public boolean empty() {
            return this.values.isEmpty();
        }
    }
}
