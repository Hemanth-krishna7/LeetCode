class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq={}
        heap=[]
        ans=[]
        for i in nums:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        for num,count in freq.items():
            heapq.heappush(heap,(count,num))
            if len(heap)>k:
                heapq.heappop(heap)
        for count,num in heap:
            ans.append(num)
        return ans

        