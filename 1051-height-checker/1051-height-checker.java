class Solution {
    public int heightChecker(int[] heights) {
        int count =0;
        int[] copy = heights.clone();
        Arrays.sort(copy);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=copy[i]){
                count ++;
            }
        }
        return count;
    }

}