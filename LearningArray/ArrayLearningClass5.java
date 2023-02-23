
package LearningArray;

public class ArrayLearningClass5 {

	public static void main(String[] args) {

		student Shrasta = new student("Shrasta", "Timalsina", 20, 1001);
		System.out.println(Shrasta.age);
		student Kristy = new student("kristry", "Thai", 21, 1002);
		System.out.println(Kristy.ID);
		student Hia = new student("Hia", "Shamidin", 20, 1002);
		System.out.println(Hia.Lastname);
		student Brandy = new student("Brandy", "Sanches", 21, 1003);
		System.out.println(Brandy.ID);

		student[] girls = { new student("Shrasta", "Timalsina", 20, 1001), 
				new student("kristry", "Thai", 21, 1002),
				new student("Hia", "Shamidin", 20, 1002),
				new student("Brandy", "Sanches", 21, 1003),
				};
		
		for (int i = 0; i < girls.length; i++) {
			System.out.println(girls[i].Firstname);
			System.out.println(girls[i].Lastname);
			System.out.println(girls[i].age);
			System.out.println(girls[i].ID);
		}

		for (student girl : girls) {
			System.out.println(girl.Firstname);
			System.out.println(girl.Lastname);
			System.out.println(girl.age);
			System.out.println(girl.ID);
		}

		for (student girl : girls) {
			girl.drama();
			girl.sport();

		}
		
		vechile car = new vechile ("Red","Truck",2018);
		   System.out.println(car.color);
		  vechile truck = new vechile("Silver","Suv",2019);
		System.out.println(truck.type);
		vechile car2 = new vechile("White","Minisuv",2021);
		System.out.println(car2.year);
		
		vechile[]  Cars = {
				new vechile ("Red","Truck",2018),
				new vechile("Silver","Suv",2019),
				new vechile("White","Minisuv",2021),
		};
		     for (int i = 0 ; i < Cars.length ; i++) {
		    	 System.out.println(Cars[i].color);
		    	 System.out.println(Cars[i].type);
		    	 System.out.println(Cars[i].year);
		     }
		     
		     for (vechile Car : Cars) {
		    	 System.out.println(Car.color);
		    	 System.out.println(Car.type);
		    	 System.out.println(Car.year);
		     }
		     
		     for (vechile Car :Cars) {
		    	 Car.model();
		    	 Car.seat();
		     }
				
	}

}

class student {

	String Firstname;
	String Lastname;
	int age;
	int ID;

	public student(String FN, String LN, int age, int ID) {
		this.Firstname = FN;
		this.Lastname = LN;
		this.age = age;
		this.ID = ID;
	}

	public void sport() {
		System.out.println("Student can choose 2 sports");
	}

	public void drama() {
		System.out.println("Student can choose drama if not sport");
	}

}

class vechile {
	String color;
	String type;
	int year;

	public vechile(String color, String type, int year) {
		this.color = color;
		this.type = type;
		this.year = year;
	}

	public void model() {
		System.out.println("I like this model");
	}

	public void seat() {
		System.out.println("This is eight seater ");
	}
}