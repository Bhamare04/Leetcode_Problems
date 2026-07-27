class Solution {
    public int uniqueXorTriplets(int[] nums) {
         int k=0;
         int n = nums.length;
        if(n<=2){
            return n;
        }
            while(n>0){
                k++;
                n = n>>1;
            }
          
        return 1<<k;
    }
}