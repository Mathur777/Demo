//Constructor program  

package flash;
class cube{
	 int hieght;
	 int bredth;
	 int lenghth;
	public  int getvalue() {
	
		return (hieght*bredth*lenghth);
		
	}
	cube(){    // default constructor...
		hieght=23;
		bredth=56;
		lenghth=34;
		
	}
	cube(int h, int b, int l){ //argument constructor..
		
		hieght=h;
		bredth=b;
		lenghth=l;
	}
}






public class MyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cube sc=new cube();   
System.out.println( "I m default "+sc.getvalue());
 cube sc2=new cube(9,7 ,7);
 System.out.println( " i m arument "+sc2.getvalue());
}
}