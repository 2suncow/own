package exer;

import java.util.Scanner;

public class Socre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("당신의 점수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if(score >= 80) {
			System.out.println("당신은 우수 입니다!");
		} else if(score >= 60){//(score < 80) 이미 80이 안되서 내려온 것이기 때문에 의미 없음.
			System.out.println("당신은 보통 입니다!");
		} else if(score < 40) {
			System.out.println("당신은 미달입니다.");
		} else {
			System.out.println("당신은 낙제 입니다!");
		}
		
		
		
	}

}
