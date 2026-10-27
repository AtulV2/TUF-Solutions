class Solution {
    public void pattern19(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j >= 0; j--) {
                System.out.print("*");
            }

            for (int k = 0; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }

            for (int j = n - i; j >= 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < 2 * (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}