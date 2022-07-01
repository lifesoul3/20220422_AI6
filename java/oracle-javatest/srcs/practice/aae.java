package practice;
//method(함수)사용목적 유지보수와 확장성 증대
public class aae {//실행순서 메인함수를 먼저 실행
	public static void main(String[] args) {
	System.out.println("프로그램 시작");
	hiEveryone(7);
	hiEveryone(11);
	System.out.println("프로그램 끝");
}
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다");
		System.out.println("제 나이는"+age+"세 입니다");
		
	}
}
