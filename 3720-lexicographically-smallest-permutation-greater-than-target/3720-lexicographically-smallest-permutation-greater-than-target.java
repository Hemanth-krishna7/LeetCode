class Solution {
    public String min(int[] freq){
        StringBuilder sb = new StringBuilder();
        int copy[] = Arrays.copyOf(freq, 26);
        for(int i = 0; i < 26; i++){
            while(copy[i]-- > 0){
                sb.append((char) ('a' + i));
            }
        }
        return sb.toString();
    }
    public String lexGreaterPermutation(String s, String target) {
        int freq[] = new int[26];
        char arr[] = s.toCharArray();
        for(char c: arr){
            freq[c - 'a']++;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            int curr = target.charAt(i) - 'a';
            for(int j = curr; j < 26; j++){
                if(freq[j] == 0){
                    continue;
                }
                freq[j]--;
                sb.append((char) ('a' + j));
                String min = min(freq);
                String temp = sb.toString() + min;
                if(temp.compareTo(target) > 0){
                    if(ans.equals("") || temp.compareTo(ans) < 0){
                        ans = temp;
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
                freq[j]++;
            }
            if(freq[curr] > 0){
                freq[curr]--;
                sb.append((char) ('a' + curr));
            }else{
                break;
            }
        }
        return ans;
    }
}