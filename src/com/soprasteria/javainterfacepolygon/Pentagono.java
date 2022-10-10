package com.soprasteria.javainterfacepolygon;

public class Pentagono implements Poligono {
	
	private double lato;

	public Pentagono(double lato) {
		super();
		this.lato = lato;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return this.lato * 5;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		double apotema = 5 * 0.688;
		return (this.calcolaPerimetro() * apotema)/2;
	}

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	@Override
	public String toString() {
		return String.format("pentagono perimetro: %.2f, area: %.2f, lato: %.2f",
				this.calcolaPerimetro(), this.calcolaArea(), this.getLato());
	}
	
	

}
