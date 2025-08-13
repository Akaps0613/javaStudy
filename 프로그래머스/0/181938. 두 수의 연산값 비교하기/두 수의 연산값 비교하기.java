class Solution {
    public int solution(int a, int b) {
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        int q = Integer.valueOf(x+y);
        int w = 2*a*b;
        if(q>w) return q;
        else return w;
    }
}