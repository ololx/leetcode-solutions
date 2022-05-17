package io.github.ololx.leetcode.examples.easy.task155;

class MinStack { 
    
    final Stack<Element> elements;
    
    public MinStack() {
        this.elements = new Stack<>();
    }
    
    public void push(int val) {
        if (this.elements.empty()) {
            this.elements.push(
                new Element(val, val)
            );
        } else {
            int lastMinValue = this.elements.peek().minValue;
            this.elements.push(
                new Element (
                    val,
                    val > lastMinValue ? lastMinValue : val
                )
            );
        }
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
