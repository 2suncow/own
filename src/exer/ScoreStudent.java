package exer;

import java.util.Scanner;

public class ScoreStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		
		System.out.println("당신의 성적을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if (score>=90) {
			grade='A'; //System.out.println("당신의 성적은 수 입니다.");
		} else if (score >= 80) {
			grade='B'; //System.out.println("당신의 성적은 우 입니다.");
		} else if (score >= 70) {
			grade='C'; //System.out.println("당신의 성적은 미 입니다.");
		} else if (score >= 60) {
			grade='D'; //System.out.println("당신의 성적은 양 입니다.");
		} else {
			grade='F'; //System.out.println("당신의 성적은 가 입니다.");
		}
		
		System.out.println("당신의 학점은 "+ grade + " 입니다.");
		scanner.close();
		
	}

}
