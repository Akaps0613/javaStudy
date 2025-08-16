import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String x = String.valueOf(n);
        for(int i = 0 ;i<x.length();i++){
            answer = answer+Integer.valueOf(String.valueOf(x.charAt(i)));
        }

        return answer;
    }
}