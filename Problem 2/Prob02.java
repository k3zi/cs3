import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob02 {
   public static void main(String[] args) {

    File file = new File("Prob02.in.txt");

    try {

        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] exploded = line.split(" ");
            
            int tTotal = Integer.parseInt(exploded[0]);
            int hTotal = Integer.parseInt(exploded[1]);
           
            if(tTotal == hTotal) {
               System.out.println("Times and Herald have the same number of subscribers");
             } else {
               String x = tTotal > hTotal ? ("Times has " + Integer.toString(tTotal - hTotal) + " more subscribers") : ("Herald has" + Integer.toString(hTotal - tTotal) + "more subscribers");
               System.out.println(x);
             }
        }
        input.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
  }
}