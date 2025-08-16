class Solution {
    public int[] solution(long n) {
        String[] x = Long.toString(n).split("");
        int[] answer = new int[x.length];
        int index = 0;
        for(int i = answer.length-1;i>=0;i--){
            answer[index] = Integer.valueOf(x[i]);
            index++;
        }
        return answer;
    }
}