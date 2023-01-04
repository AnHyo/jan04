package animal;
// 모든 클래스는 오브젝트의 영향권 안에 있다.
// public class Animal extends Object 가 기본 형태
// extends Object는 숨겨져 있어 public class Animal
// 형태가 기본으로 표시된다.

//클래스 앞에 abstract 붙여서 추상 클래스로 변경됨 (p329)
public abstract class Animal {
	//디폴트 상태 -> protected : 상속관계면 다른 패키지로 뛸 수 있다.
	protected int age;
	protected String name;
	/* public void sound() {
		System.out.println("동물마다 달라요.");
	} 이건 기본 타입 */ 
	
	//추상 메소드로 변신
	public abstract void sound(); //바디 없어요. 파라미터 있음(변수와 구분됨)
	public abstract void add(); //강제, 코드 통일시킬때 많이 사용 //PM
	
	public void eat() { //바디 있어요
		System.out.println("먹이를 먹습니다.");
	}
	
	
}

//상속용도로만 사용됨 = 추상화
