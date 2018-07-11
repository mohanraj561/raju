import java.util.*;
import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuffer s1=new StringBuffer(s);
    String s2=s1.reverse().toString();
    int k=Integer.parseInt(s2);
    int k1=Integer.parseInt(s);
    if(k==k1)
    {
    	System.out.print("it's a palindrome");
    }
    else
    {
    	System.out.print("it's not a palindrome");
    }
	}

}
