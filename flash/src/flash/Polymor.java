package flash;
  /* Polymorphism is a greek word that means 
   *Poly- many, Morph-from,
   *Any Entity of Java  like as methods and constructor which available of many forms used as multiple task or behavior during runtime and compile time
   * Run time- Dynamic Polymorphism-- Method Overriding(late binding)
   * Compile Time- Static Polymorphism--Method overloading (early binding) Constructor overloading , operator overloading
   * 
   */

class Bank{
	int getinterestrate() {
	return 0;
	}
	
}
class Bank_2p extends Bank{
	int getinterestrate() {
		return 9;
		
	}
	
}


class Bank_3p extends Bank
{
	int getinterestrate() {
		
		return 8;
		
	}
}






public class Polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank ss=new Bank()	;
		Bank p=new Bank_2p();
		Bank pp=new Bank_3p();
		System.out.println(ss.getinterestrate());
		System.out.println(p.getinterestrate());
		System.out.println(pp.getinterestrate());
}
}