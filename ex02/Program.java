// count the number of elements for a specified set of numbers whos sum of digitsis a prime number


import java.util.Scanner;

class SumOfDigit{
    public static int sumOfdigits(int value)
    {
        int result = 0;
        String numberStr = String.valueOf(value);

        for(char c: numberStr.toCharArray())
        {
            if(Character.isDigit(c))
                result += Character.getNumericValue(c);
        }
        return result;
    }
}
class PrimeCheck{
    public static boolean primeCheck(int value)
    {
        int count = 0;
        for(int i = 2; i< value/2;i++)
        {
            count++;
            if(value % i ==0)
            {
                return false;
            }
        }
        return true;
    }
}
public class Program{
    public static void main(String[] args)
    {
        int input  = 0;
        int count = 0;
        do {
        Scanner scanner = new Scanner(System.in);
        try{
        
              
             input = scanner.nextInt();
            if(input <= 1)
            {
                System.out.println("IllegalArgument");
                System.exit(1);
            }
            else
            {
                int value = SumOfDigit.sumOfdigits(input);
                if(PrimeCheck.primeCheck(value))
                {
                    count ++;
                }
            }
        }
        
            catch(Exception e)
            {
                System.out.println("an error occur: " + e.getMessage());

            }
        
    }while(input != 42);
    System.out.println("Count of coffe-request : " + count);
    }
}