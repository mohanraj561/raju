import java.util.*;
public class pro1
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    for(int i=0;i<a.length();i++)
    {
      if(a.charAt(i)==b.charAt(i))
        {
         System.out.print(a.charAt(i));    
        }
        else
        {
            break;
        }
    }
}
}
