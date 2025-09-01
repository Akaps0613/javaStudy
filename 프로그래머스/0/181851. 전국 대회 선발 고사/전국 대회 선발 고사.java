class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] temp = new int[3];
        int index = 0;

        // 1등부터 n등까지 차례대로 확인
        for (int r = 1; r <= rank.length && index < 3; r++) {
            for (int i = 0; i < rank.length; i++) {
                if (rank[i] == r && attendance[i]) {
                    temp[index] = i;
                    index++;
                    break; 
                }
            }
        }

        return temp[0] * 10000 + temp[1] * 100 + temp[2];
    }
}
