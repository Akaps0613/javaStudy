class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length<arr2.length){
            answer = -1;
        }
        else if(arr1.length>arr2.length){
            answer = 1;
        }
        else{
            int count1 = 0;
            int count2 = 0;
            for(int i =0;i<arr1.length;i++){
                count1 = count1 + arr1[i];
                count2  = count2 + arr2[i];
            }
            if(count1>count2){
                answer = 1;
            }
            else if(count1<count2){
                answer = -1;
            }
            else answer = 0;
        }
        return answer;
    }
}