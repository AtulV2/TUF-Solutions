class Solution {
    public void pattern17(int n) {
                for (int i = 1; i <= n; i++) {
            int ch = 65;
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print increasing alphabets
            for (int j = 0; j < i; j++) {
                System.out.print((char)ch);
                ch++;
            }

            ch = ch - 1;

            // Print decreasing alphabets
            for (int j = 0; j < i - 1; j++) {
                ch = ch - 1;
                System.out.print((char)ch);
            }

            System.out.println();
        }

    }
}