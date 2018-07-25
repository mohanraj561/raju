import java.util.*;
public class remvow
{
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int a=Integer.valueOf(sc.nextLine());
	        String str1=sc.nextLine();
	        int l=str1.length();
	        if(a==l)
	        {
	          String b=str1.replaceAll("[AEIOUaeiou]","");
	          StringBuffer sb=new StringBuffer(b);
	          sb.reverse().toString();
	          System.out.print(sb);
	        }
	        
	    }
	}
