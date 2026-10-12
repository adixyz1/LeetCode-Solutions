class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = 0;
        result += numBottles;
        while(numBottles>=numExchange){
            result += numBottles/numExchange;
            numBottles = (numBottles/numExchange) + (numBottles%numExchange);
        }
        return result;
    }
}