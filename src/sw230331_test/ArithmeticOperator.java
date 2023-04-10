package sw230331_test;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		int time = scanner.nextInt(); //정수를 입력
		int second =time %60; //60으로 나눈 나머지 =초
		int minute = (time/60)%60; //60으로 나눈 몴을 다시 60으로 나눈 나머지 =분
		int hour = (time/60)/60; //60으로 나눈 몫을 다시 60으로 나눈 몫 = 시간
		
		System.out.print(time + "초는");
		System.out.print(hour + "시간, ");
		System.out.print(minute +"분, ");
		System.out.print(second + "초입니다.");
		
		scanner.close();
	}

}
