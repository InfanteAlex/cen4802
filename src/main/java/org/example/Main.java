package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int n = 30;

        System.out.print("The nth term in the fibonacci sequence is  " + fibonacciRecurse(n));

    }

    /**
     * The Fibonacci Sequence starts with 0 and 1 and continues by adding
     * the last 2 previous numbers. This continues over and over until it
     * reaches the given endpoint n. This method uses recursion which in order
     * to find the nth element you must find n-1 and n-2. This continues until n
     * equals 1 or less. As the n number increases the runtime quickly grows as well
     * because it must recalculate the same numbers repeatedly.
     *
     *
     * @param n the number given by the user that marks the endpoint of the
     * sequence. The program will stop at the nth number in the sequence.
     *
     * @return  The sequence starts at 0 and 1 if the number is less than
     * or equal to 1. It is used to start the sequence with 0 and 1.
     * <p>
     * The sequence is continued by adding n - 1 and n - 2 which are the 2
     * previous numbers in the sequence.
     *
     */

    public static int fibonacciRecurse(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (fibonacciRecurse(n - 1) + fibonacciRecurse(n - 2));
        }

    }
}