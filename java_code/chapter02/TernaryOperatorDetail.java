public class TernaryOperatorDetail {
	public static void main(String[] args) {
		// ���ʽ1�ͱ��ʽ2ҪΪ���Ը������ձ���������(������Զ�ת��)
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;
		// c = a > b ? 1.1 : 3.4; ���� �漰�����Ͳ�����
		double d = a > b ? a : b + 3; // ���� int --> double
	}
}