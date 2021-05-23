package Programmers_level1_Collatz_infer_Think;

class Solution {
    public int solution(long num) {
        int answer = 0;
        while (num != 1){
            if (answer == 500){
                answer = -1;
                break;
            }
            else {
                if (num%2 == 0){
                    num = num/2;
                    answer += 1;
                }
                else {
                    num = (num*3) + 1;
                    answer += 1;
                }
            }
        }
        return answer;
    }
}