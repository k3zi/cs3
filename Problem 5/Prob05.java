import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob05 {
   public static void main(String[] args) {

    File file = new File("Prob05.in.txt");

    try {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] exploded = line.split(" ");
   
            double op = Float.parseFloat(exploded[0]);
            double yir = Float.parseFloat(exploded[1]);
            double tm = Float.parseFloat(exploded[2]);
            double mp = Float.parseFloat(exploded[3]);
            
            double ir = yir/1200;
            double last = 1.0;
            double payment = monthlyPayment(tm, ir, op);
            int i = 0;
            
            while(i != mp) {
               last = remaining(last, payment, ir);
               i++;
            }
            
            System.out.printf("X: %.2f\n", (op - last));
         }
        input.close();
    } catch (FileNotFoundException e) {
       e.printStackTrace();
    }
  }
  
  public static double monthlyPayment(double months, double ir, double op) {
      double inner = Math.pow(1.0f + ir, -months);
      return op * (ir/(1.0f - inner));
  }
  
  public static double remaining(double last, double monthly, double interest) {
      return last - (monthly - (last * interest));
  }
}