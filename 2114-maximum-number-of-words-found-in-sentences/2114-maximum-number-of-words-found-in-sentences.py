class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        count = 0
        for i in sentences:
            res = len(i.split())
            if res > count:
                count = res
        return count 