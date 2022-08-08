// 정렬 - 가장 큰 수
// compareTO 함수
// 향상된 for문
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // 1. String형 배열을 생성
        String[] str = new String[numbers.length];
        
        // 2. int형 배열을 String형 배열로 변환
        for(int i=0; i<str.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        
        // 3. String형 배열을 내림차순으로 정렬
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
            
        // 4. 0값이 중복일경우 0을 리턴하게 예외처리
        if (str[0].equals("0")) return "0";
        
        // 5. 0이 아니면 문자열을 더해준다
        for (String i : str){
            answer += i;
        }
        
        return answer;
    }
}
