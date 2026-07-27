class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int actuallength= 0;
       int expectedlength = n * (n+1)/2;

        for(int i=0;i<nums.length;i++){
        actuallength = actuallength + nums[i];
        }
        return expectedlength - actuallength;
    }
}