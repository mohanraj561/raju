import java.io.*;
import java.util.*;
public class git2
{
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=20)
        {
        for(int i=1;i<=a;i++)
          {
              fact=fact*i;
          }
             System.out.print(fact);
        }
    }
}
