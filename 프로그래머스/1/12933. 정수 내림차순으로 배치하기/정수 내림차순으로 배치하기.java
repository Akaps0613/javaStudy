import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] x = String.valueOf(n).split("");
        Arrays.sort(x);
        String a = "";
        for(int i=x.length-1;i>=0;i--){
            a+=x[i];
        }
        Long answer = Long.valueOf(a);
        return answer;
    }
}