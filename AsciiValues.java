import java.util.Scanner;
public class AsciiValues
{
   public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String a=sc.next();
        char ch=a.charAt(0);
        int asciicode=ch;
        int asciivalue=(int)ch;
        System.out.println("enter ascii code "  +ch+  " is:" + asciicode);
	 }
}	 
   

  	