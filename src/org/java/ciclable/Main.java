package org.java.ciclable;



import org.java.ciclable.pojo.Ciclable;

public class Main {
	public static void main(String[] args) {
		 int[] example = {7,8,5,2,1,6,7,5};
		 Ciclable ciclables = new Ciclable(example);
		 
		while(ciclables.hasAncoraElementi()) {
		
		
			System.out.print(ciclables.getElementoSuccessivo()+" - ");
		}
		 System.out.println("\nsono finiti gli elementi");
	}
}
