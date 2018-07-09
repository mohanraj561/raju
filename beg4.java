import java.util.*;
import java.util.Scanner;
public class beg4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		 if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			 {
				System.out.print("Yes");
			 }
			else
			{
				System.out.print("No");
			}
	}
}
