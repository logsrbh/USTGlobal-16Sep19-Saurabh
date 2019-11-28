class TestL
{
 static int fact=1;
public static void main(String [] args)
{
 int fact=1;
		double pie =3.14;
		int rad = 10;
 	  double resArea= areaOfCircle(pie, rad);
          double resCircum =circum(pie ,rad);
	System.out.println("Area of circle is = "+resArea);
	System.out.println("Circum of circle is = "+resCircum); 
         System.out.println(oddEven(50));
	factOfNum(3);
        
	greet("Hello Everyone");

}
 static double areaOfCircle(double x, int y)
 {
     return  (x*(y*y));
	
	
 }
 static double circum(double pie, int c)
{
    return (2*pie*c);
}

static boolean oddEven(int num)
{
	if(num%2 ==0)
	{
	 	return true;
	}else {
		return false;
	}
}
static void factOfNum(int num1)
{
 for (int i=1 ; i<=num1 ;i++)
{
    fact = fact *i;
}
 System.out.println("Factorial of "+num1+ " is "+fact);
}
static void greet(String msg)
{
System.out.println(msg);
}

}
