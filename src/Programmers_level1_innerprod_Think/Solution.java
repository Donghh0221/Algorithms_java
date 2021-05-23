package Programmers_level1_innerprod_Think;

class Solution {
    public int solution(int[] a, int[] b) {
        int len = a.length;
        int answer = 0;
        for (int i = 0; i < len; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}