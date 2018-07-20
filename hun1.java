import java.util.Arrays;
import java.util.Scanner;
public class hun1
{
    public static void main(String[] args)
	{
	  String m="";
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b[]=new int[a];
      String s="";
      for(int i=0;i<b.length;i++)
      {
    	  b[i]=sc.nextInt();
      }
      Arrays.sort(b);
      for(int i=0;i<b.length-1;i++)
      {
    	  for(int j=i+1;j<b.length;j++)
    	  {
    		  if(b[i]==b[j])
    		  {
    			  m=String.valueOf(b[i]);
    			  if(!s.contains(m))
    			  {
    				  s=s+m;
    			  }
    			  
    		  }
    	    }
      }
    System.out.print(s);
    if(s.length()==0)
    {
    	System.out.print("unique");
    }
 }
}

     
