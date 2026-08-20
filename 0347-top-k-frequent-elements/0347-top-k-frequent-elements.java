class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i = 0;i<k;i++){
            int max = -1;
            for(int num: map.keySet()){
                if(map.get(num)>max){
                    max = map.get(num);
                    ans[i] = num;
                }
            }
            map.remove(ans[i]);
        }
        return ans;
    }
}