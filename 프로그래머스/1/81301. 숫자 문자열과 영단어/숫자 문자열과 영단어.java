class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] x = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<x.length;i++){
            if(s.contains(x[i])){
                s = s.replace(x[i],String.valueOf(i));
            }
        }
        answer = Integer.valueOf(s);
        return answer;
    }
}