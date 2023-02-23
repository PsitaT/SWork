package Learningstring;

public class StringLearningClass2 {

	public static void main(String[] args) {
		
		String Str = " Learning Java is fun ";
		String St3 = Str.trim();
		System.out.println(St3.length());
		System.out.println(Str.length());
		String St = Str.substring(0 , 8);
		System.out.println(St);
		String St1 = Str.substring(13);
		System.out.println(St1);
		String St2 = Str.substring(1, 5);
		System.out.println(St2);
		
		String FN = "Laxman";
		String MN = "Prasad";
		String LN = "Timalsian";
		String FLN = String.join(" ", FN,MN,LN);
		System.out.println(FLN);
		
		String IN = "I Love My Kids ";
		String KN = " Shrasta ,Shravan Sharvin";
		String MKN = String.join("@^*^@", IN,KN);
		System.out.println(MKN);
		
		String City = "Kathmandu";
		int KA = City.indexOf('m');
		System.out.println(KA);
		int KA1  = City.indexOf('a', 4);
		System.out.println(KA1);
		for (int i = 1; i < City.length(); i++) {
			if (City.charAt(i)=='a') {
				System.out.println(i);
			}
		}
		
		String FirstN = "Sita Timalsina";
		String FName = "";
		boolean  fn = FirstN.isEmpty();
		System.out.println(fn);
		boolean nf = FName.isEmpty();
		System.out.println(nf);
		
		String Fruit = "Papaya";
		int Ft = Fruit.indexOf('a', 4);
		System.out.println(Ft);
		int count = 0;
		for(int i = 0; i < Fruit.length(); i++) {
			if (Fruit.charAt(i)== 'a') {
				System.out.println(i);
				count = count +1 ;
			}
		}
		
		
		
		

	}

}
