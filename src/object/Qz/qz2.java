package object.Qz;

public class qz2 {
//인스턴스 3개 손님1 손님2 카페
	public static void main(String[] args) {
		Customer customer1 = new Customer("둘리",10000);
		Customer customer2 = new Customer("또치",20000);
		Caffe caffe = new Caffe("별다방 카페");
		customer1.buyAme(caffe);
		customer2.buyLa(caffe);
		caffe.showInfo();
		customer1.ShowInfo();
		customer2.ShowInfo();
	}

}

class Caffe {
	public String caffeName;
	public String Menu;
	public int price;

	public Caffe(String caffeName) {
		super();
		this.caffeName  = caffeName;
		
	}
	public void take(int price) {
		this.price = this.price + price;
	}

	public void showInfo() {
		System.out.println("카페 :" + caffeName + " 수익은 " + price + "입니다");
	}

}

class Customer {
	public String customerName;
	public int money;

	public Customer(String customerName, int money) {
		super();
		this.customerName = customerName;
		this.money = money;
	}

	public void buyAme(Caffe americano) {
		if(money<4000) {
			System.out.println("살 수 없습니다");
			return;
		}
		americano.take(4000);
		this.money = this.money - 4000;
		

	}
	public void buyLa(Caffe latte) {
		if(money<4500) {
			System.out.println("살 수 없습니다");
			return;
		}
		latte.take(4500);
		this.money = this.money - 4500;

	}
	public void ShowInfo() {
		System.out.println(customerName + "님의 남은 돈은 " + money + "입니다");
	}
}