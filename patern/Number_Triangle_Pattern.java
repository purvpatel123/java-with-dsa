public class Number_Triangle_Pattern {

    public static void printStarPattern(int n) {
        int i, j;

        // Loop through each row
        for (i = 1; i <= n; i++) {

            // Print spaces before stars
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars with space
            for (j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printStarPattern(n);
    }
}

