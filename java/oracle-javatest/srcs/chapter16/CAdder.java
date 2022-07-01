package chapter16;

public class CAdder extends PAdder {
	
	//매소드의 매개변수가 다르면 오버라이드가 아니라 오버로딩으로 처리됨
	@Override
	public int add(int a, int b) {
		System.out.println("덧셈을 진행합니다.");
		return a+b;
	}
	
}
