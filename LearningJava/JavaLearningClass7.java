package LearningJava;

public class JavaLearningClass7 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			// System.out.println("Hello");
		}
		for (int x = 0; x <= 3; x++) {
			System.out.println(x);
			System.out.println("Hellow");
		}
		for (int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}
		for (int i = 3; i <= 30; i = i + 3) {
			System.out.println(i);
		}
		for (int i = 5; i >= 2; i--) {
			System.out.println(i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}
		}
		for (int i = 5; i <= 2; i--) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 5; i <= 2; i--) {
			System.out.println(i);
			if (i == 3) {
				break;
			}

		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				continue;
			}
		}
		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
