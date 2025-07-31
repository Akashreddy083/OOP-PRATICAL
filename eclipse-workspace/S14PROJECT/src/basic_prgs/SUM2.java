package basic_prgs;
import java.util.Scanner;
public class SUM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		int s;
		s=a+b;
		System.out.print("sum is "+s);
		
	}

}
