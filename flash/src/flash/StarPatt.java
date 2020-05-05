package flash;

 class StarPatt{
public static void Fun(int g) {
	int i,j,k;
	for(i=1;i<=5;i++) {
		for(j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(k=1;k<=i;k++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	/*
	 *
    **
   ***
  ****
 *****
	 */
	
}
	 
	 
public static void Myfun(int n) {
	
	 int i,j;
	 for(i=1;i<=n;i++) {
		 for(j=1;j<=i;j++) {
			 System.out.print("*");
			 
		 }
		 System.out.println();
	 }
	 
	System.out.println("  ");
}
/*
*
**
***
****
*****
 */


//Reverse Triangle..
public static void Myfun(float tt) {
	int i,j;
	for(i=0;i<=tt;i++) {
		for(j=7;j>=i;j--) {
			System.out.print("*");
			
		}
		System.out.println();
	}

}
/*Output...
 ********
*******
******
*****
****
***
**
*
  
 */
	 
	 
	 public static void main(String ss[]) {
		 
	 int n=5;
	 Myfun(n);
	 float tt=7;
	 Myfun(tt);
	 int g=5;
	 Fun(g);
	 
}
 }