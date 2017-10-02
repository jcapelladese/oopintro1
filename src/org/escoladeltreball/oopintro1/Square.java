/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw47941842
 *
 */
public class Square extends FigureImpl {
	
	private double side;
	
	/**
	 * @param side
	 */
	public Square(double side) {
		super();
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side * side;

	}
}
