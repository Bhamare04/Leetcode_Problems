class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean start=false;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch== ' '){
             if(start == false){
                continue;
            }
            else{
                return count;
            }
            }else if(ch != ' '){
                start=true;
                count++;
            }
            
        }
        return count;
        
    }
}