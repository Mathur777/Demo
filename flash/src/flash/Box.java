package flash;

class Sumit{
	int length, width,hieght;
	public void setdimension(int l,int w,int h) {
		
		length=l;
		width=w;
		hieght=h;
	}
	public void showdimension() {
		System.out.println("L "+length);
		System.out.println("w "+width);
		System.out.println("h "+hieght);
		
	}
	
}




public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sumit sc=new Sumit();
sc.setdimension(78, 77, 6);
sc.showdimension();
sc=new Sumit();
sc.showdimension();

	}

}
