package org.uma.ed.dataestructure.hashtable;

import java.util.Arrays;

/**
 * Class for generating size of arrays in hash tables as prime numbers.
 *
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 */
public class HashPrimes {
    private static final int[] primes = new int[]{5, 11, 23, 53, 107, 223, 449, 907, 1823, 3659, 7321, 14653, 29311,
            58631, 117269, 234539, 469099, 938207, 1876417, 3752839, 7505681,
            15011389, 30022781, 60045577, 120091177, 240182359, 480364727,
            960729461, 1921458943};

    /**
     * Returns a prime number greater than {@code 2*n}, or fails if bound is too large.
     *
     * @param n 2*n is lower bound for sought prime number.
     *
     * @return A prime number greater than {@code 2*n} or fails if bound is too large.
     */
    public static int primeDoubleThan(int n) {
        return primeGreaterThan(2 * n - 1);
    }

    /**
     * Returns a prime number greater than {@code n} or fails if {@code n} is greater than or equal to 1610612741.
     *
     * @param n Lower bound for prime number.
     *
     * @return a prime number greater than {@code n} or fails if {@code n} is greater than or equal to 1610612741.
     */
    public static int primeGreaterThan(int n) {
        int index = Arrays.binarySearch(primes, n + 1);
        if (index > 0) {
            return primes[index];
        } else {
            int insertionPoint = -index - 1;
            if (insertionPoint == primes.length) {
                throw new RuntimeException("HashPrime.primeGreaterThan: argument " + n + " too large");
            } else {
                return primes[insertionPoint];
            }
        }
    }
}