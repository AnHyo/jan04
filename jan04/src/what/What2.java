package what;

public class What2 {
	public static void main(String[] args) {
		for (int i = A ; i < C ; i++) {
			//여기서 숫자를 쓰지 않고 반복문 돌리기 가능?
		}
	
	//1 -9까지 모두 더하는 프로그램 만들기...............
			int result = 0;
			for(int i = 1; i <10 ; i++) {
				//System.out.println(i);
				result += i;
			}
			System.out.println(result);
			//데이터 스코프 : 어디부터 어디까지 반복?
			
			//1 - 9 까지 짝수만 더하기 가능?
			result = 0;
			for(int i = 0; i<= 9; i ++) {
				if(i % 2 == 0 ) {
					result += i;
				}
			}
			System.out.println(result);
			
			
	}
}
