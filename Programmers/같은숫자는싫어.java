import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       int[] answer = {};
      // 반복문에서 동적으로 숫자들을 담아줄 ArrayList형 List을 생성
       ArrayList<Integer> list = new ArrayList();
      // 중복체크를 위해 int형 num이라는 변수를 만들어주고 0~9까지 겹치지 않게 -1을 지정
        int num = -1;
      // 배열의 길이만큼 반복을 해서 중복되면 list에 담지 않고 넘기고 중복되지 않으면 list에 담는다
        for(int i=0; i<arr.length; i++){             
            if(num != arr[i]){       
                num = arr[i];              
                list.add(arr[i]);
            }
        }
      // int형 배열answer를 list에 들어있는 크기만큼 생성하고 그 사이즈만큼 반복하여 answer배열에 
        answer = new int[list.size()];

        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
