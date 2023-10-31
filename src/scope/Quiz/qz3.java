package scope.Quiz;

public class qz3 {

	public static void main(String[] args) {
		Person person = new Person();//person는 메인함수가 끝나기 전까지 사용가능
		
		int i = 10; //i는 메인함수가 끝나기 전까지 사용가능
		
		if(i>1) {
			String str = "안녕하세요"; //지역변수 str은 if문 블록이 끝나기 전까지 사용 가능
			System.out.println();
		}
		for(int k = 0; k<10; k++) {
			System.out.println(k); //지역변수 k는 for문 블록이 끝나기 전까지 사용 가능
		}
		System.out.println();
	}
	//블록스코프에 따라 달라진다
}
