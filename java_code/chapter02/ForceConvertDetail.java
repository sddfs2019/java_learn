public class ForceConvertDetail {
	public static void main(String[] args) {
		// int x = (int)10 * 3.5 + 6 * 1.5; //�������
		int y = (int)(10 * 3.5 + 6 * 1.5); //(int)44.0
		System.out.println(y);

		char c1 = 100; //ok
		int m = 100; //ok
		//char c2 = m; //����
		char c3 = (char)m; //����
		System.out.println(c3); //d
	}
}