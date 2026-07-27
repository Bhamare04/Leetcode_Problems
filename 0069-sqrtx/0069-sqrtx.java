class Solution {
    public int mySqrt(int x) {
        int i=1;
        if(x==0){
            return 0;
        }
        for( i=1;i<=x;i++){
            if((long)i*i>x){
                return i-1;
            }
            
        }
        return x;
    }
    
}