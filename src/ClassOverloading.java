// Class to demonstrate the Overloading : Overloading occurs in same class and with different number of parameters name.
public class ClassOverloading {

	// Declare method for adding two numbers 
	public void addNumbers(int a, int b) {
		System.out.println("Sum of two numbers is :" + (a + b));
	}
	
	// Overloading the same method to add 3 numbers 
	public void addNumbers(int a, int b,int c) {
		System.out.println("Sum of two numbers is :" + (a + b + c));
	}
	
	//Declare class for multiplying same numbers 
	public void multiplyNumbers(int a,int b) {
		System.out.println("Multiplication of two numbers is : " + (a * b ));
	}
	
}
