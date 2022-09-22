public class TernaryOperatorDetail {
	public static void main(String[] args) {
		// 表达式1和表达式2要为可以赋给接收变量的类型(或可以自动转换)
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;
		// c = a > b ? 1.1 : 3.4; 不行 涉及到类型不兼容
		double d = a > b ? a : b + 3; // 可以 int --> double
	}
}