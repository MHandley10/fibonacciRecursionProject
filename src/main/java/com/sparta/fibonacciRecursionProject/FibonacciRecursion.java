package com.sparta.fibonacciRecursionProject;

public class FibonacciRecursion {
        public static int fibonacciRecursion(int num) {
            if (num == 0) {
                return 0;
            } else if (num == 1) {
                return 1;
            } else {
                return fibonacciRecursion(num -1) + fibonacciRecursion(num - 2);
            }
        }
    }

