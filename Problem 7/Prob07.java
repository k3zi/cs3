import java.util.*;   
import java.io.*;
 

public class Prob07//name of the problem
{
   public static void main(String[] args) throws Exception
   {
      Scanner br = new Scanner(new File("Prob07.txt"));
      int points = Integer.parseInt(br.nextLine());
      while(br.hasNext())
      {
         ArrayList<String> list = new ArrayList<String>();
         String str = br.nextLine();
         while(str.charAt(0) != 'S')
         {
         list.add(str);
         str = br.nextLine();
         }
         while(br.hasNext())
         {
         String stu = str;
         int grade = 100;
         for(int i = 0; i < list.size(); i++)
         {
            if(list.get(i).equals(br.nextLine()))
            {
            }
            else
            {
              grade -=points;
            }
         }
         System.out.println(stu + ": " + grade);
         if(br.hasNext())
         str = br.nextLine();
         }
        
      }      
      
   }
}

