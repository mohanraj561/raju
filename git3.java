import java.io.*;
import java.util.*;
public class git3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer b=new StringBuffer(a);
        String c=b.reverse().toString();
        int d=Integer.parseInt(c);
        System.out.print(d);
        
    }
}
