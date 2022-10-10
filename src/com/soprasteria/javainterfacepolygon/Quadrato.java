package com.soprasteria.javainterfacepolygon;

public class Quadrato implements Poligono {
	
	private double lato;

	public Quadrato(double lato) {
		super();
		this.lato = lato;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return this.lato * 4;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return this.lato * this.lato;
	}
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}
	
	@Override
	public String toString() {
		return String.format("quadrato perimetro: %.2f, area: %.2f, lato: %.2f",
				this.calcolaPerimetro(), this.calcolaArea(), this.getLato());
	}

}
