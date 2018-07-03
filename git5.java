import java.io.*;
import java.util.*;
public class git5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        for(int i=1;i<s.length;i++)
        {
            if(s1.equals(s[i]))
            {
                System.out.print(i);
            }
        }
        
    }
}
