package exer;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A' ;
		
		switch (ch) {
		case 'A':
			System.out.println("입력하신 문자는 A입니다.");//A일 경우 실행이 된다.
			break;
		case 'B':
			System.out.println("입력하신 문자는 B입니다.");//A일 경우 실행이 된다.
			break;
		case 'C':
			System.out.println("입력하신 문자는 C입니다.");//A일 경우 실행이 된다.
			break;

		default: //default는 옵션, 필수는 아님.
			System.out.println("입력하신 문자는 "+ ch + " 입니다.");
			break;
		}
	}

}
