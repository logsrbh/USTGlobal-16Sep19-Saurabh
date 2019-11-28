class TestJ
{
public static void main(String [] args)
{
  int a = 12;
  int b = 15;
  int c =18;

	//	int d = a>b ?(a>c ? a:c):(b>c ? b:c); 
 	int d = (a>b && a>c ) ? a:(b>c)?b:c;
	System.out.println("value of d= "+d); 
}
}