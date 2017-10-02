/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw47941842
 *
 */
public abstract class Triangle extends FigureImpl {
	
	protected double base;
	protected double height;
	
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
//	@Override
//	public double perimeter() {
//		// TODO Auto-generated method stub
//		return 3 * base;
//	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * height / 2;
	}
	
	

}
