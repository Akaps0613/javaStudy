class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String x = "";
        String y = "";
        for(int i = 0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                x = x + String.valueOf(num_list[i]);
            }
            else y = y + String.valueOf(num_list[i]);
        }
        return Integer.valueOf(x) + Integer.valueOf(y);
    }
}