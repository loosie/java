package coffee;

public class BeanCoffee {
	
	String CoffeeName;
	int passengerCount;
	int money;
	
	public BeanCoffee(String CoffeeName) {
		this.CoffeeName = CoffeeName;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(CoffeeName+"�� Ŀ���� �Ǹ� ������ " + passengerCount +"�� �̰�, ������ " + money + "�Դϴ�.");
	}
}
