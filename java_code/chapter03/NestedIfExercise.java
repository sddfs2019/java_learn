import	java.util.Scanner;
public class NestedIfExercise {
	public static void main(String[] args) {
		// 出票系统:根据淡旺季的月份和年龄,打印票价
		// 4月-10月旺季: 
		// 成人(18-60) : 60
		// 儿童(<18): 30
		// 老人(>60): 20
		// 淡季:
		// 成人:40
		// 其他:20
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			System.out.println("旺季票价");
			System.out.println("请输入年龄");
			int age = myScanner.nextInt();
			if (age >= 18 && age < 60) {
				System.out.println("成人票价为60");
			} else if (age < 18) {
				System.out.println("儿童票价为30");
			} else if (age >= 60) {
				System.out.println("老人票价为20");
			} else {
				System.out.println("年龄输入错误");
			}
		} else if ((month >= 1 && month < 4) || (month >=11 && month <= 12)) {
			System.out.println("淡季票价");
			System.out.println("请输入年龄");
			int age = myScanner.nextInt();
			if (age >= 18 && age < 60) {
				System.out.println("成人票价为40");
			} else {
				System.out.println("其他票价为20");
			}
		} else {
			System.out.println("月份输入不对");
		}
	}
}