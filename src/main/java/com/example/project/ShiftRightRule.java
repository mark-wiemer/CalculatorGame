package com.example.project;

public class ShiftRightRule extends ShiftRule {
    protected void rotate(int[] digits) {
        rotateRight(digits);
    }

    public ShiftRightRule() {
        super(false); // not left
    }
}
