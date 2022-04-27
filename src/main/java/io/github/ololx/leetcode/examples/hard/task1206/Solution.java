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

            SkipListEntry nodeHeadT = new SkipListEntry(Integer.MIN_VALUE, Integer.MIN_VALUE);
            SkipListEntry nodeTailT = new SkipListEntry(Integer.MAX_VALUE, Integer.MAX_VALUE);
            nodeHeadT.setRight(nodeTailT);
            nodeTailT.setLeft(nodeHeadT);

            this.head = nodeHeadT;
            this.tail = nodeTailT;

            for (int i = 0; i < this.levels - 1; i++) {
                SkipListEntry nodeHead = new SkipListEntry(Integer.MIN_VALUE, Integer.MIN_VALUE);
                SkipListEntry nodeTail = new SkipListEntry(Integer.MAX_VALUE, Integer.MAX_VALUE);

                nodeHead.setRight(nodeTail);
                nodeTail.setLeft(nodeHead);
                nodeHead.setUp(nodeHeadT);
                nodeTail.setUp(nodeTailT);
                nodeHeadT.setDown(nodeHead);
                nodeTailT.setDown(nodeTail);

                nodeHeadT = nodeHead;
                nodeTailT = nodeTail;
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
