
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> x = new ArrayList<>();
        for(int i = 0;i<finished.length;i++){
            if(!finished[i]) x.add(todo_list[i]);
        }
        String[] answer = new String[x.size()];
        for(int i = 0; i<x.size();i++){
            answer[i] = x.get(i);
        }
        return answer;
    }
}