class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int answer = 0;
        int pushes = 1;
        while(n>0){
            if(n>=8){
                answer +=8 * pushes;
                n-=8;
                pushes++;
            }
            else {
            answer += n*pushes;
            n=0;
            
            }
            
        }
        return answer;
    }
}