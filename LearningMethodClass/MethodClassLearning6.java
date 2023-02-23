package LearningMethodClass;

public class MethodClassLearning6 {

	public static void main(String[] args) {

		Actor Name = new Actor("Najir", "Kathmandu", 35);
		System.out.println(Name.Age);
		System.out.println(Name.City);
		Name.DisplayName();
		System.out.println("=====");

		Director name = new Director("Najir", "Kathmandu", 35, 10000);
		System.out.println(name.Age);
		System.out.println(name.City);
		System.out.println(name.Earning);
		name.DisplayName();
		name.Comission();
	}

}

class Actor {
	String Fullname;
	String City;
	int Age;

	public Actor(String Fn, String Ct, int age) {
		this.Fullname = Fn;
		this.City = Ct;
		this.Age = age;
	}

	public void DisplayName() {
		System.out.println(this.Fullname);
	}
}

class Director extends Actor {
	int Earning;

	public Director(String Fn, String Ct, int age, int earn) {
		super(Fn, Ct, age);
		this.Earning = earn;
	}

	public void Comission() {
		this.DisplayName();
		;
		System.out.println(50000);
	}

}
