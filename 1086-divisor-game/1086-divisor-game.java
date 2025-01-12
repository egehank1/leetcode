class Solution {
    public boolean divisorGame(int n) {
        /* 
        whoever reaches 2 before choosing wins
        n = 4 alice wins 
        n = 5 bob wins
        n = 6 alice wins
        n = 7 bob wins
        n = 8 alice wins
        */
        return (n%2==0);
    }
}