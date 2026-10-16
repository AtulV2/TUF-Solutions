class Solution:
    def pattern15(self, n):
        for i in range(n):
            num = 65
            for j in range(n-i):
                print(chr(num), end="")
                num = num + 1
            print()
            

