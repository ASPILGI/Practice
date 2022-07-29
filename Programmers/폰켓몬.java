// 1. 가질 수 있는 폰켓몬의 수를 구하기
// 2. nums배열 속 숫자를 ArrayList함수로 중복을 제거하여 폰켓몬이 몇 종류가 있는지 구하기
// 3. 폰켓몬의 종류가 가질 수 있는 수보다 많으면 return 가질수 있는 폰켓몬의 수
//    폰켓몬의 종류가 가질 수 있는 수보다 적으면 return 폰켓몬의 종류

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
