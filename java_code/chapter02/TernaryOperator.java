// ��Ԫ�����ʹ��
public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		// ���
		// 1. a>b Ϊfalse
		// 2.���� b--, �ȷ��� b��ֵ,Ȼ����b-1
		// 3.���صĽ����99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
	}
}