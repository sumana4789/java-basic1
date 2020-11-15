import java.util.Scanner;
public class BinaryNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		while(n/2!=0)
		{
			n=n/2;
		    System.out.println(n%2);
		}
	}
}