public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10 / 4); // 从数学角度来看是2.5, Java中是2
		System.out.println(10.0 / 4); //2.5
		double d = 10 / 4;
		System.out.println(d);

		// %取模,取余
		// 在Java中 %的本质 一个公式 a % b = a - a / b * b
		// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		// 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1

		//++的使用
		int i = 10;
		i++; //自增 等价于 i = i + 1
		++i; //自增 等价于 i = i + 1
		System.out.println("i = " + i); //12

		//作为表达式使用
		//前++: ++i先自增后赋值
		//后++: i++先赋值后自增
		int j = 8;
		//int k = ++j; //等价于 j=j+1;k=j 9 9
		int k = j++; //等价于 k=j;j=j+1 8 9
		System.out.println("k=" + k + " j=" + j);
	}
}