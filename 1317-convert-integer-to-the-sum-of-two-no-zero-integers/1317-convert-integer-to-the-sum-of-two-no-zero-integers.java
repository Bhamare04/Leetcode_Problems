class Solution {
    public int[] getNoZeroIntegers(int n) {
      
        for(int i=1;i<=n;i++){
             boolean haszero = false;
            int A = i;
            int B = n-i;
            int temp =A;
            int temp1 = B;
            while(temp>0){
           int  digit = temp%10;
            temp = temp/10;
            if( digit==0){
                haszero = true;
            }
            }
             while(temp1>0){
           int  digit = temp1%10;
            temp1 = temp1/10;
            if(digit==0){
                haszero = true;
            }

            }
            if(haszero==false){
             return new int[]{A, B};
        }
    }
    return new int[]{-1, -1};
}
}