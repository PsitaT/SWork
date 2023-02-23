package LearningArray;

public class ArrayLearningClass1 {

	public static void main(String[] args) {

		int nums[] = new int[5];
		nums[0] = 500;
		nums[1] = 100;
		nums[2] = 200;
		nums[3] = 300;
		nums[4] = 400;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		System.out.println(nums.length);

		int numbs[] = new int[5];
		numbs[0] = 110;
		numbs[1] = 120;
		numbs[2] = 130;
		numbs[3] = 140;
		numbs[4] = 150;
		for (int i = 0; i < numbs.length; i++) {
			System.out.println(numbs[i]);
		}
		int numbe[] = { 11, 22, 33, 44, 55, 66, 77 };
         for (int i = 0; i < numbe.length; i++) {
		      System.out.println(i);
			System.out.println(numbe[i]);
		}
         
         String  Cities [] = new String[4];
                Cities[0]  = "Fortworth";
                Cities[1] = "Benbrook";
                Cities[2] = "Burleson";
                Cities[3] = "Bryantirvin";
                for (int i = 0 ; i < Cities.length ;i++) {
                	System.out.println(Cities[i]);
                }
                char ABC[] = {'G','R','A','P','E','F','R','U','I','T'};
               for(int i = 0 ; i < ABC.length ; i++) {
            	   System.out.println(i);
            	   System.out.println(ABC[i]);
               }
               String Name = "Sita Timalsina";
               char ST[] = Name.toCharArray();
               for(int i = 0; i < ST.length; i++) {
            	   System.out.println(i);
            	   System.out.println(ST[i]);
               }
               
           	String st = "I am learning java";
    		String st1 [] = st.split(" ");
    		for(int i = 0 ; i < st1.length ; i++) {
    			System.out.println(i);
    			System.out.println(st1[i]);
    		}
    		
    		String st2[] = st.split("a");
            for(int i = 0 ; i < st2.length ; i++) {
  			System.out.println(i);
  			System.out.println(st2[i]);
  		}
    		   		
    		
    	
    		
    		
    	
    		
               
            		   
         

	}

}
