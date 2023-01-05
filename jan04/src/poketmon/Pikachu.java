package poketmon;

public class Pikachu extends MonsterBoll implements Go{

	@Override
	public void attack() {
		System.out.println("백만볼트");
		
	}

	@Override
	public void attack2() {
		System.out.println("고속이동");
		
	}

	@Override
	public void attack3() {
		System.out.println("아이언테일");
		
	}

	@Override
	public int hp() {
		// TODO Auto-generated method stub
		return 0;
	}

}
