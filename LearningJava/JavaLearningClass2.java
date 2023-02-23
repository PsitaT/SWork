package LearningJava;

public class JavaLearningClass2 {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);

		int s = 10;
		int t = 5;
		int q = s + t;
		System.out.println(q);
		System.out.println(s + t);
		System.out.println(q + q);

		System.out.println(s + t);
		System.out.println(s - t);
		System.out.println(s * t);
		System.out.println(s / t);
		System.out.println(s % t);

		int q1 = 90;
		int q2 = 45;
		System.out.println(q1 + q2);
		System.out.println(q1 - q2);
		System.out.println(q1 * q2);
		System.out.println(q1 / q2);
		System.out.println(q1 % q2);

		// calling the function

		Cal(120, 60);
		Cal(10, 5);

		// Calling function without parameter and without returns

		CalA();
		CalA();
		CalA();

		// calling function with parameter and without return type
		CalB(120, 60);
		CalB(12, 6);
		CalB(10, 5);

	}

	static void Cal(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}

	// Function without parameter and without return

	static void CalA() {
		System.out.println(9 + 9);
	}

	// Function with parameter and without return type
	static void CalB(int x, int y) {
		System.out.println(x + y);
	}

	// Function with parameter and with return type
	static int Adda(int x, int y) {
		return (x + y);
	}

	static int Multi(int x, int y) {
		return x * y;
	}

	static int Divi(int x, int y) {
		return x / y;
	}

	static int subs(int x, int y) {
		return x - y;
	}

}
