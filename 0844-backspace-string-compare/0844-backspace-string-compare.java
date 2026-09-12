class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String a){
        Stack<Character> s1 = new Stack<>();
        for (char ch : a.toCharArray()){

            if( ch!='#'){
                s1.push(ch);
            }else if(!s1.isEmpty()){
                s1.pop();
            }
           
        }
        return s1.toString();
    }
    }