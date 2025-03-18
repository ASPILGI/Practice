// 해시 - 폰켓몬

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int a = nums.length/2;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int phonekenon : nums){
            if(!arrayList.contains(phonekenon))
            arrayList.add(phonekenon);
        }

        if(arrayList.size() > a) answer = a;
        else answer = arrayList.size();

        return answer;
    }
}
