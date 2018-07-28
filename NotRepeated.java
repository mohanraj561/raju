import java.util.*;
public class NotRepeated
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s[]=new int[a];
        String s1="";
        for(int j=0;j<s.length;j++)
        {
            s[j]=sc.nextInt();
            if(!s1.contains(String.valueOf(s[j])+" "))
            s1=s1+(String.valueOf(s[j]))+" ";
        }
        String t[]=s1.split(" ");
        //System.out.println(s1);
        int c=0;
        for(int i=0; i<t.length; i++)
        {
            for(int j=0; j<a; j++)
            {
                if((Integer.valueOf(t[i])) == s[j])
                {
                    c=c+1;
                }
            }
            if(c==1)
            {
                System.out.print(t[i]+" ");
            }
            c=0;
        }
    }
}
