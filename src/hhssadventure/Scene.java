/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author rayan4858
 */
public class Scene{
    private int direction;
   
        try
    {
          FileReader file = new FileReader("file.txt");
          Scanner s = new Scanner(file);
          while(s.hasNext())
          {
             System.out.println(s.nextInt());
          }
     }catch(Exception e)
     {
          e.printStackTrace();
     }
    
    public boolean frontBlocked( ){
        
    }
    
    public boolean nextLocation( ){
        
    }
    
    public boolean frontBlocked( ){
        
    }
    
    
}
