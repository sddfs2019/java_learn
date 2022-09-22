public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
		int i = 1; // i --> i
		i = i++; //(1)temp = i; (2) i=i+1; (3)i=temp;
		System.out.println(i); //1

		int k = 1;
		k = ++k; //规则使用临时变量:(1)k=k+1;(2)temp=k;(3)k=temp;
		System.out.println(k); //2

		int i1 = 10;
		int i2 = 20;
		int i3 = i1++;
		System.out.println("i3=" + i3); //10
		System.out.println("i2=" + i2); //20
		i3 = --i2;
		System.out.println("i3=" + i3); //19
		System.out.println("i2=" + i2); //19
	}
}