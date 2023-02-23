package LearningJava;

public class JavaLearningClass3 {

	public static void main(String[] args) {

		System.out.println("hellow");

		Addition();

		Sub(100, 50);
		Sub(900, 450);

		int q1 = Multi(12, 12);
		System.out.println(q1);
		System.out.println(q1 * 0.10);
		System.out.println(q1 + 10);

	}

	static void Addition() {
		System.out.println(9 + 9);
	}

	static void Sub(int x, int y) {
		System.out.println(x - y);
	}

	static int Multi(int x, int y) {
		System.out.println(x * y);
		return x * y;
	}

	static void Multi2(int x, int y) {
		System.out.println(x * y);
	}

}
