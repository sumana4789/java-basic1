import java.util.Scanner;
public class AssignmentOperators
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter firstnumber");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		b=a;
		System.out.println("=output "+ (b=a));
		b+=a;
		System.out.println("+=output "+ (b+=a));
		b-=a;
		System.out.println("-=output "+ (b-=a));
		b*=a;
		System.out.println("*=output "+ (b*=a));
		b/=a;
		System.out.println("/=output "+ (b/=a));
		b%=a;
		System.out.println("%=output "+ (b%=a));
	}
}
		
		
		