class Solution {
    public int minimumCost(int[] cost) {
        int total=0;
        int count=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
          if(count % 3 != 2){
            total = total + cost[i];
            count ++;
          }
          else if(count % 3 == 2){
            count ++;
          }
        }
        return total;
    }
}