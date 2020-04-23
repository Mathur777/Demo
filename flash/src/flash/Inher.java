/*Java supports 3 Inheritance:
 * 1- Single Inheritance
 * 2- Multilevel Inheritance
 * 3- Hierarchical Inheritance 
 * 
 */


package flash;

class Person{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
class Student extends Person{ //Single Inheritance
	
	private int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
class School extends Student{ //Multilevel Inheritance
	private String sch_name;

	public String getSch_name() {
		return sch_name;
	}

	public void setSch_name(String sch_name) {
		this.sch_name = sch_name;
	}
	
}





public class Inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School sc=new School();
		sc.setAge(41);
		sc.setName("Sumit");
		sc.setRollno(23);
	sc.setSch_name("SVN College");
		System.out.println( "Age:"+sc.getAge());
		System.out.println("Name :"+sc.getName());
		System.out.println( "Rollno:"+sc.getRollno());
		System.out.println("School Name: "+sc.getSch_name());
	}
	

}
