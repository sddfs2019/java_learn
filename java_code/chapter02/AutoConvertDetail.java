public class AutoConvertDetail {
	public static void main(String[] args) {
		//�ж������͵����ݻ������ʱ
		//ϵͳ�����Զ�����������ת������������������������,Ȼ���ٽ��м���
		int n1 = 10; //ok
		//float d1 = n1 + 1.1; //���� n1 + 1.1 => ��������� double
		double d1 = n1 + 1.1; //�� n1 + 1.1 => ��������� double
		float d2 = n1 + 1.1F;

		//�����ǰѾ���(����)����������͸�ֵ������(����)С����������ʱ,
		//�ͻᱨ��,��֮�ͻ�����Զ�����ת��
		//int n2 = 1.1; //���� double -> int

		//(byte,short)��char֮�䲻���໥�Զ�ת��
		//���Ѿ�����ֵ����byteʱ,���жϸ����Ƿ���byte��Χ��
		byte b1 = 10; //��
		//int n2 = 1;
		//byte b2 = n2; //�� ����Ǳ�����ֵ,���ж�����
		//char c1 = b1; //�� byte�����Զ�ת����char

		//ϸ��4:byte,short,char ���߿��Լ���,�ڼ���ʱ����ת����Ϊint����
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1; //�� b2 + s1 => int
		int s2 = b2 + b1;

		//byte b4 = b2 + b3; //���� b2 + b3 => int

		//boolean������ת��
		boolean pass = true;
		// int num100 = pass; boolean ���������͵��Զ�ת��

		//�Զ�����ԭ��:���ʽ����������Զ�����Ϊ ����������������

		byte b4 = 1;
		short s3 = 100;
		float num200 = 1;
		double num300 = 1.1;

		//float num500 = b4 + s3 + num200 + num300; //���� b4 + s3 + num200 + num300 =>double
	}
}