package Learningstring;

public class StringLearningClass1 {

	public static void main(String[] args) {

		String Subject = "I am learning Java for QA.";
		String Subject1 = " Learning new thing is Hard.";
		String Subject2 = " Practise makes everthing easier.";
		System.out.println(Subject);
		System.out.println(Subject1);
		System.out.println(Subject2);

		System.out.println(Subject + Subject1 + Subject2);

		System.out.println("Sita" + " Timalsina");
		System.out.println(40 + "Sandhya");
		System.out.println("Shrasta" + 20);
		System.out.println(40 + 20);

		String Sen = "Kathmanu is the city where I was born.";
		String Sen1 = "Miss my hometown";
		int KT = Sen.length();
		System.out.println(Sen.length());
		System.out.println(KT);

		String Sen2 = Sen.concat(Sen1).concat(" Very Much");
		System.out.println(Sen2);

		String City = new String("Fortworth");
		System.out.println(City);
		String City1 = City.toUpperCase();
		System.out.println(City1);
		System.out.println(City1.length());

		String City2 = "Kathamanu";
		String City3 = "Boudha";
		String City4 = "Kathmandu";
		boolean Result = City2.equals(City3);
		System.out.println(Result);
		if (Result) {
			System.out.println("City2 and City3 are same");
		} else {
			System.out.println("City2 and City4 are same");
		}
		String Result1 = City1.equals(City4) ? "equal" : "not equal";
		System.out.println(Result1);

		String Example = "Quote I Like\"what doesn't kills you makes you stronger\"";
		System.out.println(Example);

		String city = "Shantinagar";
		boolean result = city.startsWith("Shan");
		System.out.println(result);
		boolean result1 = city.startsWith("sha");
		System.out.println(result1);
		boolean result2 = city.endsWith("gar");
		System.out.println(result2);
		boolean result3 = city.endsWith("Gar");
		System.out.println(result3);
		char k = city.charAt(5);
		System.out.println(k);
		System.out.println(city.length());
		for (int i = 0; i < city.length(); i++) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
		for (int i = city.length() - 1; i >= 0; i--) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
		String rev = "";
		for (int i = 0; i < city.length(); i++) {
			rev = city.charAt(i) + rev;
			System.out.println(rev);
		}
		String rev1 = "";
		for (int i = city.length() - 1; i >= 0; i--) {
			rev1 = rev1 + city.charAt(i);
			System.out.println(rev1);
		}

		String sen = "Heaven is myth Nepal is real";
		boolean resu = sen.contains("Nepal");
		System.out.println(resu);

		String sen1 = "DFW is  one of the city of Texas and DFW is devloping fast";
		String resu1 = sen1.replaceAll("DFW", "Fortworth");
		System.out.println(resu1);
		String resu2 = sen1.replace("D", "T");
		System.out.println(resu2);

		String fruits = "apple mango banana grapefruit orange grapes papaya";
		String userInput = "grapefruit";
		if (fruits.contains(userInput)) {
			System.out.println("Fruit is available");
		} else {
			System.out.println("Fruit not available");
		}

		String firstName = "majestious";
		int count = 0;

		for (int i = 0; i < firstName.length(); i++) {
			System.out.println(firstName.charAt(i));

			if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i'
					|| firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
				count = count + 1;
		}
	}
             System.out.println(count);

		String firstName1 = "majestious";
		int count1 = 0;

		for (int i = 0; i < firstName1.length(); i++) {

			if (firstName1.charAt(i) == 'a' || firstName1.charAt(i) == 'e' || firstName1.charAt(i) == 'i'
					|| firstName1.charAt(i) == 'o' || firstName1.charAt(i) == 'u') {
				count1 = count1 + 1;
				System.out.println(firstName.charAt(i));
			}
		}  
		  System.out.println(count);
	

	}

}
