package test;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 10; i++){
		   System.out.print(i);
	       sum+=i;
	       if(i < 10){		
		     System.out.print("+");	
		   }
		  if(i == 10) {
			  System.out.print("=");
		  }		  
	   }
		System.out.println(sum);
		
		for(int i =1; i <= 5; i++){
            for(int j =0; j < i; j++){
              System.out.print("*");	      
              }
              System.out.println();		
	   }
		
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for(int i = 0; i <array.length; i++){
           if(max < array[i]) {
			  max= array[i];
		     }	
		}
		System.out.println(max);
		
   }
}
