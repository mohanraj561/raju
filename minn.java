import java.util.*;
public class minn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
       int min=b[0];
        for(int j=1;j<b.length;j++)
        {
            if(b[j]<min)
            {
                min=b[j];
            }
        }
        System.out.print(min);
    }
}
