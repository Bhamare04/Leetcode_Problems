class Solution {
    public boolean detectCapitalUse(String word) {
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(word.equals(word.toUpperCase())){
                return true;
            }
            else if(word.equals(word.toLowerCase())){
                return true;
            }
            else if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())){
                return true;
            }
           
        }
         return false;
    }
}