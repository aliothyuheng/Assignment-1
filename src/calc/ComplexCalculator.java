//SI 543 Assignment 1
//Yuheng Chen(yuhengch)
//Date: 9/11/2014

package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtracts d from current number
	public void subtract(double d){
		currentNumber = currentNumber - d;
	}
	  
	// multiplies current number by d
	public void multiply(double d){
		currentNumber = currentNumber * d;
	}
	
	// divides current number by a given number
	public void divide(double d){
		currentNumber = currentNumber / d;
	}
	
	// sets current number to 0
	public void clear(){
		currentNumber = 0;
	}
	
	// raises current number to the power of a given number
	public void power(double d)
	{
	    double result = 1;
	    while (d != 0){
	    	result = result * currentNumber;
	    	d = d - 1;
	    }
	    currentNumber = result;
	}
		
	
	
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// returns true is current number is even, false otherwise
	public boolean isEven(){
		if (currentNumber % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	// returns true if current number is a prime number, false otherwise
	public boolean isPrime(){
		for(int i = 2; 2*i < currentNumber; i++) {
			if(currentNumber % i==0){
				return false;
			}
		}
		return true;
	}
	
	
	////////////////////////////////////////////////////
	
}
