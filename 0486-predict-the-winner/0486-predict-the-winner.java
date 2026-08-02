class Solution {
     
        int solve(int[] nums,int left,int right){
            
            if(left==right){
                return nums[left];
            }
            int leftchoice =nums[left] - solve(nums,left+1,right);
            
            int  rightchoice = nums[right] - solve(nums,left, right - 1);
             return    Math.max(leftchoice, rightchoice);
            }

        
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;

        if(solve(nums,0,n-1)>=0){
            return true;
        }
        return false;
    }
}