import java.util.Scanner;
public class If03 {
	public static void main(String[] args) {
		// ���뱣��ͬ־��֥�����÷�:
		// ���:
		// ���÷�Ϊ100ʱ,��� ���ü���;
		// ���ø���Ϊ(80,99]ʱ,�����������;
		// ���÷�Ϊ[60,80]ʱ,�������һ��;
		// �������,��� ���� ������
		// ��Ӽ������뱣����֥�����÷�,�������ж�
		// �ٶ����÷�Ϊint

		Scanner myScanner = new Scanner(System.in);
		// �����û�����
		System.out.println("���������÷�:");
		// ��˼��:���С�������Ĳ�������,����hello..
		// ����������ʹ���쳣�������
		int grade = myScanner.nextInt();

		// �ȶ���������÷�,����һ����Χ����Ч�ж� 1-100,������ʾ�������
		if (grade >= 1 && grade <= 100) {
			// ��Ϊ��4�����,����ʹ�ö��֧
			if (grade == 100) { // ���÷�Ϊ100ʱ,��� ���ü���;
				System.out.println("���ü���");
			} else if (grade >80 && grade <=99) {
				System.out.println("��������");
			} else if (grade >= 60 && grade < 80) { // ���÷�Ϊ[60,80]ʱ,�������һ��;
				System.out.println("����һ��");
			} else {
				System.out.println("���ò�����"); // �������,��� ���� ������
			}
		} else {
			System.out.println("���÷���Ҫ��1-100,����������");
		}
		
	}
}