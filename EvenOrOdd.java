import java.util.Scanner;
public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=a%2;
		if(b==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}
		