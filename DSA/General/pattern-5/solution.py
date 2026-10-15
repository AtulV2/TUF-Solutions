class Solution:
    def pattern5(self, n):
        for i in range(n,0,-1):
            for j in range(i,0,-1):
                print("*", end="")
            print()