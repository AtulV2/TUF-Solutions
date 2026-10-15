class Solution:
    def pattern10(self, n):
        for i in range(1,n+1):
            for _ in range(i):
                print("*",end="")
            print()
        for j in range(n-1,0,-1): # Note this here n-1 so that same line does not printed twise
            for _ in range(j):
                print("*",end="")
            print()