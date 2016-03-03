import java.io.File;
import java.util.Scanner;

public class Prob01 {

    public static void main(String[] args)throws Exception {

        try {
            Scanner input = new Scanner(System.in);
            File file = new File("Prob01.in.txt");

            input = new Scanner(file);
            double sum = 0;


            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] swag = line.split("=");
    
                if(line.contains("QUARTER"))
                {
                  int miley = Integer.parseInt(swag[1]);
                  sum+= (miley*.25);
                }
                if(line.contains("DIME"))
                {
                 int miley = Integer.parseInt(swag[1]);
                 sum+= (miley*.1);
                }
                if(line.contains("NICKEL"))
                {
                  int miley = Integer.parseInt(swag[1]);
                  sum+= (miley*.05);
                }
                if(line.contains("HALFDOLLAR"))
                {
                int miley = Integer.parseInt(swag[1]);
                sum+= (miley*.50);
                }
                if(line.contains("PENNY"))
                {
                  int miley = Integer.parseInt(swag[1]);
                  sum+= (miley*.01);
                }
                
            }
            System.out.println("$" + sum);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
