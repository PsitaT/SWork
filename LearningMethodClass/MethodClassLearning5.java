package LearningMethodClass;

public class MethodClassLearning5 {

	public static void main(String[] args) {
		
		            Hbaba Gbaba= new Hbaba("BishnuGopal","Pudasaini");
		            System.out.println(Gbaba.FName);
		            System.out.println(Gbaba.LName);
		            Gbaba.FullName();
		            
		            Baba BA = new Baba("BishnuGopal","Pudasaini","BadriPrasad");
		            System.out.println(BA.FName);
		            System.out.println(BA.FaName);
		            System.out.println(BA.LName);
		            BA.FullName();
		            BA.FName();
		            
		           Dada DA = new Dada ("BishnuGopal","Pudasaini","BadriPrasad","ThakurPrasad");
		            System.out.println(DA.FName);
		            System.out.println(DA.FaName);
		            System.out.println(DA.DName);
		            System.out.println(DA.LName);
		            DA.FullName();
		            DA.FName();
		            DA.DaName();
		            
		            	           		           
	}

}


class Hbaba {
	
	String FName ;
	String LName  ;
	
    public Hbaba (String FN,String LN) {
		this.FName = FN;
		this.LName =LN ;
	}
	
	public void FullName () {
		System.out.println(this.FName + this.LName);
	}
}
class Baba extends Hbaba {
	
	String FaName ;
	
    public Baba (String FN,String LN,String FAN) {
    	super(FN,LN);
		this.FaName = FAN;
    }	
	
	public void FName () {
		System.out.println(this.FaName + this.LName);
	}
}
class Dada extends Baba {
	
	String DName ;
	
    public Dada (String FN,String LN,String FAN,String DN) {
    	super(FN,LN,FAN);
		this.DName = DN;
    }		
	
	public void DaName () {
		System.out.println(this.DName + this.LName);
	}
}