package oca.groupStudy;

public class PrimeNumber {
    public static void main(String[] args) {

        // find a prime number

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 1, 2, 3};

        for (int each : arr) {
            // findPrime (each);

        }
        System.out.println(isPrime(9));

    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }
}
