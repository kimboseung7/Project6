package scope.Quiz;
/*
 * 모든 변수의 유효범위를 작성하세요
 * 
 * */

class Person{
	String personName; //멤버변수(인스턴트 변수), 함수 내부에서 사용 (인스턴트 생성시 사용 가능)
	int personAge;
	static char gender = 'F'; // 클래스 변수, 클래스 내부에서 사용 static  모든 인스턴스 공유 전역변수 (인스턴스를 생성하지않아도 사용 가능)
	
	public void setPersonName(String name) { 
		this.personName = name;//지역변수, 함수 기능 구현 (메소드 안에서만 사용가능)
	}
	public void setPersonAge(int age) {
		this.personAge = age;//지역변수, 함수 기능 구현 (메소드 안에서만 사용가능)
	}
}