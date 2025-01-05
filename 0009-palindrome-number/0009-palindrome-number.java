class Solution {
    public boolean isPalindrome(int x) {

        // Approach: Create an int reversed, Take the last digit of given, delete it. Add it to the pal. (Keep adding the digits to reversed right to left.)
        if(x<0) return false;
        int given = x;
        int reversed = 0;

        // Reverse the integer
        while (x != 0) {
            int lastdigit = x % 10; 
            x /= 10; // Digit Shifting to the Right.
            reversed = reversed * 10 + lastdigit; // Digit-Shifting to the Left
        }

        // Check if the original number matches the reversed number
        return given == reversed;
    }
}
