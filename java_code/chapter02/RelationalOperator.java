public class RelationalOperator {
	public static void main(String[] args) {
		int a = 9;
		int b = 8;
		System.out.println(a > b); //true
		System.out.println(a >= b); //true
		System.out.println(a <= b); //false
		System.out.println(a < b); //false
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		boolean flag = a > b;
		System.out.println("flag=" + flag); //true
	}
}