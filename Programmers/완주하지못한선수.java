// 해시 - 완주하지 못한 선수
// sort/loop 방식의 해결법 
import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를때 까지 찾는다.
        int i=0;        
        for(; i<completion.length; i++)
            if(!participant[i].equals(completion[i]))
                break;

        // 3. 멈추지 않고 , 마지막 주자가 완주하지 못한 선수이다.
        return participant[i];
    }   
}

// Hash 방식의 해결법 - 1. keyset 사용//
import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. Hash map을 만든다. (participant)
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);

        // 2. Hash map을 뺀다. (completion)
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        // 3. value가 0이 아닌 마지막 주자를 찾는다.
        for (String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }   
}

// Hash 방식의 해결법 - 2. entryset 사용//
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. Hash map을 만든다. (participant)
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);

        // 2. Hash map을 뺀다. (completion)
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        // 3. value가 0이 아닌 마지막 주자를 찾는다.
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }   
}
