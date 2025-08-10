class Solution {
    public int solution(int[] num_list) {
 
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0;i<num_list.length;i++){
            if(i%2==0){
                oddCount+=num_list[i];
            }
            else evenCount+=num_list[i];
        }
        
        if(oddCount>=evenCount) return oddCount;
        else return evenCount;
    }
}