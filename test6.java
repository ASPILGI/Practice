// 문자열에서 특정 문자 개수 구하기
// 문자열과 문자를 매개변수 값으로 가지는 다음 메서드가 있다. 문자열 s에 포함된 문자 c의 개수를 반환하도록 이 메서드를 구현 
// static int countChar(String s, char c)

public class Main {
	public static void main(String[] args) {

		String str = "Hello every one";

		System.out.println(countChar(str, 'l')); 
		System.out.println(countChar(str, 'o')); 
		System.out.println(countChar(str, 'e')); 
	}

	public static int countChar(String str, char ch) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}
}
