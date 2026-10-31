class Solution {
    public void pattern22(int n) {

       

        for(int i = 0; i<2*n - 1; i++){
            for(int j=0; j<2*n -1; j++){
                
                // for any element the distances from top , bottom , left , right are
                int top =  i; // for 0 based indexing
                int bottom =  2*n - 1 - i - 1; // total - top -1

                int left = j;
                int right = 2*n - 1 - j - 1; // total - left -1

                // we have to print n - min of above 4
                // as min takes only two parameters we use it one inside another
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)) + " ");
                

            }

            System.out.println();
        }

    }
}