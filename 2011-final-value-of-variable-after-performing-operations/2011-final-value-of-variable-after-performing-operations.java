class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            String op= operations[i];

            if(op.contains ("++")){
                x++;
            }
            else
             x--;
        }
        return x;
    }
}