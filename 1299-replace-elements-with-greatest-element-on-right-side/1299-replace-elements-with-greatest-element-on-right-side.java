class Solution {
    public int[] replaceElements(int[] nums) {
        int n = nums.length;
	int[] ans = new int[n];
	int rightmax = -1;
	for(int i = n-1;i>=0;i--) {
		ans[i] = rightmax;
		rightmax = Math.max(rightmax, nums[i]);
	}
	return ans;
    }
}