import java.util.*;
import java.util.Scanner;
public class code15
{
  public static void main(String[] args)
     	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<b;i++)
		{
		    if(a<b-1)
		   {
		    	a++;
		    	if(a%2==0)
		    	{
		    	System.out.print(a+" ");
		        }
		   }
		    
		}
}
}
