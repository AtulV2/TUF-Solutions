class Solution:
    def pattern16(self, n):
        num =  65
        for i in range(1,n+1):
            for j in range(i):
                print(chr(num),end="")
            
            num = num + 1
            print()