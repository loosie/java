package inheritance;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private int agentID;

	public VIPCustomer() {
		
//		customerGrade = "VIP";
//	 	private -> ��Ӱ��迡�� ���پȵ�
//		�ܺο��� private������ ��Ӱ��迡���� ���� �����ϰ� �Ϸ��� protected���
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
}
