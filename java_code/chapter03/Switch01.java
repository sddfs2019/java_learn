import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		// 请编写一个程序,该程序可以接收一个字符,比如:a,b,c,d,e,f,g
		// a表示星期一,b表示星期二
		// 思路分析
		// 1.接收一个字符,创建Scanner对象
		// 2.使用switch来完成匹配,并输出对应信息

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-g)");
		char c1 = myScanner.next().charAt(0);
		switch (c1) {
			case 'a' :
				System.out.println("今天星期一");
				break;
			case 'b' :
				System.out.println("今天星期二");
				break;
			case 'c' :
				System.out.println("今天星期三");
				break;
			default :
				System.out.println("你输入的字符不正确");
		}
		System.out.println("退出了switch,继续执行程序");
	}
}