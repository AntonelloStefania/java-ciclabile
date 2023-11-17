package org.java.ciclable.pojo;

public class Ciclable {
	private int[] elencoInt;
	private int indiceInt;
	
	public Ciclable(int[] elencoInt) {
		setElencoInt(elencoInt);
		setIndiceInt(indiceInt);
	}
	
	public Ciclable() {
		setElencoInt(elencoInt);
		setIndiceInt(indiceInt);
	};
	
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
	
	
	public int[] addElemento(int elem) {
		int[] nuovoElenco =new int[getElencoInt().length +1];
		System.arraycopy(getElencoInt(), 0, nuovoElenco, 0, getElencoInt().length);
		nuovoElenco[getElencoInt().length] = elem;
		return elencoInt = nuovoElenco;
	}
	
	
}
