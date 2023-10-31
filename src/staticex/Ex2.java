package staticex;

public class Ex2 {

	public static void main(String[] args) {
		Student2 student1 = new Student2();
		student1.studentName = "둘리";
		System.out.println(Student2.getCount());
		
		Student2 student2 = new Student2();
		student2.studentName = "도우너";
		System.out.println(Student2.getCount());

	}

}
class Student2{
	private static int count = 0;
	int studentID;
	String studentName;
	
	public Student2() {
		count++;
		studentID = count;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) { //외부에서 전달 받은 값을 대체
		Student2.count = count; //static 변수는 this 사용못함
		}
	
	
}