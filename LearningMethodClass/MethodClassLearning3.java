package LearningMethodClass;

public class MethodClassLearning3 {

	public static void main(String[] args) {

		School Stud = new School();
		Stud.Education();
		Stud.Sports();

		Information Inf = new Information();
		Inf.info();
		Inf.info1();

		Library Lab = new Library();
		Lab.RuleL();
		Lab.FineL();

		Student stud = new Student();
		String name = stud.SName("Shravan Timalsina");
		System.out.println(name);
		stud.setSAge(20);
		int updatedage = stud.getSAge();
		System.out.println(updatedage);
		stud.setSID(28);
		int updatesid = stud.getSID();
		System.out.println(updatesid);

	}

}

class School {

	void Education() {
		System.out.println("Education is the key factor of the life");
	}

	void Sports() {
		System.out.println("Playing sports makes body and mind healthy");
	}
}

class Information {

	private String Fullname = "Sita Timalsina";
	private int Age = 40;

	void info() {
		System.out.println(this.Fullname);
	}

	void info1() {
		System.out.println(this.Age);
	}

}

class Library {

	private String Rule = "Students have to return books in two weeks";
	private String Fine = "After two weeks students have to pay fine";

	void RuleL() {
		System.out.println(this.Rule);
	}

	void FineL() {
		System.out.println(this.Fine);
	}

}

class Student {

	private String SName = "Shrasta Sharma";
	private int SAge = 21;
	private int SID = 21;

	public String SName(String SFN) {
		return this.SName = SFN;
	}

	public void setSAge(int age) {
		this.SAge = age;
	}

	public int getSAge() {
		return this.SAge;
	}

	public void setSID(int id) {
		this.SID = id;
	}

	public int getSID() {
		return this.SID;
	}

}
