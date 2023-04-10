package exer;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("무슨 커피를 드릴까요?");
		Scanner scanner = new Scanner(System.in);
		String order = scanner.next();
		
		int price = 0;
		
		switch (order) {
		case "카푸치노":
		case "카페라떼":
		case "바닐라라떼":
			price = 2500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
		}
		
		if(price != 0) {
			System.out.println(order + "는 " + price +"입니다.");
		}
	}

}
