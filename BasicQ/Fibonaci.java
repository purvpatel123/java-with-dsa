public class Fibonacci {
    public static void fibonaci(int n) {
        int first = 0;
        int second = 1;

        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        fibonaci(n);
    }
}
