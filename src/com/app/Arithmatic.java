import java.util.Scanner;

class Calc{
	private static int a;
	private static int b;
	
	Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	static int add() {
		return a+b;
	}
	static int sub() {
		return a-b;
	}
	static int mult() {
		return a*b;
	}
}
public class Arithmatic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number\t\t :");
		int a = sc.nextInt();
		System.out.print("Enter second Number\t\t :");
		int b = sc.nextInt();
		new Calc(a, b);
		System.out.println("Addition\t\t :"+Calc.add());
		System.out.println("Subtraction\t\t :"+Calc.sub());
		System.out.println("Multiplication\t\t :"+Calc.mult());

	}

}
