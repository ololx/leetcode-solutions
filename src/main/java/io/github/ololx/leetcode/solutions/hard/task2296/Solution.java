package io.github.ololx.leetcode.solutions.hard.task2296;

import java.util.Objects;

/**
 * 2296. Design a Text Editor
 *
 * Design a text editor with a cursor that can do the following:
 * <ol>
 *     <li>
 *         Add text to where the cursor is.
 *     </li>
 *     <li>
 *         Delete text from where the cursor is (simulating the backspace key).
 *     </li>
 *     <li>
 *         Move the cursor either left or right.
 *     </li>
 * </ol>
 *
 * When deleting text, only characters to the left of the cursor will be deleted.
 * The cursor will also remain within the actual text and cannot be moved beyond it.
 * More formally, we have that 0 <= cursor.position <= currentText.length always holds.
 *
 * Implement the TextEditor class:
 * <ol>
 *     <li>
 *         TextEditor() Initializes the object with empty text.
 *     </li>
 *     <li>
 *         void addText(string text) Appends text to where the cursor is.
 *         The cursor ends to the right of text.
 *     </li>
 *     <li>
 *         int deleteText(int k) Deletes k characters to the left of the cursor.
 *         Returns the number of characters actually deleted.
 *     </li>
 *     <li>
 *         string cursorLeft(int k) Moves the cursor to the left k times.
 *         Returns the last min(10, len) characters to the left of the cursor,
 *         where len is the number of characters to the left of the cursor.
 *     </li>
 *     <li>
 *         string cursorRight(int k) Moves the cursor to the right k times.
 *         Returns the last min(10, len) characters to the left of the cursor,
 *         where len is the number of characters to the left of the cursor.
 *     </li>
 * </ol>
 *
 * Example 1:
 * <p>Input
 * ["TextEditor", "addText", "deleteText", "addText", "cursorRight", "cursorLeft", "deleteText",
 * "cursorLeft", "cursorRight"]
 * [[], ["leetcode"], [4], ["practice"], [3], [8], [10], [2], [6]]
 * Output
 * [null, null, 4, null, "etpractice", "leet", 4, "", "practi"]
 *
 * Explanation
 * TextEditor textEditor = new TextEditor(); // The current text is "|".
 * (The '|' character represents the cursor) textEditor.addText("leetcode");
 * // The current text is "leetcode|".
 * textEditor.deleteText(4); // return 4
 *                           // The current text is "leet|".
 *                           // 4 characters were deleted.
 * textEditor.addText("practice"); // The current text is "leetpractice|".
 * textEditor.cursorRight(3); // return "etpractice"
 *                            // The current text is "leetpractice|".
 *                            // The cursor cannot be moved beyond the actual text
 *                            and thus did not move.
 *                            // "etpractice" is the last 10 characters to the left of the cursor.
 * textEditor.cursorLeft(8); // return "leet"
 *                           // The current text is "leet|practice".
 *                           // "leet" is the last min(10, 4) = 4 characters to the left of
 *                           the cursor.
 * textEditor.deleteText(10); // return 4
 *                            // The current text is "|practice".
 *                            // Only 4 characters were deleted.
 * textEditor.cursorLeft(2); // return ""
 *                           // The current text is "|practice".
 *                           // The cursor cannot be moved beyond the actual text and thus
 *                           did not move.
 *                           // "" is the last min(10, 0) = 0 characters to the left of the cursor.
 * textEditor.cursorRight(6); // return "practi"
 *                            // The current text is "practi|ce".
 *                            // "practi" is the last min(10, 6) = 6 characters
 *                            to the left of the cursor.</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= text.length, k <= 40
 *      </li>
 *      <li>
 *          text consists of lowercase English letters.
 *      </li>
 *      <li>
 *          At most 2 * 104 calls in total will be made to addText, deleteText,
 *          cursorLeft and cursorRight.
 *      </li>
 * </ul>
 *
 * Follow-up: Could you find a solution with time complexity of O(k) per call?
 *
 * project leetcode-solutions
 * created 15.12.2022 21:18
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    static class TextEditor {

        private final Node head = new Node(null);

        private final Node tail = new Node(null);

        private Node cursor = new Node('|');

        public TextEditor() {
            this.head.next = this.cursor;
            this.cursor.previous = this.head;
            this.tail.previous = this.cursor;
            this.cursor.next = this.tail;
        }

        public void addText(String text) {
            final char[] symbols = Objects.requireNonNull(text).toCharArray();

            for (char symbol : symbols) {
                final Node newNode = new Node(symbol, this.cursor.previous, this.cursor);
                this.cursor.previous.next = newNode;
                this.cursor.previous = newNode;
            }
        }

        public int deleteText(int k) {
            int deleted = 0;
            Node current = this.cursor.previous;

            while(deleted < k && current.previous != null && current.value != null) {
                current = current.previous;
                deleted++;
            }

            if (deleted > 0) {
                current.next = this.cursor;
                this.cursor.previous = current;
            }

            return deleted;
        }

        public String cursorLeft(int k) {
            int leftSteps = 0;
            Node current = this.cursor.previous;

            while(leftSteps < k && current.previous != null && current.value != null) {
                current = current.previous;
                leftSteps++;
            }

            if (leftSteps > 0) {
                this.cursor.previous.next = this.cursor.next;
                this.cursor.next.previous = this.cursor.previous;
                this.cursor.previous = current;
                this.cursor.next = current.next;
                current.next = this.cursor;
            }

            return this.getLeftText();
        }

        public String cursorRight(int k) {
            int rightSteps = 0;
            Node current = this.cursor.next;

            while(rightSteps < k && current.next != null && current.value != null) {
                current = current.next;
                rightSteps++;
            }

            if (rightSteps > 0) {
                this.cursor.previous.next = this.cursor.next;
                this.cursor.next.previous = this.cursor.previous;
                this.cursor.previous = current.previous;
                this.cursor.next = current;
                current.previous.next = this.cursor;
            }

            return this.getLeftText();
        }

        private String getLeftText() {
            StringBuilder leftText = new StringBuilder();

            int moveToLeft = 0;
            Node current = this.cursor.previous;

            while(moveToLeft < 10 && current.value != null) {
                leftText.insert(0, current.value);
                current = current.previous;
                moveToLeft++;
            }

            return leftText.toString();
        }

        @Override
        public String toString() {
            StringBuilder text = new StringBuilder();

            Node current = this.head.next;
            int i = 0;
            while(current.value != null) {
               text.append(current.value);
               current = current.next;
            }

            return text.toString();
        }

        static class Node {
            private final Character value;

            private Node next;

            private Node previous;

            private Node(Character value) {
                this(value, null, null);
            }

            private Node(Character value, Node previous, Node next) {
                this.value = value;
                this.previous = previous;
                this.next = next;
            }
        }
    }
}
