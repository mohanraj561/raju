import java.util.*;
public class leapp
{
    public static void main(String args[])
    {
        boolean leap=false;
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
         if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}



