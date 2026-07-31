class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;

        int longest = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int el : set) {

            if (!set.contains(el - 1)) {

                int cnt = 1;
                int temp = el;

                while (set.contains(temp + 1)) {
                    cnt++;
                    temp++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}