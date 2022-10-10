package com.soprasteria.javainterfacepolygon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrato p1 = new Quadrato(10);
		Pentagono p2 = new Pentagono(20);
		
		System.out.println("quadrato con lato " + p1.getLato() + ", area "
				+ p1.calcolaArea() + " e perimetro " + p1.calcolaPerimetro());
		System.out.println("pentagono con lato " + p2.getLato() + ", area "
				+ p2.calcolaArea() + " e perimetro " + p2.calcolaPerimetro());
	}

}
