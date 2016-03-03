import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob03 {
   public static void main(String[] args) {

    File file = new File("Prob03.in.txt");

    try {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int ascOrDesc = 0;
            boolean isRandom = false;
            boolean isInvalid = false;
            
               String[] exploded = line.split(" ");
               
               for(int i = 0; i < exploded.length; i++) {
                  if(i > 0) {
                     if(!(exploded[i]).matches("^-?\\d+$") || !(exploded[i - 1]).matches("^-?\\d+$")) {
                        isInvalid = true;
                        break;
                     }
                     
                     int last = Integer.parseInt(exploded[i - 1]);
                     int current = Integer.parseInt(exploded[i]);
                     
                     if(current < last) {
                        if (ascOrDesc == 1) {
                           isRandom = true;
                           break;
                        } else {
                           ascOrDesc = -1; //Descend
                        }
                     } else if(current > last) {
                        if (ascOrDesc == -1) {
                           isRandom = true;
                           break;
                        } else {
                           ascOrDesc = 1; //Assend
                        }
                     }
                  }
            }
            
            if(isInvalid) {
               System.out.println("The input was invalid");
            } else if(isRandom) {
              System.out.println("The numbers are in random order");
            } else if (ascOrDesc == 1) {
              System.out.println("The numbers are in asscending order");
            } else if (ascOrDesc == -1) {
              System.out.println("The numbers are in descidning order");
            }
        }
        input.close();
    } catch (FileNotFoundException e) {
       e.printStackTrace();
    }
  }
}