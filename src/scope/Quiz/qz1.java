package scope.Quiz;

class A{
	
	public int field1; //어디서든 사용 가능
	int field2;// 같은 패키지 안에서 사용 (맨 위에 scope.Quiz를 의미)
	private int field3;// 클래스 내부에서 사용 private A라는 클래스 내부에서 사용가능
}
