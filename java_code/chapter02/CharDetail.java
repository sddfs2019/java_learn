public class CharDetail {
	public static void main(String[] args) {
		//��Java��,char�ı�����һ������,��Ĭ�����ʱ,��unicode���Ӧ���ַ�
		//Ҫ�����Ӧ������,����(int)�ַ�
		char c1 = 97;
		System.out.println(c1); //a

		char c2 = 'a';
		System.out.println((int)c2); //97

		char c3 = '��';
		System.out.println((int)c3); //38889

		char c4 = 38889;
		System.out.println(c4); //��

		//char�����ǿ��Խ��м����,�൱��һ������,��Ϊ������Ӧ��unicode��
		System.out.println('a' + 10); //107

		char c5 = 'b' + 1;
		System.out.println((int)c5); //99
		System.out.println(c5); //c
	}
}