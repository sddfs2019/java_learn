import	java.util.Scanner; // ��ʾ��java.util�µ�Scanner�ർ��
public class Input {
	public static void main(String[] args) {
		// ����
		// 1.���� Scanner�����ڵİ�
		// 2.���� Scanner ����

		Scanner myScanner = new Scanner(System.in);
		// 3.�����û�������
		System.out.println("����������");
		String name = myScanner.next();
		System.out.println("����������");
		int age = myScanner.nextInt();
		System.out.println("�����빤��");
		double sal = myScanner.nextDouble();
		System.out.println("����:" + name + " ���� " + age + " ���� " + sal);
	}
}