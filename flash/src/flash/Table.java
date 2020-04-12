package flash;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		
		int num=sc.nextInt();
		for(int i=0;i<=9;i++) {
			System.out.println(num+"x"+(i+1)+"="+(num*(i+1)));
			
		}
		
	}

}
