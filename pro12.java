package mohan;
import java.util.Scanner;
public class pro12 
{
public static void main(String[] args) 
	{
	  String k2="";
      Scanner sc=new Scanner(System.in);
      String k1=sc.next();
      int k=sc.nextInt();
      if(k!=0)
      {
        for(int i=1;i<=k;i++)
        {
    	  k2=k1.substring(i);
        }
      System.out.print(Integer.parseInt(k2));
      }
      else
       {
    	  System.out.print(Integer.parseInt(k1));
       }
      
    }
}
