import java.util.*;   
import java.io.*;
import java.awt.*;    /*if you’re not using these imports in your code, TAKE THEM OUT to help                              your runtime */

public class Prob08 //name of the problem
{
   public static void main(String[] args) throws Exception
   {
      Scanner inp = new Scanner(System.in);
            File file = new File("Prob08.in.txt");

            inp = new Scanner(file);
      
      
      while(inp.hasNext())
      {
         StringTokenizer st = new StringTokenizer(inp.nextLine());
         int eo = 0;
         int sideL = 2;
         int sideH = 0;
         String s = "";
         while(st.hasMoreTokens())
         {
            s = s + st.nextToken() + "."; 
         }

         
         while(!(s.length() <= (4*sideL - 4 - eo)))
         if(eo == 2)
            eo = 0;
         else
         {
            eo = 2;
            sideL++;      
         }
         
         if(s.length() < (4*sideL - 4 - eo))
            s = s + ".";
            
         if(eo == 2)
            sideH = sideL - 1;
         else
            sideH = sideL;
            
         ArrayList<String> chars = new ArrayList<String>();
               
         for(int u = 0; u < s.length(); u++)
         {
            chars.add(s.substring(u, u+1));
         }
         
            
         String[][] lol = new String[sideH][sideL];
         for(int r = 0; r < sideH; r++)
         for(int c = 0; c < sideL; c++)
         lol[r][c] = " ";
         
         for(int q = 0; q < sideL; q++)
            lol[0][q] = chars.remove(0);

         for(int w = 1; w<sideH; w++)
            lol[w][sideL - 1] = chars.remove(0);

  
         for(int r = sideL - 2; r>= 0; r--)
            lol[sideH-1][r] = chars.remove(0);

         for(int d = sideH - 2; d > 0; d--){

         lol[d][0] = chars.remove(0);
         }
         
         for(int r = 0; r < sideH; r++){ //80
            for(int c = 0; c < sideL; c++)
            System.out.print(lol[r][c]);
            System.out.println();
         }
         
         System.out.println();
      }
      
   }
}
