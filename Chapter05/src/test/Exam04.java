package test;

import java.util.Arrays;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int i = 0; i < array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
		}
		   
		  
	}
		Arrays.sort(array);	
		max = array[array.length-1];
		System.out.println(max);
		
	}
	
	

}
