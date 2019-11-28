
public class Recursion {
	
	public static void main(String[] args) {
		int factorial = fact(5);
		System.out.println("Factorial of number is " + factorial);
		
	}

	static int fact = 1;
	 static int fact(int n)
	{
		if(n>0)
		{
			fact = fact *n;
			fact(n-1);
		}
		return fact;
	}
}
