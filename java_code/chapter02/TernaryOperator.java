// 三元运算符使用
public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		// 解读
		// 1. a>b 为false
		// 2.返回 b--, 先返回 b的值,然后再b-1
		// 3.返回的结果是99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
	}
}