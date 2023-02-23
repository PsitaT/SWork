package LearningMethodClass;

public class MethodClassLearning7 {

	public static void main(String[] args) {

		ChildActor C = new ChildActor("Sharvina Sharma", "Kathmandu");
		System.out.println(C.Fullname);
		System.out.println(C.City);
		System.out.println(C.Age);
		C.Displayname();
		System.out.println("=========");
		
		ActorF   Fem = new ActorF("Sharvina Sharma", "Kathmandu",500000);
		      System.out.println(Fem.Age1);
		      System.out.println(Fem.City);
		      System.out.println(Fem.Fullname);
		      Fem.ShowEarning();
		      System.out.println("==========");
		      
		      Producer   Pro  = new Producer("Sharvina Sharma", "Kathmandu",500000,25000000);
		                 System.out.println(Pro.Fullname);
		                 System.out.println(Pro.age2);
		                 System.out.println(Pro.PEarning);
		                 Pro.DisplayProfit();
		                 
		      
	

}
}
class ChildActor {

	protected String Fullname;
	protected String City;
	protected int Age = 10;

	public ChildActor(String Fn, String CT) {
		this.Fullname = Fn;
		this.City = CT;
	}

	public void Displayname() {
		System.out.println(this.Fullname);
	}
}

class ActorF extends ChildActor {
	int Age1 = 25;
	int Earning;

	public ActorF(String Fn, String CT, int Earn) {
		super(Fn, CT);
		this.Earning = Earn;
	}

	public void ShowEarning() {
		System.out.println(this.Earning);
	}

}
   class Producer extends ActorF {
	int age2 = 45;
	int PEarning;

	public Producer(String Fn, String CT,int Earn,  int PEarn) {
		super(Fn, CT,PEarn);
		this.PEarning = PEarn;
	}

	public void DisplayProfit() {
	     this.Displayname();
		System.out.println(50000);
	}
  }
