import java.util.Scanner;

public class AdvancePattern {
    public void main(String[] args) {
        System.out.println("Here We are learning about some advance patterns");
        int numP = inputFunction();
        butterflyPattern(numP);
        slantedRectangle(numP);
        numberPyramid(numP);
        retPalin(numP);
        diamond(numP);
    }

    public static void butterflyPattern(int n) {

        System.out.println("---ButterFly Pattern---");
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("⚔ ");
                j++;
            }
            j = 1;
            int product = 2 * (n - i);
            while (j <= product) {
                System.out.print("  ");
                j++;
            }
            j = 1;

            while (j <= i) {
                System.out.print(" ⚔");
                j++;
            }
            // j=1;
            System.out.println();
            i++;
        }
        i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            j = 1;
            int product = 2 * (n - i);
            while (j <= product) {
                System.out.print("  ");
                j++;
            }
            j = 1;

            while (j <= i) {
                System.out.print(" *");
                j++;
            }
            j = 1;
            System.out.println();
            i--;
        }
    }

    public static void slantedRectangle(int n) {
        System.out.println("---Slanted Rectangle---");
        int i = 1;
        int j = 1;
        while (i <= n) {
            j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            // System.out.println(j);
            j = 1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            // System.out.println(j);

            System.out.println();
            i++;
        }
    }

    /*
     * The Below code Prints:
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     */
    public static void numberPyramid(int n) {
        System.out.println("---Numbered Pyramid---");
        int i = 1;
        int j = 1;
        /*
         * while(i<=n){
         * while(j<=n){
         * System.out.print(" ");
         * j++;
         * }
         * System.out.print(i+" ");
         * System.out.println();
         * i++;
         * }
         */

        /*
         * while(i<=n){
         * j=n;
         * while(j>i){
         * System.out.print(" ");
         * j--;
         * }
         * j=1;
         * while(j<=i){
         * System.out.print(i+" ");
         * j++;
         * }
         * System.out.println();
         * i++;
         * }
         */
        // The same question using the for loop cause Why not
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
     * The below code prints:
     *
     *          1
     *        2 1 2
     *      3 2 1 2 3
     *   4 3 2 1 2 3 4
     * 5 4 3 2 1 2 3 4 5
     */

    public static void retPalin(int n) {
        System.out.println("---Palindrome Pyramid---");
        int i = 1;
        int j;
        while (i <= n) {
            j = n - 1;
            while (j >= i) {
                System.out.print(" ");
                j--;
            }
            j = i;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            j = 2;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void diamond(int n) {
        System.out.println("---Diamond---");
        int i = 1;
        while (i <= n) {
            int j = n;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            j = 2;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= n) {

            // System.out.println();
            int j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            j = n;
            while (j >= i) {
                System.out.print("*");
                j--;
            }
            j = n - 1;
            while (j >= i) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static int inputFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int giveNum = sc.nextInt();
        return giveNum;
    }
}
