public class ForDetail {
	public static void main(String[] args) {
		// for (; ѭ���ж�����; )�еĳ�ʼ���ͱ�����������д��2�����ط�,�������ߵķֺŲ���ʡ��

		// ʹ��forѭ��
		int i = 1;
		for (; i <= 10; ) {
			System.out.println("��� " + i);
			i++;
		}

		// ����
		// for (; ; ) { // ��ʾ����ѭ��,��ѭ��
		// 	System.out.println("ok~");
		// }

		// ѭ��������ʼֵ�����ж�����ʼ�����,��Ҫ������һ��,�����м��ö��Ÿ���
		// ѭ����������Ҳ�����ж��������������,�м��ö��Ÿ���
		int count = 3;
		for (int k = 0, j = 0; k < count; k++, j+= 2) {
			System.out.println("k = " + k + " j = " + j);
		}
	}
}