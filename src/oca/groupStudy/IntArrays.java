package oca.groupStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrays {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7,8,9,4,1,2,5,4, 56,5,9,123,97,256,45};
        System.out.println(Arrays.toString(findPrimes(nums)));

    }

    public static int[] findPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int each : numbers) {
            if (isPrime(each)) {
                primes.add(each);
            }
        }
        int[] primeNumbers = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            primeNumbers[i] = primes.get(i);
        }
        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;

    }
}
