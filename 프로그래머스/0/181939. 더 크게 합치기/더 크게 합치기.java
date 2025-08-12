class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        String q = x+y;
        String w = y+x;
        if(Integer.valueOf(q)>Integer.valueOf(w)) return Integer.valueOf(q);
        else return Integer.valueOf(w);
    
    }
}