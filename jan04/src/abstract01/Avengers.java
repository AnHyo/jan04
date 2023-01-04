package abstract01;

public class Avengers {

	public static void main(String[] args) {
		Ironman ironman = new Ironman();
		Hulk hulk = new Hulk();
		Superman superman = new Superman();
		Antman antman = new Antman();
		
		/* ironman.attack();
		hulk.attack();
		superman.attack();
		antman.attack(); */

		//한번에 출력 가능?
		Hero[] avan = new Hero[4];
		avan[0] = ironman; //부모타입이더라도 생성은 Ironman, 오버라이드된 값을 가져간다.
		avan[1] = hulk;
		avan[2] = superman;
		avan[3] = antman;
		//= 다형성, 부모타입으로 변환 가능하므로.
		
		for(int i=0; i<avan.length;i++) {
			avan[i].attack();
		}
		
		//다형성
		Hero h1 = new Ironman();
		h1.attack();//레이저
		h1.defense();
		//javis 안나옴.. Hero엔 javis가 없기 때문.
		//숨겨져 있음
		
		//Ironman 타입으로 변환
		((Ironman)(h1)).javis = "";
		((Ironman)(h1)).callJavis();
		
		Ironman h2 = (Ironman) h1;
		h2.callJavis();
		//부모타입, super타입으로 변환 가능
		
		Object obj = new Ironman(); //오브젝트는 최상위 타입 변환은 가능.
		
		/*	다형성
		 * 	다형성은 동적바인딩을 지원해야 합니다.
		 * 		
		 * 	런타임때 최종 타입이 결정되는 것.
		 * 	(런타임 : 실제 메모리에서 구동될 때)
		 * 
		 * 	다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능 
		 * 
		 */

		
	}

}
