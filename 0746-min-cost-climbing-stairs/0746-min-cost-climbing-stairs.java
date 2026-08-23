class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] a = new int[cost.length];
         int mincost = 0;
        for(int i=0;i<cost.length;i++){
            if(i<2){
                a[i] = cost[i];
            }else{
        a[i] = Math.min(a[i-1],a[i-2])+cost[i];
            }
        }
        return Math.min(a[cost.length-1],a[cost.length-2]);
    }
}