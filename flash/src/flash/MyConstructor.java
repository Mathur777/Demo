//Constructor program  

package flash;
class cube{
	 int hieght;
	 int bredth;
	 int lenghth;
	public  int getvalue() {
	
		return (hieght*bredth*lenghth);
		
	}
	cube(){    //constructor...
		hieght=23;
		bredth=56;
		lenghth=34;
		
	}
}






public class MyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cube sc=new cube();  
System.out.println(sc.getvalue());

}
}