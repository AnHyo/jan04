package what;
//혹시 이거 될까요?
//인스턴스를 하나만 만들기 가능? = 싱글턴 패턴
//cmd + shift + L : 이클립스 전체 단축키 확인
public class What {
	public static void main(String[] args) {
		//static 안 붙은 메소드는 객체 생성 후에 실행해야 합니다.
		//static 붙은 메소드는 객체 없이 클래스명. 메소드명으로 실행
		//인스탄스 동일
		Human h1 = Human.getInsetance();
		Human h2 = Human.getInsetance();
		System.out.println(h1 == h2); //R타입끼리의 ==은 같은 객체인지 확인.
	}
}
//데이터베이스 연결(이것이 자바다 p243)
//싱글턴 패턴
class Human{
	//변수
	private static Human human = new Human(); //객체로 만듦
	
	//생성자
	private Human() { //외부에선 못보지만
	}
	
	//메소드
	public static Human getInsetance() {
		return human; //내부에선 볼 수 있음
		
	}
	
}
//메모리 차지할 필요 없어 이걸로 수십개 만들어 사용하기도 함.

