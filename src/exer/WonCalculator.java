package exer;

import java.util.Scanner;

public class WonCalculator {

	
	final double CHANGE_RATE =1309.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이는 얼마입니까?");
		Scanner scanner = new Scanner(System.in);
		//Scanner 객체가 선언됨.
		
		int student_age = scanner.nextInt();
		
		if(student_age >= 20){
			System.out.println("당신은 성인이시군요!");
		} else { //더 쉬운 방법이 있었음..!
			System.out.println("당신은 미성년자이시군요!");
		}
		/* if-else문이 더 간편함..
		 * if(student_age <= 20){
			*System.out.println("당신은 미성년자이시군요!");
		}*/
		
		System.out.println("입력하신 나이는 " + student_age + "입니다.");
		
		scanner.close();//스캐너 객체 닫기
		
	}

}