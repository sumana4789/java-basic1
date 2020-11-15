import java.util.Scanner;
public class VowelOrConsonent
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabet");
		String s=sc.next();
		char ch=s.charAt(0);
		switch(ch)
		{
			case 'a':
			System.out.println("vowel");
			break;
			case 'e':
			System.out.println("vowel");
			break;
			case 'i':
			System.out.println("vowel");
			break;
			case 'o':
			System.out.println("vowel");
			break;
			case 'u':
			System.out.println("vowel");
			break;
			default:
			System.out.println("consonent");
		}

	}
}	