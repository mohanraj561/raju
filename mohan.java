import java.io.*;
import java.util.*;
import java.util.Scanner;
public class mohan
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z')
		 {
		   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    {
			  System.out.print("vowel");
		     }
		   else
	     	{
			System.out.print("consonant");
		    }
		 }
		   else
		   {
			   System.out.print("invalid");
		   }
	}
}


