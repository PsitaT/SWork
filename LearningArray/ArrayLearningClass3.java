package LearningArray;

public class ArrayLearningClass3 {

	public static void main(String[] args) {
		
		int num [][] ={
	                   {10,20,30,40,50},
		              {9,19,29,39,49},
		              {8,18,28,38,48},
	     };
	      System.out.println(num[0][2]);
	      System.out.println(num[0][4]);
	      System.out.println(num[1][0]);
	      System.out.println(num[1][3]);
	      System.out.println(num[2][1]);
	      System.out.println(num[2][3]);
	      
	      
	    System.out.println("Using for loop");  
	      for ( int i = 0; i < num.length; i++) {
	    	  int numb[]  = num[i];
	    	  for(int j = 0; j < numb.length;j ++) {
	    		  System.out.println(numb[j]);
	    	  }
	      }
	      
	      System.out.println("Using for each loop");
	      
	    	  int nums [][] ={
	                   {10,20,30,40,50},
		              {9,19,29,39,49},
		              {8,18,28,38,48},
	    	  };
	    	  
	    	  for(int i = 0; i < nums.length;i++) {
	    		  int row [] = nums[i];
	    		  for(int j = 0 ; j < row.length;j++) {
	    			  System.out.println(row[j]);
	    		  }
	    	  }
	    	  for (int Num [] :nums) {
	    		for(int Numa : Num) {
	    			System.out.println(Numa);
	    		}
	    	  }
	    	  
	    	  
	    	  int Nums [] = {11,22,33,44};
	    	  for (int i = 0 ; i < Nums.length; i++) {
	    		  System.out.println(Nums[i]);
	    	  }
	    	  
	    	  
	             for (int numa2: Nums) {
	            	  System.out.println(numa2);
		    	  }
			              
	             
	             
	       int [][][]block = {
	    		             {
           		 
	    		            	 {11,22,33,44,55},
	    		            	 {111,222,333,444,555}
	    		             },
	    		             {
	    		            	 {10,20,30,40,50},
	    		            	 {100,200,300,400,500},
	    		             }
	    	
	       };
	       
	      for (int i = 0 ; i < block.length; i++) {
	    	  int row[][] = block[i];
	    	  for(int j = 0 ; j < row.length;j++ ) {
	    		  int col [] = row[j];
	    		  for(int k = 0; k < col.length; k++) {
	    			  System.out.println(col[i]);
	    		  }
	    	  }
	      }
	       
	       System.out.println(block[0][0][4]);
	       System.out.println(block[1][0][2]);
	       System.out.println(block[0][1][3]);
	       System.out.println(block[1][1][2]); 
	       System.out.println(block[0][1][1]);
	       System.out.println(block[1][0][3]);
	       
	       for(int [][]row: block) {
	    	 for  (int[] col:row){
	    		 for(int Tot : col) {
	    		 System.out.println(Tot);
	    	   }
	       }
	       } 
	       
	       
	       
	       
	       
	       
	    
	       int [][][]block1 = {
		             {
 		 
		            	 {11,22,33,44,55},
		            	 {111,222,333,444,555},
		            	 {45,55,65,25,35},
		            	 
		             },
		             {
		            	 {10,20,30,40,50},
		            	 {100,200,300,400,500},
		            	 {23,43,48,47,52},
		             },
		             {
		            	 {10,15,20,25,30},
		            	 { 35,40,45,50,55},
		            	 {60,65,70,75,80},
		             }
	
 };
	       for(int i = 0 ; i < block1.length; i++) {
	    	   int row[][] = block1[i];
	    	   for (int j = 0 ; j < row.length ; j++) {
	    		   int col[] = row[j];
	    		   for (int k = 0 ; k < col.length ;k++) {
	    			   System.out.println(col[k]);
	    		   }
	    	   }
	    			
	       }
	       
	       
	       
	     for (int [][] row : block1) {
	   	   for(int [] col :row) {
	  		   for(int row1:col) {
	 			    System.out.println(row1);
	  			   }
	   		   }
	    	   }
	    
	    
	    		 
	    	  
	     
		       
		
		     
	
		
		
		

	}

}
