package LearningJava;

public class JavaLearningClass1 {

	public static void main(String[] args) {
		
		int s = 10;
		int t = 5;

		System.out.println(s + t);
		System.out.println(s - t);
		System.out.println(s * t);
		System.out.println(s / t);
		System.out.println(s % t);

		int a = 90;
		int b = 45;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		Calculator(12, 6);
		Calculator(10, 3);

	}

	static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}

	public static int Calculatotr2(int x, int y) {
		return x + y;
	}

}
	


