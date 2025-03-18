// 정렬 - K번째 수
// x번째 수를 구할때 인덱스에서는 -1을 해줘야한다 그이유는 인덱스는 0부터 시작하기 때문이다.
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
