package coffee;

public class StarCoffee {
	
	String CoffeeName;
	int passengerCount;
	int money;
	
	public StarCoffee(String CoffeeName) {
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
