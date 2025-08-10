import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String myString) {
        String[] answer = myString.split("x",-1);
        int[] x = new int[answer.length];
        for(int i = 0;i<answer.length;i++){
            x[i]= (answer[i].length());
        }
        return x;
    }
}