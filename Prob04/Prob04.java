import java.io.File;
import java.util.Scanner;

public class Prob04 {

    public static void main(String[] args)throws Exception {

   Scanner bruh = new Scanner(new File("Prob04.in.txt"));
   String ding = bruh.nextLine();
   while(bruh.hasNext())
   {
      String swag = bruh.nextLine();
      String[] arr = swag.split(" ");
      String c = "";
      
      for(int i=0; i<arr.length; i++)
      {
         String[] list = arr[i].split("-");
         for(int a=0; a<list.length; a++)
         {
            int sata = Integer.parseInt(list[a]);
            c += (ding.substring(sata-1 , sata));
         }
         c += " ";
      }
      System.out.println(c);
   }

}
}