public class SwitchDetail {
	public static void main(String[] args) {
		// ϸ��1
		// ���ʽ��������,Ӧ��case��ĳ�������һ��
		// �����ǿ����Զ�ת�ɿ����໥�Ƚϵ�����,������������ַ�,��������int

		// ϸ��2
		// switch(���ʽ)�б��ʽ�ķ���ֵ������:(byte,short,int,char,enum[ö��],String)

		// ϸ��3
		// case�Ӿ��е�ֵ�����ǳ���(1, 'a'),�������Ǳ���

		// ϸ��4
		// default�Ӿ��ǿ�ѡ��,��û��ƥ�䵽caseʱ,ִ��default
		// ���û��default�Ӿ�,��û��ƥ���κγ���,��û�����

		// ϸ��5
		// ���break���������ִ����һ��case��֧��ʹ��������switch����;
		//���û��дbreak,�����˳��ִ�е�switch��β
		char c = 'a';
		switch (c) {
		case 'a' : 
			System.out.println("ok1");
			break;
		case 'b' :
			System.out.println("ok2");
			break;
		default :
			System.out.println("ok3");
		}
	}
}