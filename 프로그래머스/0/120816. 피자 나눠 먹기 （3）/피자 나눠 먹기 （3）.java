class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if (n % slice == 0){ 
            answer = n / slice;
        } else { // 조각 수가 사람 수보다 적으면 
            answer = n / slice + 1;
        }
        
        return answer;
    }
}