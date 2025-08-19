class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String a = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='p') count1++;
            else if(a.charAt(i)=='y') count2++;
        }
        if(count1!=count2) answer = false;

        return answer;
    }
}