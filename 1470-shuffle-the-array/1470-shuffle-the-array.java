class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
         int j=0;
        for(int i=0;i<n;i++){
            int left = nums[i];
            int right = nums[i+n];
            result[j]=left;
            j++;
            result[j]=right;
            j++;
        }
        return result;
    }
    
}