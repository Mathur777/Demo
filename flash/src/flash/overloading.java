//method overloading......
package flash;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Add(12,45));
System.out.println(Add (23.4 ,78.0));
System.out.println(Add("Sumit ","Mathur"));
	}

	
	public static  int Add(int a, int b) {
		return(a+b);
		
	}
	public static double Add(double a, double b) {
		return(a+b);
		
		
	}
	public static String Add(String a , String b) {
		
		return(a+b);
	}
	
}
