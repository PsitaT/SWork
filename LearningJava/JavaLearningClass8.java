package LearningJava;

public class JavaLearningClass8 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("hellow");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 5; i <= 50; i = i + 5) {
			System.out.println(i);
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
			if (i == 2) {
				break;
			}
		}
		for (int i = 0; i <= 10; i++) {
			if (i == 2 || i == 5) {
				continue;
			}
			System.out.println(i);
		}

		int st = 1;
		while (st <= 5) {
			System.out.println(st);
			st++;
		}
		int st1 = 5;
		while (st1 >= 1) {
			System.out.println(st1);
			st1--;
		}
		int st2 = 2;
		while (st2 <= 20) {
			System.out.println(st2);
			st2 = st2 + 2;
		}
		int st3 = 50;
		while (st3 >= 5) {
			System.out.println(st3);
			st3 = st3 - 5;
		}
		int st4 = 10;
		while (st4 >= 1) {
			if (st4 == 5) {
				break;
			}
			System.out.println(st4);
			st4--;
		}
		int st5 = 15;
		while (st5 >= 5) {
			System.out.println(st5);
			if (st5 == 11) {
				break;
			}
			st5--;
		}
		int st6 = 5;
		while (st6 <= 10) {
			if (st6 == 9) {
				continue;
			}
			System.out.println(st6);
			st6++;
		}

	}

}
