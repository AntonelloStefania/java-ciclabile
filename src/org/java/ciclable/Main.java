package org.java.ciclable;
import org.java.ciclable.pojo.Ciclable;

public class Main {
	public static void main(String[] args) {
		 int[] example = {7,8,5,2,1};
		 Ciclable ciclables = new Ciclable(example);
		 
		 ciclables.addElemento(6);
		 ciclables.addElemento(7);
		 ciclables.addElemento(4);
		 
		 
		while(ciclables.hasAncoraElementi()) {
		
		
			System.out.print(ciclables.getElementoSuccessivo()+" - ");
		}
		 System.out.println("\nsono finiti gli elementi");
	 
		 
	}
	
	
}
