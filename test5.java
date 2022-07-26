// 반올림 하기 - String.format() 예제  
public class Main{
	public static void main(String[] args){
		double a = 12.34565;
		System.out.println(String.format("%.2f", a)); //결과 : 12.35
		System.out.println(String.format("%.3f", a)); //결과 : 12.346
	}
}

// 반올림 하기 - Math.round() 예제
// Math함수의 round()함수는 실수의 소수점 첫번째 자리를 반올림하여 정수로 리턴시켜줍니다. 하지만 이 메서드를 잘 활용하면 소수점 몇번째 자리까지 나타내는것도 가능합니다.
// 예를들어 12.34565*100을 하면 1234.5가 되겠죠. 여기서 round를 적용시키면 1235이라는 정수가 리턴될것입니다. 여기서 다시 100.0을 나눠주면 실수로 적용되어 나옵니다.
public class Main{
	public static void main(String[] args){
		double a = 12.34565;
		System.out.println(Math.round(a)); //결과 : 12
		System.out.println(Math.round(a*100)/100.0); //결과 : 12.35
		System.out.println(Math.round(a*1000)/1000.0); //결과 : 12.346
	}
}
