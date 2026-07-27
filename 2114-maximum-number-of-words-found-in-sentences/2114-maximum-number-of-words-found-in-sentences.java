class Solution {
    public int mostWordsFound(String[] sentences) {
         int max =0;
        for(int i=0;i<sentences.length;i++){
            String s = sentences[i];
            int count=0;
            int words = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)== ' '){
                    count++;
                }
            words = count + 1;
            }
            if(words>max){
                max = words;
            }
        }
        return max;
    }
}