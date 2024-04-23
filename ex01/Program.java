// determine if the input determine is it prime or not

import java.util.Scanner;

public class Program{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try{

      
        int input = scanner.nextInt();
        if(input <= 1)
        {
            System.out.println("IllegalArgument");
            System.exit(1);
        }
        else
        {
            int count = 0;
            for(int i = 2; i< input/2;i++)
            {
                count++;
                if(input % i ==0)
                {
                    System.out.println("false " + count);
                    System.exit(0);
                }
            }
            System.out.println("true " + count);

        }
    }
        catch(Exception e)
        {
            System.out.println("an error occur: " + e.getMessage());
        }
         finally {
            scanner.close();
        }
    }
}


