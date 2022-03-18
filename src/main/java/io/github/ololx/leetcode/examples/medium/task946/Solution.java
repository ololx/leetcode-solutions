package io.github.ololx.leetcode.examples.medium.task946;

import java.util.Stack;

/*
 * 946. Validate Stack Sequences
 */
public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pushedStack = new Stack<>();

        int j = 0;

        for (int i = 0; i < pushed.length; i++) {
            pushedStack.push(pushed[i]);

            if (popped[j] == pushed[i]) {
                while (!pushedStack.isEmpty() && pushedStack.peek() == popped[j]) {
                    pushedStack.pop();
                    j++;
                }
            }
        }

        return pushedStack.isEmpty();
    }
}
