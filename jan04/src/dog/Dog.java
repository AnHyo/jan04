package dog;
import java.util.HashSet;
import java.util.Set;

//클래스 생성시 Superclass 부분에서 지정 후 생성함.
import animal.Animal;
import animal.Human;

public class Dog extends Animal {
	
	// Integer : int의 개념. 숫자 정수
	//1~45숫자 6개를 뽑아주는 개
	public Set<Integer> lotto(){
		Set<Integer> lotto = new HashSet<Integer>();//중복제거
		while (lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) +1);
		}
		return lotto;
	}
	
	@Override
	public void sound() {
		//super.sound();
		System.out.println("멍멍....");
	}
	
	public static void main(String[] args) {
		
	//	Animal ani = new Animal(); //추상 클래스라 객체 못만들어요.
	//	ani.sound();

		
		Dog dog = new Dog();
		dog.age =10;
		
		Human human = new Human();
		human.setSsn("840411"); //저장
		System.out.println(human.getSsn());//출력
		
		Set<Integer> lotto = dog.lotto();
		System.out.println(lotto);
		
		System.out.println(dog.lotto());
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
}
