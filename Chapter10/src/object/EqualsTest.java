package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
//			�ٿ�ĳ����
			Student std = (Student)obj;
		
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else return false;
		}
		return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
	/*	
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
//		�������� ����
		System.out.println(str1.equals(str2));
		
		*/
		
		Student Lee = new Student(100,"������");
		Student Lee2 = Lee; 
		Student Jong = new Student(100,"������");
		
		System.out.println(Lee == Jong);
		
//		equals �������̵����� ������
		System.out.println(Lee.equals(Jong));
		
		
//		�޸𸮰� �޶� �ֹι�ȣ�� �й��̳� ����� ������ ���� ����� �Ͽ� ���� �߻�����
//		��ü�� ���ٴ� ���� hashCode�� ���ٴ� ���� ����.
		
	}
}
