package LearningJava;

public class JavaLearningClass5 {

	public static void main(String[] args) {

		int numT = 15;

		if (numT > 0 && numT <= 5) {
			System.out.println("10 percent discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("20 percent discount");
		}
		if (numT > 10) {
			System.out.println("30 percent discount");
		}

		int numS = 7;
		if (numS > 0 && numS <= 7) {
			System.out.println("10 percent discount");
		} else if (numS > 7 && numS <= 14) {
			System.out.println("20 percent discount");
		} else if (numS > 27) {
			System.out.println("30 percent ");
		}

		int marks = 55;

		if (marks > 95) {
			System.out.println("Grade A");
		}
		if (marks > 80) {
			System.out.println("Grade B");
		}
		if (marks > 70) {
			System.out.println("Grade C");
		}

		int marksE = 75;

		if (marksE > 95) {
			System.out.println("Grade A");
		} else if (marksE > 80) {
			System.out.println("Grade B");
		} else if (marksE > 70) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}

		int x = 1500;
		int y = 1000;
		int z = 500;
		// largest of three
		if (x > y && x > z) {
			System.out.println("x is greater");
		}
		if (y > x && y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");

		}
	}
}
