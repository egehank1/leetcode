class Solution {
    public double nthPersonGetsNthSeat(int n) {
        /*
        if person 1 sira in seatnr x
        person x has to either sit in nr 1 or the seats after x
        the loop continues till any person sits to seatnr 1 or seatnr 100
        infinite loop if person z sits no anywhere else than 1 or 100
        there is no chose criteria between 1 and 100, so 0.5 is the final probability. 
        */
        if(n==1) return 1;
        return 0.5;
        }
}