class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long x = 0;
        for(int i=1;i<=count;i++){
            x += (price*i);
        }
        if(money<x)
            answer = x-money;
        else
            answer = 0;

        return answer;
    }
}