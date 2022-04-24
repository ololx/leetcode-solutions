package io.github.ololx.leetcode.examples.hard.task1206;

import java.util.Objects;

/*
 * 1206. Design Skiplist
 */
public class Solution {

    public static class Skiplist {

        public static final int MAX_LEVEL = 8;

        private final int levels;

        private SkipListEntry list;

        public Skiplist() {
            this(MAX_LEVEL);
        }

        public Skiplist(int levels) {
            final SkipListEntry head = new SkipListEntry(Integer.MIN_VALUE, Integer.MIN_VALUE);
            final SkipListEntry tail = new SkipListEntry(Integer.MAX_VALUE, Integer.MAX_VALUE);
            head.setRight(tail);
            tail.setLeft(head);
            this.list = head;

            this.levels = levels;
        }

        public boolean search(int target) {

            return false;
        }

        public void add(int num) {

        }

        public boolean erase(int num) {

            return false;
        }

        public static class SkipListEntry {

            private final int key;

            private final int value;

            private SkipListEntry up;

            private SkipListEntry down;

            private SkipListEntry left;

            private SkipListEntry right;

            public SkipListEntry(int key, int value) {
                this(key, value, null, null, null, null);
            }

            public SkipListEntry(int key,
                                 int value,
                                 SkipListEntry left,
                                 SkipListEntry right) {
                this(key, value, left, right, null, null);
            }

            public SkipListEntry(int key,
                                 int value,
                                 SkipListEntry left,
                                 SkipListEntry right,
                                 SkipListEntry up,
                                 SkipListEntry down) {
                this.key = Objects.requireNonNull(key);
                this.value = value;
                this.left = left;
                this.right = right;
                this.up = up;
                this.down = down;
            }

            public int getKey() {
                return this.key;
            }

            public int getValue() {
                return this.value;
            }

            public SkipListEntry getLeft() {
                return this.left;
            }

            public void setLeft(SkipListEntry entry) {
                this.left = Objects.requireNonNull(entry);
            }

            public SkipListEntry getRight() {
                return this.right;
            }

            public void setRight(SkipListEntry entry) {
                this.right = Objects.requireNonNull(entry);
            }

            public SkipListEntry getUp() {
                return this.up;
            }

            public void setUp(SkipListEntry entry) {
                this.up = Objects.requireNonNull(entry);
            }

            public SkipListEntry getDown() {
                return this.down;
            }

            public void setDown(SkipListEntry entry) {
                this.down = Objects.requireNonNull(entry);
            }

            public boolean hasLeft() {
                return this.left != null;
            }

            public boolean hasRight() {
                return this.right != null;
            }

            public boolean hasUp() {
                return this.up != null;
            }

            public boolean hasDown() {
                return this.down != null;
            }
        }
    }
}
