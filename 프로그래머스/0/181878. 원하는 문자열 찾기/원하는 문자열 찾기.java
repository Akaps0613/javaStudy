class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String x = myString.toLowerCase();
        String y = pat.toLowerCase();
        if(x.contains(y)) return 1;
        else return 0;
    }
}