import java.util.*;
import java.util.Scanner;
public class large
{
    public static void main(String[] args) 
    {
        int max;
        Scanner s = new Scanner(System.in);
        int inp = s.nextInt();
        int a[] = new int[inp];
        for(int i = 0; i < inp; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < inp; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
