package com.example.project;

public class ShiftLeftRule extends ShiftRule {
    protected void rotate(int[] digits) {
        rotateLeft(digits);
    }

    public ShiftLeftRule() {
        super(true); // is left
    }
}
