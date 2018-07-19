import java.util.*;
public class primee
{
    public static void main(String args[])
    {
        int temp=0;
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");

        }
    }
}
