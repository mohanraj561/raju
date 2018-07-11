import java.util.*;
import java.util.Scanner;
public class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double result=Math.pow(a,b);
        System.out.print((int)result);
    }
}
