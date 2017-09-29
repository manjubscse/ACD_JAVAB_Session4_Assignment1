
public class ClassOverriding extends ClassOverloading {
	
	//Declare class for multiplying same numbers 
	public void multiplyNumbers(int a,int b) {
		if ((a>0) && (b>0)) {
			System.out.println("Multiplication of two numbers is : " + (a * b ));
		}
		else 
		{
			System.out.println("Multiplication with 0 is always Zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initializing the ClassOverriding
		ClassOverriding clsOverriding =new ClassOverriding();
		ClassOverloading clsOverloading =new ClassOverloading();
		
		//calling the addNumbers method with 2 Parameters
		System.out.println("Calling the addNumbers method with two parameters");
		clsOverriding.addNumbers(2, 5);
		//calling the addNumbers method with 3 Parameters
		System.out.println("Calling the overloaded addNumbers method with three parameters");
		clsOverriding.addNumbers(2, 5,9);
		
		System.out.println();
		
		System.out.println("Calling the methods before overriding");
		// Before overriding the method
		clsOverloading.multiplyNumbers(2, 5);
		
		clsOverloading.multiplyNumbers(2, 0);
		System.out.println();
		System.out.println("Calling the methods after overriding");
		//After overriding method
		clsOverriding.multiplyNumbers(2, 5);
		
		clsOverriding.multiplyNumbers(2, 0);

	}

}
