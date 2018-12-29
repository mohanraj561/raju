import java.util.*;
import java.util.Scanner;
public class pre 
{
public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		int o = Integer.parseInt(sc.nextLine());
	    String s[]=new  String[o];		//String s1=sc.next();
		//String s2=sc.next();
		for(int p=0;p<s.length;p++)
		{
			s[p]=sc.nextLine();
		}
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length-1;j++)
			{
				for(int k=0;k<s.length;k++)
				{
				  if(s[i].charAt(k)==s[j].charAt(k))
				   {
					System.out.print(s[i].charAt(k));
				   }
			    }
				System.out.println();
		     }
			  

	}
