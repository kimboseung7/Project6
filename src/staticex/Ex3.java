package staticex;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println(1*10*Calculator.pi);
		System.out.println(Calculator.plus(10, 5));
		System.out.println(Calculator.minus(10, 5));

	}

}

class Calculator {
	static double pi = 3.14159; //원의 둘레를 구하는 파이값 //고유한 값인지 아닌지를 생각해보고 static을 붙여준다

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}