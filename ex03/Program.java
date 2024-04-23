import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
 // A little bit of statistic
public class Program {
    public static void main(String[] args)
    {
        LinkedHashMap<String, Integer> storeData = new LinkedHashMap<>();
        String line = "";
        int count = 1;
        do{
            Scanner scanner = new Scanner(System.in);
             line = scanner.nextLine(); 
            try{
                if(line.equals("week " + count))
                {
                
                    String nextLine = scanner.nextLine();
                    String[] tokens = nextLine.split(" ");
                    if(tokens.length != 5)
                        throw new IllegalArgumentException();

                    int min =Integer.parseInt(tokens[0]);
                    
                    for(int i=1;i < tokens.length;i ++)
                    {
                    int  value = Integer.parseInt(tokens[i]);
                    if(value < 1 || value > 9)
                        throw new IllegalArgumentException("Age cannot be negative");

                    if(value < min)
                        min = value;
                    }
                    storeData.put(line,min);
                    count ++;
                }
                else
                    throw new IllegalArgumentException("Age cannot be negative");
                    
              }catch(Exception e){
                System.out.println("illegaMessage");
                System.exit(1);

              
            }

        }while(!line.equals("42"));

        for (Map.Entry<String, Integer> entry : storeData.entrySet()) {
            System.out.println(entry.getKey() + " " + "=".repeat(entry.getValue()) + ">");
        }
    }
}