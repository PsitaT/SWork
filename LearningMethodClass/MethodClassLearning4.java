package LearningMethodClass;

public class MethodClassLearning4 {

	public static void main(String[] args) {
		
            GbabaH  BishnuGopal = new GbabaH();
            BishnuGopal.FullName();
            
            BabaH BadriPrasad = new BabaH();
            System.out.println(BadriPrasad.FName);
            System.out.println(BadriPrasad.BabaName);
            System.out.println(BadriPrasad.LName);
            
            BadriPrasad.FullName();
            BadriPrasad.FName();
            
            
            DadaH  ThakurPrasad = new DadaH();
            System.out.println(ThakurPrasad.FName);
            System.out.println(ThakurPrasad.BabaName);
            System.out.println(ThakurPrasad.DName);
            System.out.println(ThakurPrasad.LName);
            
            ThakurPrasad.FullName();
            ThakurPrasad.FName();
            ThakurPrasad.NameF();
            
            
            
	}

}











class GbabaH{
	
	String FName = "BishnuGopal";
	String LName  = "Pudasaini";
	
	public void FullName () {
		System.out.println(this.FName + this.LName);
	}
}
class BabaH extends GbabaH{
	String BabaName = "BadriPrasad";
	
	public void FName() {
		System.out.println(this.BabaName + this.LName);
	}
}
class DadaH extends BabaH{
	String DName = "ThakurPrasad";
	
	public void NameF() {
		System.out.println(this.DName + this.LName);
	}

}
