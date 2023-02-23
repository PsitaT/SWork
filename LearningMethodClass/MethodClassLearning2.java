package LearningMethodClass;

public class MethodClassLearning2 {

	public static void main(String[] args) {
		
		Learning Learn = new Learning();
		Learn.information();
		
		LearningA  LearnA = new LearningA();
		LearnA.displayFullname();
		
		Learn Sen = new Learn();
		Sen.SentenceA();
		
		Changecity Place = new Changecity();
		Place.city = "Kumarigal";
		System.out.println(Place.city);
		
		Citychange  Town = new Citychange();
	       Town.setCityName("Kathmandu");
	       String updatedcity = Town.getCityName();
	       System.out.println(updatedcity);
	       
	       newcity Hall = new newcity("Tusal");
	       System.out.println(Hall.getcity());
	       
	       Hall.setcity("Boudha");
	       System.out.println(Hall.getcity());
	       
	    		   
	}

}

class Learning {
	 
	void information() {
		System.out.println("I am learning new thing");
	}
}

 class LearningA {
	
	private String Fullname = "Sita Timalsina";
	
	void displayFullname() {
		System.out.println(this.Fullname);
	}
	
}
 class Learn {
	 
	 private  String Line = "I am learnig how to code";
	 
	 private void Sentence() {
		 System.out.println(this.Line);
	 }
	 void SentenceA() {
		 this.Sentence();
	 }
	 
 }
 
 
 class Changecity{
	 
	 String city = "Boudha";
 }
 
 
 class Citychange{
	 
	 private String City = "Kathmandu";
	 
	 public void setCityName(String city) {
		 this.City = city;
	 }
	 public String getCityName() {
		 return this.City;
	 }
 }
 class newcity{
	 
	 private String city1;
	 
	 public newcity(String CT) {
		 this.city1 = CT;
	 }
	 void setcity(String CTY) {
		 this.city1 = CTY;
	 }
	 String getcity() {
		 return this.city1;
	 }
	 
 }