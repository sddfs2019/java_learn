public class LogicOperator02 {
	public static void main(String[] args) {
		//��·��|| �� �߼��� |
		int age = 50;
		if (age > 20 || age < 30) {
			System.out.println("ok100");
		}

		//�߼��� |
		if (age > 20 | age < 30) {
			System.out.println("ok200");
		}

		//����
		//(1)��·��||: �����һ������Ϊtrue
		//��ڶ������������ж�,���ս��Ϊtrue,Ч�ʸ�
		int a = 4;
		int b = 9;
		if (a > 1 || ++b > 4) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b); //a=4 b=9
	}
}