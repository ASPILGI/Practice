// 완전탐색 - 카펫
// if contiune 문 다시 보기
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i=1; i<=sum; i++){
            int row = i; //세로
            int col = sum / row; //가로
            
            if(row > col)
                continue;
            
            if((row-2) * (col-2) == yellow){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        
        
        return answer;
    }
}
