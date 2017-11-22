package com.power;

public class Shift {
    public static void main(String... args) {

        System.out.println("repeatedArithmeticShift => " + repeatedArithmeticShift(93242, 40));
        System.out.println("repeatedLogicalShift => " + repeatedLogicalShift(93242, 40));
    }

    public static int repeatedArithmeticShift( int x, int count ) {
        for (int i = 0; i < count; i++) {
            x >>= 1;
        }
        return x;
    }

    public static int repeatedLogicalShift( int x, int count ) {
        for (int i = 0; i < count; i++) {
            x >>>= 1;
        }
        return x;
    }
}
