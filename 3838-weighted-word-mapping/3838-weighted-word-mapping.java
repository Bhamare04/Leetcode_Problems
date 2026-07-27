class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
      
        String result = "";
        int rem =0;
        for(int i=0;i<words.length;i++){
              int sum =0;
            String word = words[i];
            for(int j=0;j<word.length();j++){
            char ch = word.charAt(j);
            sum += weights[ch - 'a'];

           
        }
           rem = sum % 26 ;
         char c= (char)('z' -  rem);
            result = result + c;
        
        }
      
        return result;
    }
}