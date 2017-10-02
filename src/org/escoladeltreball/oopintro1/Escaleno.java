package org.escoladeltreball.oopintro1;

public class Escaleno extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Escaleno(double base, double height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.FigureImpl#perimeter()
	 */	
	@Override
	public double perimeter() {
		return 3 * height + base;
	}
	
	
	

}
