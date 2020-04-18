package flash;


/**
 * @author sumit
 * using private modifier ....
 *			 class	 package  subclass 
 * public	 y		  y			y
 * private	 y		  N			N
 * no modifier Y		Y		N
 * protected	Y		Y		Y
 */
class Rock{
	
	 private String name; //declaring member of variable private
	 private int  age;
	public String getName() {
		return name;
	}
	public void setName(String name) { //setting getter and setter....
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	 
	 
	 
}






public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rock su=new Rock();
		su.setName("Rahul");
		System.out.println(su.getName());
		su.setAge(34);
		System.out.println(su.getAge());
		
	}

}
