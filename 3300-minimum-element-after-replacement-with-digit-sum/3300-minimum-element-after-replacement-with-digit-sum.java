class Solution {
    public int minElement(int[] nums) {
        
        int minimum = 99999;
        for(int i=0;i<nums.length;i++){
            int sum=0;
           int  digit = nums[i];
            while(digit>0){
            sum = sum + digit % 10;
            digit = digit / 10;
            }
        if(minimum>sum){
            minimum =sum;
        }
        }
            return minimum;
    }
}