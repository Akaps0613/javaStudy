import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] temp = new String[strings.length];
        String[] answer = new String[strings.length];
        int index = 0;
        for(int i=0;i<strings.length;i++){
            temp[index]=strings[i].charAt(n) + strings[i];
            index++;
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            answer[i] = temp[i].substring(1,temp[i].length());
        }
        return answer;
    }
}