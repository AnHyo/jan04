package animal;
//					두개의 클래스를 연결.
public class Human extends Animal {

	//필드
	private String ssn;
	final static int NUM = 101;//절대수정불가, 클래스에 붙어다님
	static int check = 500;//클래스에 붙어 다님
	
	//생성자
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		// -기호 빼기
		ssn = ssn.replace("-","");
		if(ssn.length() < 12) {
			//모자란 자리수만큼 *로 입력해서 저장하기
			for(int i=0; 13 > ssn.length();i++) {
				ssn +="*";
			}
		}
		this.ssn = ssn;
	}
	
	//add()
	//메소드
	int add(int num1, int num2){
		return num1 + num2; //Int 타입으로 반환됨
	}
	
	
   @Override //단축키에서 찾아서 불러와야함
	public void sound() {
		//super.sound();
		System.out.println("아....추움...");
	}
	
	
	
	public static void main(String[] args) {
		Human human = new Human();
		//Object h = new Human();
		//부모			자식
		//Animal h2 = new Human();
		//List
		
		Human.check = 5000;//static붙은 녀석들은 클래스명.변수명
		//human.check = 100;
		//Human.NUM = 15015;
		
		int result = human.add(15, 30);
		//int re = new Human();
		//human.ssn = "주민번호";
		human.setSsn("840411"); //저장
		System.out.println(human.getSsn());//출력
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
}
