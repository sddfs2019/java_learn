public class FloatDetail {
	public static void main(String[] args) {
		//Java�ĸ����ͳ���(����ֵ)Ĭ��Ϊdouble��,����float�ͳ���,����'f'��'F'
		//float num1 = 1.1;//����
		float num2 = 1.1F;
		double num3 = 1.1;
		double num4 = 1.1F;
		//ʮ��������ʽ: 5.12    512.0f    .512   (������С����)
		double num5 = .123; //�ȼ� 0.123
		System.out.println(num5); // 0.123
		//��ѧ��������ʽ: ��: 5.12e2     5.12E-2
		System.out.println(5.12e2); // 512.0
		System.out.println(5.12E-2); // 0.0512

		//ͨ�������,Ӧ��ʹ��double��,��Ϊ����float�͸���ȷ
		//����˵�� double num9 = 2.1234567851; float num10 = 2.1234567851F;
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9); //2.1234567851
		System.out.println(num10); //2.1234567

		//������ʹ������: 2.7 �� 8.1 / 3 �Ƚ�
		//����һ�δ���
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11); // 2.7
		System.out.println(num12); //2.6999999999999997 �ӽ�2.7��һ��С��,������2.7
		//�õ�һ����Ҫ��ʹ�õ�: �����Ƕ���������С���Ľ�������ж�ʱ,ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ,��ĳ�����ȷ�Χ���ж�
		if (num11 == num12) {
			System.out.println("���");
		}
		// ��ȷ��д��
		if (Math.abs(num11 - num12) < 0.000001) {
			System.out.println("��ֵ�ǳ�С,���˹涨�ľ�����Ϊ���...");
		}
		//����ͨ��Java API����
		System.out.println(Math.abs(num11 - num12));

		//ϸ��:�����ֱ�Ӳ�ѯ�õ���С������ֱ�Ӹ�ֵ,�ǿ����ж����
	}
}