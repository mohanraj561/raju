import java.io.*;
import java.util.*;
public class git10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String n1=sc.nextLine();
        HashSet<String> li=new HashSet<String>();
        for(int i=0;i<n.length(); i++)
        {
            li.add(Character.toString(n.charAt(i)));
        }
        HashSet<String> ha=new HashSet<String>();
        for(int j=0; j<n1.length(); j++)
        {
            ha.add(Character.toString(n1.charAt(j)));
        }
        if(li.size()==ha.size())
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
        
    }
}
