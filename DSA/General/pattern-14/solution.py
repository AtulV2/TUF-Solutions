class Solution:
    def pattern14(self, n):
        for i in range(1,n+1):
            num = 65
            for j in range(i):
                print(chr(num), end="")
                num = num + 1
            print()
