package LearningMethodClass;

public class MethodClassLearning1 {

	public static void main(String[] args) {

		Bank Texas = new Bank("Sandhya", "Saving", 123456789, 15000);
		System.out.println(Texas.AccBal);
		int updateamt = Texas.Deposit(5000);
		System.out.println(updateamt);

		Texas.AType("Saving");
		Texas.withDraw(100);
		Texas.withDraw(200);
		Texas.withDraw(150);

		int updatebal = Texas.withDraw(500);
		System.out.println(updatebal);
		System.out.println("======");
		for (int i : Texas.Transaction) {
			System.out.println(i);
		}

		Bank BOA = new Bank("sandhya", "Checking", 987654321, 5000);
		System.out.println(BOA.AccName);

		Bank[] Banks = { 
				          new Bank("Laxman", "Saving", 123456789, 15000), 
				          new Bank("Sandy", "Saving", 123456987, 20000),
				          new Bank("Shrasta", "Checking", 321456789, 5000),
                          new Bank("Sandhya", "Checking", 123476589, 7000), 
                          };
		
		for (Bank Ab : Banks) {
			System.out.println(Ab.AccName);
			System.out.println(Ab.AcType);
			System.out.println(Ab.AccNo);
			System.out.println(Ab.AccBal);
			System.out.println(Ab.Country);
		}

	}
}

class Bank {

	String AccName;
	String AcType;
	String Country;
	int AccNo;
	int AccBal;

	int Transaction[];
	int notransac = 0;

	public Bank(String Accname, String AcType, int AccNo, int AccBal) {
		this.AccName = Accname;
		this.AcType = AcType;
		this.Country = "USA";
		this.AccNo = AccNo;
		this.AccBal = AccBal;
		this.Transaction = new int[5];
	}

	public int Deposit(int Damount) {
		if (this.AccBal != 0) {
			this.Transaction[notransac] = Damount;
			notransac++;
			AccBal = this.AccBal + Damount;

			System.out.println();

		}
		return this.AccBal;
	}

	public int withDraw(int Wamount) {
		if (this.AccBal != 0) {
			this.Transaction[notransac] = Wamount;
			notransac++;
			this.AccBal = this.AccBal - Wamount;

			return this.AccBal;
		} else {
			System.out.println("Declined");
			return this.AccBal;
		}
	}

	public void AType(String Type) {
		this.AcType = Type;
		if (AcType == "Saving") {
			System.out.println("Get  5 percent interest");
		} else if (AcType == "Checking") {
			System.out.println("Get 10 percent interest");
		} else {
			System.out.println("Thank you for banking with us");
		}
	}

}