class Solution {
    public String solution(String s) {
        String answer = "";
        String[] x = s.split(" ");
        int max = Integer.valueOf(x[0]);
        int min = Integer.valueOf(x[x.length-1]);
        for(int i=0;i<x.length;i++){
            int n = Integer.valueOf(x[i]);
            if(n<min){
                min = n;
            }
            else if(n>max){
                max = n;
            }
        }
        answer = min + " " + max;
        return answer;
    }
}