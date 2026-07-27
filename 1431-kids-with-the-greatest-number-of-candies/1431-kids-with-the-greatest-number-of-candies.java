class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int sum =0;
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
    }
    for(int i=0;i<candies.length;i++){
        sum=candies[i] + extraCandies;
            if(sum>=max){
                result.add(true);
            }
            else {
               result.add(false);
        }
    
}
return result;
}

}