import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> str = new ArrayList<String>();
        for(int i = 0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                str.add(strArr[i]);
            }
        }
        return str;
    }
}