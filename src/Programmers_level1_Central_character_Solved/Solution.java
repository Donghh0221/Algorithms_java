package Programmers_level1_Central_character_Solved;

class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length();
        int n = 0;
        if (l%2 == 0){
            n = l/2;
            answer = s.substring(n-1, n+1);
        }
        else {
            n = (l-1)/2;
            answer = s.substring(n, n+1);
        }
        return answer;
    }
}