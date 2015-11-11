package pilas;

import pilas.StackStatic;

public class Main {
	public static void main(String[] args){
		StackStatic<Integer> s= new StackStatic (10);
		StackStatic q= new StackStatic (5);
		
		int n=5;
		for (int i=1; i< n; i++){
			s.push(i);
		}
		 
		
		
		
	}
	
	

}
