class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] x = binomial.split(" ");
        if(x[1].equals("+")){
            answer = Integer.valueOf(x[0]) +  Integer.valueOf(x[2]);
        }
        else if(x[1].equals("-")){
            answer=  Integer.valueOf(x[0]) -  Integer.valueOf(x[2]);
        }
        
        else if(x[1].equals("*")){
            answer=  Integer.valueOf(x[0]) *  Integer.valueOf(x[2]);
        }
        return answer;
    }
    
    
}