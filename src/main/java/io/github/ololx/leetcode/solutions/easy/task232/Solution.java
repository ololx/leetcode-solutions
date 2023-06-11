package io.github.ololx.leetcode.solutions.easy.task232;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 *
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue
 * (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 * <ol>
 *     <li>void push(int x) Pushes element x to the back of the queue.</li>
 *     <li>int pop() Removes the element from the front of the queue and returns it.</li>
 *     <li></li>
 *     <li>int peek() Returns the element at the front of the queue.</li>
 *     <li>boolean empty() Returns true if the queue is empty, false otherwise.</li>
 * </ol>
 *
 * Notes:
 * <ol>
 *     <li>You must use only standard operations of a stack, which means only push
 *     to top, peek/pop from top, size, and is empty operations are valid.</li>
 *     <li>Depending on your language, the stack may not be supported natively.
 *     You may simulate a stack using a list or deque (double-ended queue) as long
 *     as you use only a stack's standard operations.</li>
 * </ol>
 *
 * Example 1:
 * <p>Input
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 1, 1, false]
 *
 * Explanation
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1); // queue is: [1]
 * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
 * myQueue.peek(); // return 1
 * myQueue.pop(); // return 1, queue is [2]
 * myQueue.empty(); // return false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= x <= 9
 *      </li>
 *      <li>
 *          At most 100 calls will be made to push, pop, peek, and empty.
 *      </li>
 *      <li>
 *          All the calls to pop and peek are valid.
 *      </li>
 * </ul>
 *
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 *
 * project leetcode-solutions
 * created 11.06.2023 10:35
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    static class MyQueue {

        private final Stack<Integer> values = new Stack<>();

        public void push(int x) {
            Stack<Integer> tmpValues = new Stack<>();

            //read all stored elements and put all in new stack in reverse order:
            // a) read from top to tail (where on top stored newest elements)
            // b) write all values in new order (where on top stored oldest elements)
            // * delete all readed values from stack
            while (!this.values.isEmpty()) {
                tmpValues.push(values.pop());
            }

            // add new value on the top on a stack (it will ne first value on stored stack)
            this.values.push(x);

            // Move all elements back from the tmp stack to the stored, where:
            // a) new value x will be on the tail of stored values
            // b) all stored values will store like FIFO
            while (!tmpValues.isEmpty()) {
                this.values.push(tmpValues.pop());
            }
        }

        public int pop() {
            return values.pop();
        }

        public int peek() {
            return values.peek();
        }

        public boolean empty() {
            return values.isEmpty();
        }
    }
}
