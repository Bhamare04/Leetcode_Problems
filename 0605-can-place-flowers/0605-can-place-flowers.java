class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int t = flowerbed.length;

        for(int i=0;i<t;i++){
            if(flowerbed[i]==0){
                boolean emptyleft = (i==0) || (flowerbed[i-1]==0);
                boolean emptyright = (i==flowerbed.length-1) || (flowerbed[i+1]==0);

                if(emptyleft && emptyright){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count>=n;
    }
}