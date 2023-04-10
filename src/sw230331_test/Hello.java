/*
 * 소스파일: Hello.java
 */

//한줄짜리 주석문

package sw230331_test;

public class Hello {
	
	public static int sum(int n, int m) {//public: 접근지정자 
		return n+m;
	}

	public static void main(String[] args) {
		int i =20;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		
	}

}
