public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        // Check from 2 to √n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false; // Not prime
        }

        return true; // Prime
    }

    public static void main(String[] args) {
        int num = 29;

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }
}
