// 혼합문자열에서 숫자만 뽑기
public class test3{
  public static void main(String[] args){
    String input = "1,3,4,8,a,x,t";
    // replaceAll 문법을 활용해서 0-9가 아닌 것들을 다 없애버림
    String a = input.replaceAll("[^0-9]", "");
    System.out.println(a);
  }
}
