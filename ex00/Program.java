

public class Program {
    public static void main(String[] args)
    {
        int myValue = 479598;
        int result = 0;
        String numberStr = String.valueOf(myValue);
        for(char c: numberStr.toCharArray())
        {
            if(Character.isDigit(c))
                result += Character.getNumericValue(c);
        }
        System.out.println(result);
    }
}