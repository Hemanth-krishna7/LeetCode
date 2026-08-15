class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        X = x
        Reverse = 0
        while x > 0:
            Reverse = Reverse * 10 + x % 10
            x //= 10
        return Reverse == X