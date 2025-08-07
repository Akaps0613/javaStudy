class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int i=0;
        while(i<n){
            for(int j=0;j<n;j++){
                if(j==i){
                    answer[i][j] =1;
                }
                else 
                    answer[i][j] =0;
            }
            i++;
        }
        return answer;
    }
}