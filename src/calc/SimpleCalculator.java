//SI 543 Assignment 1
//Yuheng Chen(yuhengch)
//Date: 9/11/2014

package calc;

public class SimpleCalculator {

	private double currentNumber;
	
	public SimpleCalculator(double d) {
		
		this.currentNumber = d;
		
	}
	
	public void add(double d) {
		
		currentNumber = currentNumber + d;
		
	}
	
	public double getCurrentNumber() {
		
		return currentNumber;
		
	}
	
}
