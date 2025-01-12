class Solution {
    public int[] plusOne(int[] digits) {
         /* 
            X Y Z T 
            If 0000 t + 1
            If 0009 t = 0 and new array with last digit 0
            If 0099 y = 1 z = 0 t = 0
            From right to left all the 9's should be 0 and one left should be 1
            What if 9999 Edge Case: new array 
         */ 
        int size = digits.length;
        for(int i = size - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
            digits[i] += 1;
            return digits;
            }
        }
        int[] arr = new int[size + 1];
        arr[0] = 1;
        return arr;
}
};