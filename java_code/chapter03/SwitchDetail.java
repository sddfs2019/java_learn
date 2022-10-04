public class SwitchDetail {
	public static void main(String[] args) {
		// 细节1
		// 表达式数据类型,应和case后的常量类型一致
		// 或者是可以自动转成可以相互比较的类型,比如输入的是字符,而常量是int

		// 细节2
		// switch(表达式)中表达式的返回值必须是:(byte,short,int,char,enum[枚举],String)

		// 细节3
		// case子句中的值必须是常量(1, 'a'),而不能是变量

		// 细节4
		// default子句是可选的,当没有匹配到case时,执行default
		// 如果没有default子句,又没有匹配任何常量,则没有输出

		// 细节5
		// 如果break语句用来再执行完一个case分支后使程序跳出switch语句块;
		//如果没有写break,程序会顺序执行到switch结尾
		char c = 'a';
		switch (c) {
		case 'a' : 
			System.out.println("ok1");
			break;
		case 'b' :
			System.out.println("ok2");
			break;
		default :
			System.out.println("ok3");
		}
	}
}