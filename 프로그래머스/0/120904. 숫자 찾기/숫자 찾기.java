class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        String[] num1= str.split("");
        for(int i=0;i<num1.length;i++){
            if(num1[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }
        
        }
       return answer; 
    }
}