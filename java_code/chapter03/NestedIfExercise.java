import	java.util.Scanner;
public class NestedIfExercise {
	public static void main(String[] args) {
		// ��Ʊϵͳ:���ݵ��������·ݺ�����,��ӡƱ��
		// 4��-10������: 
		// ����(18-60) : 60
		// ��ͯ(<18): 30
		// ����(>60): 20
		// ����:
		// ����:40
		// ����:20
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·�");
		int month = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			System.out.println("����Ʊ��");
			System.out.println("����������");
			int age = myScanner.nextInt();
			if (age >= 18 && age < 60) {
				System.out.println("����Ʊ��Ϊ60");
			} else if (age < 18) {
				System.out.println("��ͯƱ��Ϊ30");
			} else if (age >= 60) {
				System.out.println("����Ʊ��Ϊ20");
			} else {
				System.out.println("�����������");
			}
		} else if ((month >= 1 && month < 4) || (month >=11 && month <= 12)) {
			System.out.println("����Ʊ��");
			System.out.println("����������");
			int age = myScanner.nextInt();
			if (age >= 18 && age < 60) {
				System.out.println("����Ʊ��Ϊ40");
			} else {
				System.out.println("����Ʊ��Ϊ20");
			}
		} else {
			System.out.println("�·����벻��");
		}
	}
}