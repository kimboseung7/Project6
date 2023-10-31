package staticex;
/*
 * static 변수 사용하기 모두 변수가 공유하는 속성
 * */
public class Ex1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "둘리";
		System.out.println(student1.studentName + "학번:" + student1.studentID);
		
		Student student2 = new Student();
		student2.studentName = "또치";
		System.out.println(student2.studentName + "학번:" + student2.studentID);
		
		System.out.println(Student.count);
		//학생 수가 증가 할 때마다 count
	}

}
class Student{
	static int count = 0; //공통 속성
	int studentID;  // 인스턴스 변수 - 초기화x
	String studentName; // 인스턴스 변수 - 초기화x 정보가 다르기 때문에 값을 대입할 필요가 없다
	
	public Student() {
		count++; //학생이 생성될 때마다 증가
		studentID = count; //증가된 값을 학번에 부여
		
	}
}