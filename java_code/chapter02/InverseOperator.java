public class InverseOperator {
	public static void main(String[] args) {
		//! ������ȡ�� T -> F, F -> T
		System.out.println(60 > 20); //true
		System.out.println(!(60 > 20)); //false

		//a^b: ���߼����,��a��b��ͬʱ,����Ϊtrue,����Ϊfalse
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println(b);
	}
}