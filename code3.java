import java.io.*;
import java.util.*;
import java.util.Scanner;
public class code3
{
	public static void main(String args[])
     {
        int count=1;
        int m=0;
		    Scanner sc=new Scanner(System.in);
	    	int s1=sc.nextInt();
	      int s2[]=new int[s1];
	      int s3=sc.nextInt();
	      while(count<=s3)
	      {
	        m=m+count;
	        count++;
         }
	       System.out.print(m);
       }
}






