public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10 / 4); // ����ѧ�Ƕ�������2.5, Java����2
		System.out.println(10.0 / 4); //2.5
		double d = 10 / 4;
		System.out.println(d);

		// %ȡģ,ȡ��
		// ��Java�� %�ı��� һ����ʽ a % b = a - a / b * b
		// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		// 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1

		//++��ʹ��
		int i = 10;
		i++; //���� �ȼ��� i = i + 1
		++i; //���� �ȼ��� i = i + 1
		System.out.println("i = " + i); //12

		//��Ϊ���ʽʹ��
		//ǰ++: ++i��������ֵ
		//��++: i++�ȸ�ֵ������
		int j = 8;
		//int k = ++j; //�ȼ��� j=j+1;k=j 9 9
		int k = j++; //�ȼ��� k=j;j=j+1 8 9
		System.out.println("k=" + k + " j=" + j);
	}
}