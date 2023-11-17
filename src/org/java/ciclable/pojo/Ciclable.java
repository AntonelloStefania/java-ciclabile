package org.java.ciclable.pojo;

public class Ciclable {
	private int[] elencoInt;
	private int indiceInt;
	
	public Ciclable(int[] elencoInt) {
		setElencoInt(elencoInt);
		setIndiceInt(indiceInt);
	}
	
	public Ciclable() {};
	
	public int[] getElencoInt() {
		return elencoInt;
	}
	
	public void setElencoInt(int[] elencoInt) {
		this.elencoInt = elencoInt;
	}
	
	public int getIndiceInt() {
		return indiceInt;
	}
	
	public void setIndiceInt(int indiceInt) {
		this.indiceInt = indiceInt;
	}
 
	public int getElementoSuccessivo() {
		int[] elements = getElencoInt();
		setIndiceInt(indiceInt +1);
		return elements[getIndiceInt()-1] ;
	}
	
	public boolean hasAncoraElementi() {
		return getIndiceInt()< getElencoInt().length;
	}
	
	
}
