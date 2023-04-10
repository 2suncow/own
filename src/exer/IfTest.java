package exer;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =70;
		int grade =2;
		
		if (score >= 60) {
			if (grade != 4) {
				System.out.println("성적 우수!");
				if(grade==2) {
					System.out.println("2학년 등수 ");
				} //if문 안에 if문 이 2개 이상은 스파게티 코드임.
					//그래서 1개만 들어가는게 좋음.
			}
		}
	}

}
