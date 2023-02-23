package LearningMethodClass;

public class MothodClassLearning8 {

	public static void main(String[] args) {
		
		
		      MotherS Maa = new MotherS("Sita","Timalsina");
		      System.out.println(Maa.Firstname);
		      System.out.println(Maa.Lastname);
		      System.out.println(Maa.age);
		      Maa.Fullname();
		      System.out.println("=========");
		      
		      Daughter child1 = new Daughter("Sandhya","Timalsina","Shrasta");
		        System.out.println(child1.firstname);
		        System.out.println(child1.Lastname);
		        System.out.println(child1.Age);
		         child1.DFullname();
		         child1.Fullname();
		         System.out.println("=======");
		
		         Son Child2 = new Son("Sandhya","Timalsina","Shravan");
		      System.out.println(Child2.firstname);
		      System.out.println(Child2.Lastname);
		      System.out.println(Child2.Age1);
		      Child2.SFullname();
		      Child2.Fullname();
		
 	}

}


class MotherS{
	
	String Firstname ;
	String Lastname;
	int age = 40;
	
	public MotherS(String fn,String ln) {
		this.Firstname =  fn;
		this.Lastname  = ln;
	}
	public  void Fullname() {
		System.out.println(this.Firstname + this.Lastname);
	}
	
}
class Daughter extends MotherS{
	int Age = 20;
	String firstname;
	
     
	public Daughter(String fn,String ln, String Fn) {
		super(fn,ln);
		this.firstname = Fn;
		
	}
    public void DFullname() {
    	System.out.println(this.firstname +this.Lastname);
      }
	}
class Son extends MotherS{
	
	int Age1 = 15;
	String firstname;
	
	
	public Son(String fn, String ln,   String Fn ) {
		super(fn, ln);
		this.firstname = Fn;
		
	}	
     public void SFullname() {
    	 System.out.println(this.firstname +this.Lastname);
     }
	
}
