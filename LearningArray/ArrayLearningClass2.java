
package LearningArray;

import java.util.Arrays;

public class ArrayLearningClass2 {

	public static void main(String[] args) {

		int aa[][] = { { 11, 22, 33, 44 }, { 10, 20, 30, 40 } };
		for (int ab[] : aa) {
			for (int cd : ab) {
				System.out.println(cd);
			}
		}

		String names[] = new String[5];
		names[0] = "Sharmila";
		names[1] = "Narayandevi";
		names[2] = "Usha";
		names[3] = "Gita";
		names[4] = "Sita";
		System.out.println(names[3]);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		String[][] Friends = { { "Sharmila", "NarayanDevi", "Usha", "Gita", "Sita" },
				{ "Ramesh", "Jimmy", "Mahendra", "Sanjeeev", "raju", "Ramkumar" } };
		for (String Sathi[] : Friends) {
			for (String Mates : Sathi) {
				System.out.println(Mates);
			}

			// for each loop
		}
		int[][] one = { { 12, 23, 34, 45, 56 }, { 78, 89, 96, 65, 54 } };
		System.out.println(one[0][4]);
		System.out.println(one[1][3]);
		for (int two[] : one) {
			for (int three : two) {
				System.out.println(three);
			}
		}
		int four[][] = { { 100, 200, 300, 400, 500 }, { 600, 700, 800, 900, 1000 } };
		for (int five[] : four) {
			for (int six : five) {
				System.out.println(six);
			}
		}
		String Name = "Kathmandu";
		char nm[] = Name.toCharArray();
		for (int i = 0; i < nm.length; i++) {
			System.out.println(nm[i]);
		}

		String Spl = "Learning Java looks easier but its hard";
		String spl[] = Spl.split(" ");
		System.out.println(Arrays.toString(spl));
		for (int i = 0; i < spl.length; i++) {
			System.out.println(spl[i]);
		}
		String spl1[] = Spl.split("a");
		System.out.println(Arrays.toString(spl1));
		for (int i = 0; i < spl1.length; i++) {
			System.out.println(spl1[i]);
		}

		char name[] = { 'S', 'a', 'n', 'd', 'h', 'y', 'a', };
		String rev = "";
		for (char Nm : name) {
			System.out.println(Nm);
			rev = Nm + rev;
		}
		System.out.println(rev);
		
		int number[] = {12,23,34,45,56,67,78,89};
		int sum = 0;
		float avg = 0;
		
		for (int numb :number) {
			sum = sum +numb;
		}
		System.out.println(sum);
		avg =sum/number.length;
		System.out.println(avg);
		
		

	}
}
