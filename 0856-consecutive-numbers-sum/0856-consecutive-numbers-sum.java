class Solution {
    public int consecutiveNumbersSum(int n) {
        // Egehan Kilic
        // n = x + x+1 + x+2 + ... x+k-1
        // n = kx + (k-1)k/2
        // [n - [(k-1)k / 2]] / k = x
        // x is minimum 0, int, effectively positive.
        // n - (k-1)k/2 > 0  so basicall n > (k-1)k/2
        // in order x to be integer n - [(k-1)k / 2]] / k should be integer.
        int k = 1;
        int count = 0;
        while(n > (k-1)*k/2){
            int top = n - ((k-1)*k / 2);
        if(top % k == 0){
        count++;
        }
         k++;
        }
        return count;
    }
}