class Solution {
    public int longestPalindrome(String s) {
        boolean hasOdd = false;
        int length =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }
            else{
                map.put(ch,1);
            }
        }
            for(int freq : map.values()){
        if(freq % 2==0){
            length += freq;
        }
        else{
            length += freq -1;
            hasOdd = true;
        }
            }

        if(hasOdd==true){
            length = length + 1;
        }
        return length;
    }
}