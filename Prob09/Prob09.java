import java.util.*;   
import java.io.*;
import java.awt.*;    /*if you’re not using these imports in your code, TAKE THEM OUT to help                              your runtime */

public class Prob09 //name of the problem
{
   public static void main(String[] args) throws Exception
   {
      Scanner inp = new Scanner(System.in);
            File file = new File("Prob09.in.txt");

            inp = new Scanner(file);
        
      ArrayList<String> s = new ArrayList<String>();    
      ArrayList<String> f = new ArrayList<String>();                            
      StringTokenizer st = new StringTokenizer(inp.nextLine());
      
      while(st.hasMoreTokens())
         s.add(st.nextToken());

      
      int conteer = 0;
      
      for(int i = 0; i < s.size(); i++)
      {
         String temp = s.get(i);
         for(int o = i; o < s.size(); o++)
         if(temp.length() == s.get(o).length())
         {
            int count = 0;
            for(int y = 0; y < temp.length(); y++)
            {
               if(!(temp.substring(y, y+1).equals(s.get(o).substring(y, y+1))))
               count++;
            }

            if(count==1){
               if(temp.compareTo(s.get(o)) > 0){
                  f.add(s.get(o) + " " + temp);

                  }
               else{
                  f.add(temp + " " + s.get(o));

                  }
            }
         }
      }
      
      Collections.sort(f);
      
      for(int i = 0; i < f.size(); i++)
         System.out.println(f.get(i));
      
   }
}
