package LearningArray;

public class ArrayLearningClass4 {

	public static void main(String[] args) {
		
		
		int Num[] = new int [5];
		    Num [0] = 15 ;
		    Num [1] = 25;
		    Num [2] = 35;
		    Num [3] = 45;
		    Num [4] = 55;
	 for (int i = 0 ;  i < Num.length ; i++) {
		 System.out.println(Num[i]);
	 }
	  for(int N :Num) {
		  System.out.println(N);
	  }
	  
	  
	  int [][] number =  new  int[3][4];
		number[0][0] = 11;
		number[0][1] = 22;
		number[0][2] = 33;
		number[0][3] = 44;
		
		number[1][0] = 55;
		number[1][1] = 66;
		number[1][2] = 77;
		number[1][3] = 88;
		
		number[2][0] = 99;
		number[2][1] = 100;
		number[2][2] = 110;
		number[2][3] = 120;
		
		for(int i = 0; i < number.length ; i++) {
			int numbe[] = number[i];
			for(int j = 0 ;j < numbe.length ;j++) {
				System.out.println(numbe[j]);
			}
 		}
		for(int[] numbe : number) {
			for(int numb :numbe) {
				System.out.println(numb);
			}
		}
		
		
		
		
		
	
	int Numb [][][] = new int [3][3][3];
	
            Numb[0][0][0] = 10;       
		    Numb[0][0][1] = 20;
	        Numb[0][0][2] = 30;
	       
	       Numb[0][1][0] =  40;	       
	       Numb[0][1][1] =  50;
	       Numb[0][1][2] =  60;
	       
	      Numb[0][2][0] =  70;	       
	      Numb[0][2][1] =  80;
	      Numb[0][2][2] =  90;
	      
	     
	     Numb[1][0][0] =  100;  	
	     Numb[1][0][1] =  110;          
	     Numb[1][0][2] =  120;         
           
         Numb[1][1][0] =  130;  	
	     Numb[1][1][1] =  140;          
	     Numb[1][1][2] =  150;       
	
	     Numb[1][2][0] =  160;  	
	     Numb[1][2][1] =  170;          
	     Numb[1][2][2] =  180;
	     
	     
	     Numb [2][0][0] = 190;  	
	     Numb[2][0][1] =  200;          
	     Numb[2][0][2] =  210;  
	     
	     Numb[2][1][0] =  220;  	
	     Numb[2][1][1] =  230;          
	     Numb[2][1][2] =  230;  
	     
	     Numb[2][2][0] =  240;  	
	     Numb[2][2][1] =  260;          
	     Numb[2][2][2] =  270; 
	     
	     for (int i = 0 ; i < Numb.length ; i++) {
	    	 int num [][] = (Numb[i]);
	    	 for(int j = 0 ; j < num.length ; j++) {
	    		 int nums[] = num[j];
	    		 for(int k = 0 ; k < nums.length; k++) {
	    			 System.out.println(nums[k]);
	    		 }
	    	 }
	    			
	     }
	     for(int [][]num : Numb) {
	    	 for(int nums[] : num) {
	    		 for(int numb:nums) {
	    			 System.out.println(numb);
	    		 }
	    	 }
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}

}
