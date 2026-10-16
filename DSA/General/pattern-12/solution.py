class Solution:
    def pattern12(self, n):
        for i in range(1, n+1):

            # // print number
            for j in range(1,i+1):
                print(j,end="")


            # // print spaces
            for k in range(2*(n-i)):
                print(" ",end="")


            # // print number
            for j in range(i,0,-1):
                print(j,end="")
            
            print()


