package mohan;
import java.util.Scanner;
public class armstrongn
{
	public static void main(String[] args)
	 {
		int c=0, a,temp;
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		temp=k;
		while(k>0)
       {
    	   a=k%10;
    	   k=k/10;
    	   c=c+(a*a*a);
    	}
		if(temp==c)
		 {
		System.out.print("yes its armstrong number");
		 }
		else
		 {
		System.out.print("No, its not a armstrong number");
	     }
	 }
}
