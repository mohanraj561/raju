import java.util.Scanner;
 
public class vow
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
        StringBuffer sb=new StringBuffer(newInputString);
        newInputString.reverse().toString();
        System.out.print(newInputString);
     }
}
