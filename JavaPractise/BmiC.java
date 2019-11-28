class BmiC
{
	public static void main(String [] args)
	{
	 int weight =90;
	 double height= 140;
 	 double bmi;

	bmi =weight/(height*height);
	if(bmi >=40)
	{
	 System.out.println("Not Valid");
	}
	
	else if(bmi >=30 && bmi <=39.9) 
	{
	 System.out.println("You are in obese range");
	}
	else if (bmi >=25)
	{
	System.out.println("You are in the overweigth range");
	}
	else if(bmi >=18.5)
	{
	 System.out.println("You are in healthy weight range");
	}
	else if(bmi <18.5)
	{
	 System.out.println("You are in underweight range");
	}
	
	}
}