import	java.util.Scanner; // 表示把java.util下的Scanner类导入
public class Input {
	public static void main(String[] args) {
		// 步骤
		// 1.引入 Scanner类所在的包
		// 2.创建 Scanner 对象

		Scanner myScanner = new Scanner(System.in);
		// 3.接收用户的输入
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入工资");
		double sal = myScanner.nextDouble();
		System.out.println("名字:" + name + " 年龄 " + age + " 工资 " + sal);
	}
}