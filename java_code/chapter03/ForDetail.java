public class ForDetail {
	public static void main(String[] args) {
		// for (; 循环判断条件; )中的初始化和变量迭代可以写到2其他地方,但是两边的分号不能省略

		// 使用for循环
		int i = 1;
		for (; i <= 10; ) {
			System.out.println("你好 " + i);
			i++;
		}

		// 补充
		// for (; ; ) { // 表示无限循环,死循环
		// 	System.out.println("ok~");
		// }

		// 循环变量初始值可以有多条初始化语句,但要求类型一样,并且中间用逗号隔开
		// 循环变量迭代也可以有多条变量迭代语句,中间用逗号隔开
		int count = 3;
		for (int k = 0, j = 0; k < count; k++, j+= 2) {
			System.out.println("k = " + k + " j = " + j);
		}
	}
}