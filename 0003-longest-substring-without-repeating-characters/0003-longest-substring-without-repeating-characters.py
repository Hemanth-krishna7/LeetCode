class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        maxlength = 0
        charindex = [-1] * 128
        left = 0

        for right in range(n):
            if charindex[ord(s[right])] >= left:
                left = charindex[ord(s[right])] + 1
            charindex[ord(s[right])] = right
            maxlength = max(maxlength, right - left + 1)
        return maxlength