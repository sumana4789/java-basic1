import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int fibonacci=sc.nextInt();
		int a=0;
		int b=1;
		if(fibonacci==1)
		{
			System.out.println(a);
		}
		else if(fibonacci==2)
		{
			System.out.println(b);
		}
		for(int i=3;i<=fibonacci;++i)
		{
			int sum=a+b;
			a=b;
			b=sum;
		}
		System.out.print(b);
	}
}
		