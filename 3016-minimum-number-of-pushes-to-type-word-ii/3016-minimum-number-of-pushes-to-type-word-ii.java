class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        int answer =0;
        int pos=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        for (int i = freq.length - 1; i >= 0; i--){
            if(freq[i]==0){
            continue;
            }
            int pushes = (pos/8)+1;
            answer += pushes*freq[i];
            pos++;
        }
        return answer;
    }
}