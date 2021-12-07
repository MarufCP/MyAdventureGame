/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2v2;

/**
 *
 * @author Maruf Siddique
 */
public class Door {
     
   private final String FROM;
   private final String TO;
   
   public Door(String from,String to)        
   {
       FROM= from;
       TO= to;
   }
    
   public String getTo()
   {
       return TO;
   }
   public String toString()
   {
       return "<Door from " + FROM + " to  " + TO + ">\n";
   }

}
