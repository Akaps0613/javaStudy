import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int i=0;i<commands.length;i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i]             [1]);
            Arrays.sort(temp);
            answer[index]=temp[commands[i][2]-1];
            index++;
        }
        return answer;
    }
}