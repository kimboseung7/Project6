package object.Qz;

/*
 * 학생이 택시에 타는 과정을 구현하세요
 * 둘리 학생이 택시를 타고 학교에 값니다
 * 택시요금은 10000원을 지불했습니다
 * 단, 소지금이 만원보다 적으면 택시에 탈 수 없습니다
 * */
public class qz1 {

	public static void main(String[] args) {
		Student student = new Student("둘리", 10000);
		Taxi taxi = new Taxi("100번");
		student.takeTaxi(taxi);//둘리가 택시를 탄다
		student.showInfo();
		taxi.showInfoTaxi();

	}

}

class Taxi {
	public String taxiNum;
	public int taxiMoney;

	public Taxi(String taxiNum) {
		this.taxiNum = taxiNum;

	}

	public void take(int taxiMoney) {
		this.taxiMoney = this.taxiMoney + taxiMoney;

	}
	public void showInfoTaxi(){
		System.out.println("택시번호 " + taxiNum + "의 수입은 " + taxiMoney + "입니다.");
	}

}

class Student {
	public String studentName; // 학생이름
	public int money;

	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}

	public void takeTaxi(Taxi taxi) { //학생의 소지금이 10000원 보다 적으면 택시를 타지 않는다
		if(money< 10000) {
			System.out.println("탈 수 없습니다");
			return;
		}
		taxi.take(10000); // 10000원 지불
		this.money = this.money - 10000;
		System.out.println("탈 수 있습니다");
	}// 가진돈 10000원을 잃음

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}

}