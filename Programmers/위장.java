// 해시 - 위장
import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public int solution(String[][] clothes) {
        // 1. 옷을 종류별로 구별한다
        HashMap<String, Integer> map = new HashMap<>();
        for(String [] clothe : clothes){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0  ) + 1);
        } 

        // 2. 입지 않는 경우를 추가해서 모든 조합을 계산한다.
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 3. 아무종류의 옷도 입지 않는 경우 제외한다.
        return answer-1;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        String[][] clothes = { { "yellowhat", "headgear" },
                               { "bluesunglass", "eyewear" },
                               { "green_turban", "headgear"} };

        System.out.print(sol.solution(clothes));
    }
}
