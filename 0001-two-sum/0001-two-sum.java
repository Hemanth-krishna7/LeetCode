class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int comp = target - nums[i];
            if(numsMap.containsKey(comp)){
                return new int[]{numsMap.get(comp),i};
            }
            numsMap.put(nums[i],i);
        }
        return new int[]{};
    }
}