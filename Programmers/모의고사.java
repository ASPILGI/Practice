import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
       
        // 수포자 3명의 패턴
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        // 정답을 몇 개를 맞추는 지 넣을 배열
        int[] score = new int[3];

        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5]) score[0]++;
            if(answers[i] == b[i%8]) score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }

        // 가장 많이 맞춘 문제 개수 찾기 - Math.max 
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        // 최고 점수인 수포자 구하기
        List<Integer> list = new ArrayList<>();

        if(max == score[0])
            list.add(1);
        if(max == score[1])
            list.add(2);
        if(max == score[2])
            list.add(3);

        // 정답 출력
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = (int) list.get(i);
        }
        return answer;
    }
}
