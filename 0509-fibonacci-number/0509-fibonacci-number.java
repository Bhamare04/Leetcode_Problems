class Solution {
    public int fib(int n) {
        int a1 = 0;
        int a2 = 1;
        if(n<=1){
            return n;
        }
        for(int i=2;i<=n;i++){

            int a3 = a1+ a2;
            a1 = a2;
            a2 = a3;
        }
        return a2;
    }

       
    }