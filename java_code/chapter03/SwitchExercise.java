import java.util.Scanner;
public class SwitchExercise {
	public static void main(String[] args) {
		// ʹ�� switch ��Сд���͵�
		// char��תΪ��д(��������) ֻת��a,b,c,d,e
		// ��������� "other"

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������a-e");
		char c1 = myScanner.next().charAt(0);
		switch (c1) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default :
				System.out.println("other");
		}

		// ����ѧ���ɼ�����60�ֵ�,���"�ϸ�"����60�ֵ�,���"���ϸ�"(ע:����ĳɼ����ܴ���100),��ʾ �ɼ� / 60
		// ˼·����
		// 1.����� ����ʹ�÷�֧�����,����Ҫ��ʹ��switch
		// 2.������Ҫ����һ��ת��: 
		// ����ɼ��� [60,100],(int)(�ɼ�/60) = 1
		// ����ɼ��� [0,60],(int)(�ɼ�/60) = 0

		// ����ʵ��
		double score = 88.5;
		if (score >= 0 && score <= 100) {
				switch ((int)(score / 60)) {
			case 0 :
				System.out.println("���ϸ�");
				break;
			case 1 : 
				System.out.println("�ϸ�");
				break;
			}
		} else {
			System.out.println("����ĳɼ�����");
		}

		// ����ָ���·�
		// ��ӡ���·������ļ���
		// 3,4,5���� 6,7,8�ļ� 9,10,11�＾ 12,1,2����
		// ��ʾ:ʹ�ô�͸
		int month = 6;
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("����");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("�ļ�");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("�＾");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("����");
			break;
		default :
			System.out.println("������·ݲ���");
		}
	}
}