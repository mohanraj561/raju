import java.io.*;
import java.util.*;
public class gits23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int n=Character.getNumericValue(s.charAt(i));
            sum+=n*n;
        }
        System.out.print(sum);
        
    }
    
}
