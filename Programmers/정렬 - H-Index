// 정렬 - H-Index
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 1. 각 논문의 인용 횟수를 오름차순으로 정렬
        Arrays.sort(citations);
        
        // 2. n편중 h번 이상 인용된 논문이 h편이상일때 h의 최대값이 h-index
        for(int i=0; i<citations.length; i++){
            int h = citations.length - i;
            
            // 3. 논문 인용횟수가 h 이상인지 확인
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}
