class Solution {
    public void pattern18(int n) {
        for(int i =1; i<=n; i++){
            int ch = 65;

            ch = ch + n - i;
            for(int j=0; j<i; j++){
                System.out.print((char)ch + " ");
                ch++;
            }

            System.out.println();
        }

    }
}