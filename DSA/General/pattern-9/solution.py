class Solution:
    def pattern9(self, n):
        for i in range(1,n+1):
            for _ in range(n-i):
                print(" ",end="")
            
            for _ in range(2*i -1):
                print("*", end="")
            
            print()

        for i in range(n,0, -1):
            for _ in range(n-i):
                print(" ",end="")
            
            for _ in range(2*i -1):
                print("*", end="")
            
            print()
        