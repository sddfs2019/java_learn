import java.util.Scanner;
public class If01 {
	public static void main(String[] args) {
		// ��дһ������,���������˵�����,�����ͬ־���������18��
		// �����"����������18,Ҫ���Լ�����Ϊ����,�������"

		// ˼·����
		// 1.�������������,Ӧ�ö���һ��Scanner ����
		// 2.�����䱣�浽һ������ int age  
		// 3.ʹ��if�ж�,�����Ӧ��Ϣ

		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		int age = myScanner.nextInt();
		if (age > 18) {
			System.out.println("����������18,Ҫ���Լ�����Ϊ����,�������");
		}
		System.out.println("�������");
	}
}