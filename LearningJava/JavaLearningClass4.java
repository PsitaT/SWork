package LearningJava;

public class JavaLearningClass4 {

	public static void main(String[] args) {

		if (2 == 3) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}
		int numT = 50;

		if (numT > 0 && numT <= 50) {
			System.out.println("10% discount");
		}
		if (numT > 40 && numT <= 50) {
			System.out.println("20% discount");
		}
		if (numT > 100) {
			System.out.println("10% discount");
		}
		if (numT > 0 && numT <= 50) {
			System.out.println("10% discount");
		} else if (numT > 40 && numT <= 50) {
			System.out.println("20% discount");
		} else if (numT > 100) {
			System.out.println("10% discount");
		}

		int marks = 92;

		if (marks > 90) {
			System.out.println("Grade A");
		}
		if (marks > 80) {
			System.out.println("Grade B");
		}
		if (marks > 60) {
			System.out.println("Grade C");
		}

		int x1 = 100;
		int x2 = 15;
		if (x1 > x2) {
			System.out.println("x1 is greater");
		} else {
			System.out.println("x2 is greater");
		}

		int a = 900;

		System.out.println(a > 500);
		System.out.println(44 == 44);
		System.out.println(7 >= 7);
		System.out.println(7 <= 7);
		System.out.println(8 >= 7);
		System.out.println(7 <= 6);
		System.out.println(7 != 6);
		System.out.println(7 < 6);

		System.out.println(2 == 2 && 4 != 3);
		System.out.println(2 != 5 && 4 == 3);
		System.out.println(2 == 2 && 4 != 4);
		System.out.println(2 > 2 && 4 != 3);
		System.out.println(2 > 2 && 4 == 3);

		System.out.println(2 == 2 || 4 != 3);
		System.out.println(2 != 5 || 4 == 3);
		System.out.println(2 == 2 || 4 != 4);
		System.out.println(2 > 2 || 4 != 3);
		System.out.println(2 > 2 || 4 == 3);

		System.out.println(!(2 == 2));
		System.out.println(!(2 != 2));

	}

}
