import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		// ���дһ������,�ó�����Խ���һ���ַ�,����:a,b,c,d,e,f,g
		// a��ʾ����һ,b��ʾ���ڶ�
		// ˼·����
		// 1.����һ���ַ�,����Scanner����
		// 2.ʹ��switch�����ƥ��,�������Ӧ��Ϣ

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�(a-g)");
		char c1 = myScanner.next().charAt(0);
		switch (c1) {
			case 'a' :
				System.out.println("��������һ");
				break;
			case 'b' :
				System.out.println("�������ڶ�");
				break;
			case 'c' :
				System.out.println("����������");
				break;
			default :
				System.out.println("��������ַ�����ȷ");
		}
		System.out.println("�˳���switch,����ִ�г���");
	}
}