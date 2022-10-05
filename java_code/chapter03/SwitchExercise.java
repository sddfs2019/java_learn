import java.util.Scanner;
public class SwitchExercise {
	public static void main(String[] args) {
		// 使用 switch 把小写类型的
		// char型转为大写(键盘输入) 只转换a,b,c,d,e
		// 其他的输出 "other"

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入a-e");
		char c1 = myScanner.next().charAt(0);
		switch (c1) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default :
				System.out.println("other");
		}

		// 对于学生成绩大于60分的,输出"合格"低于60分的,输出"不合格"(注:输入的成绩不能大于100),提示 成绩 / 60
		// 思路分析
		// 1.这道题 可以使用分支来完成,但是要求使用switch
		// 2.这里需要进行一个转换: 
		// 如果成绩在 [60,100],(int)(成绩/60) = 1
		// 如果成绩在 [0,60],(int)(成绩/60) = 0

		// 代码实现
		double score = 88.5;
		if (score >= 0 && score <= 100) {
				switch ((int)(score / 60)) {
			case 0 :
				System.out.println("不合格");
				break;
			case 1 : 
				System.out.println("合格");
				break;
			}
		} else {
			System.out.println("输入的成绩有误");
		}

		// 根据指定月份
		// 打印该月份所属的季节
		// 3,4,5春季 6,7,8夏季 9,10,11秋季 12,1,2冬季
		// 提示:使用穿透
		int month = 6;
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("春季");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("夏季");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("秋季");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("冬季");
			break;
		default :
			System.out.println("输入的月份不对");
		}
	}
}