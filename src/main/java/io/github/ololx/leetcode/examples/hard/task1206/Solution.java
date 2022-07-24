package io.github.ololx.leetcode.examples.hard.task1206;

import java.util.Objects;

/*
 * 1206. Design Skiplist
 */
public class Solution {

    public static class Skiplist {

        public static final int MAX_LEVEL = 4;

        private final int levels;

        private SkipListEntry head;

        private SkipListEntry tail;

        public Skiplist() {
            this(MAX_LEVEL);
        }

        public Skiplist(int levels) {
            this.levels = levels;

            //init new SkipList with defined level
            //Firstly, create the root level (level = 0) entry for left (min) and right (max)
            // and linked it
            //          LEFT <------------------------------------------------> RIGHT
            SkipListEntry left = new SkipListEntry(Integer.MIN_VALUE, Integer.MIN_VALUE);
            SkipListEntry right = new SkipListEntry(Integer.MAX_VALUE, Integer.MAX_VALUE);
            left.setRight(right);
            right.setLeft(left);

            // After, we can define left and right as the head and tail nodes
            //   HEAD = LEFT <------------------------------------------------> RIGHT = TAIL
            this.head = left;
            this.tail = right;

            // Next, we can define left and right nodes for other levels and linked it
            // 0 HEAD = LEFT <------------------------------------------------> RIGHT = TAIL
            //            ^                                                  ^
            //            |                                                  |
            //            v                                                  v
            // 1 HEAD = LEFT <------------------------------------------------> RIGHT = TAIL
            //            ^                                                  ^
            //            |                                                  |
            //            v                                                  v
            // 2 HEAD = LEFT <------------------------------------------------> RIGHT = TAIL
            //            ^                                                  ^
            //            |                                                  |
            //            v                                                  v
            // 3 HEAD = LEFT <------------------------------------------------> RIGHT = TAIL
            //            ^                                                  ^
            //            |                                                  |
            //            v                                                  v
            // N HEAD = LEFT <------------------------------------------------> RIGHT = TAIL
            for (int i = 1; i < this.levels; i++) {
                left.down = new SkipListEntry(
                        Integer.MIN_VALUE,
                        Integer.MIN_VALUE,
                        null,
                        null,
                        left,
                        null
                );
                left = left.down;

                right.down = new SkipListEntry(
                        Integer.MAX_VALUE,
                        Integer.MAX_VALUE,
                        null,
                        null,
                        right,
                        null
                );
                right = right.down;
            }
        }

        public boolean search(int target) {
            SkipListEntry currentEntry = this.head;

            while (currentEntry.hasDown()) {
                currentEntry = currentEntry.getDown();
            }


            return false;
        }

        public void add(int num) {
            SkipListEntry currentEntry = this.head;
            SkipListEntry nextEntry = currentEntry.right();

            while (currentEntry.hasDown()) {
                if (num > nextEntry.getKey()) {
                    currentEntry = nextEntry;

                    if (currentEntry.hasRight()) {
                        nextEntry = currentEntry.right();
                    }
                } else {
                    if (currentEntry.hasDown()) {
                        currentEntry = currentEntry.down();
                        nextEntry = currentEntry.right();
                    }
                }
            }

            if (num == currentEntry.getKey()) {
                return;
            }

            SkipListEntry newNode = new SkipListEntry(num, num, currentEntry, nextEntry);
            currentEntry.setRight(newNode);
            nextEntry.setLeft(newNode);

            int i = 1;
            while (i < this.levels && this.coinFlip(i)) {
                SkipListEntry newNodeL = new SkipListEntry(num, num);
                newNodeL.setDown(newNode);
                currentEntry = currentEntry.up();
                nextEntry = nextEntry.up();

                newNodeL.setLeft(currentEntry);
                newNodeL.setRight(nextEntry);
                currentEntry.setRight(newNodeL);
                nextEntry.setRight(newNodeL);

                newNode = newNodeL;


                i++;
            }
        }

        public boolean erase(int num) {

            return false;
        }

        private boolean coinFlip(int level) {
            return true;
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

            public SkipListEntry left() {
                if (!this.hasLeft()) {
                    return null;
                }

                return this.left;
            }

            public void setLeft(SkipListEntry entry) {
                this.left = Objects.requireNonNull(entry);
            }

            public SkipListEntry right() {
                if (!this.hasRight()) {
                    return null;
                }

                return this.right;
            }

            public void setRight(SkipListEntry entry) {
                this.right = Objects.requireNonNull(entry);
            }

            public SkipListEntry up() {
                if (!this.hasUp()) {
                    return null;
                }

                return this.up;
            }

            public void setUp(SkipListEntry entry) {
                this.up = Objects.requireNonNull(entry);
            }

            public SkipListEntry getDown() {
                return this.down;
            }

            public SkipListEntry down() {
                if (!this.hasDown()) {
                    return null;
                }

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
