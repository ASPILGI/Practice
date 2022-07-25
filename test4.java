// 합계와 평균값 구하기
public class Main{
	public static void main(String[] args){
		int sum = 0;
		float average = 0f;

		int[] score = {100, 32, 53, 67, 55};

		for (int i=0; i<score.length; i++){
			sum += score[i];
		}

		average = sum / (float)score.length;

		System.out.println("합계 : " + sum);
		System.out.println("평균값 :" + average); 
	}
}
