import java.util.Scanner;
public class you 
{
 public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine().toLowerCase();
	 String s1[]=s.split(" ");
	 for(int i=0;i<s1.length;i++)
	 {
		 System.out.print(s1[i].substring(0,1).toUpperCase()+s1[i].substring(1)+" ");
	 }
	}

}
