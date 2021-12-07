/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2v2;
import java.util.ArrayList;
/**
 *
 * @author Maruf Siddique
 */
public class Room {
    private String roomID;
    private String description;
    private String searchDescription;
    private ArrayList<Door> doors;
    
    public Room (String id,String desc,String searchDesc)
    {
        roomID= id;
        description= desc;
        searchDescription= searchDesc;
        doors= new ArrayList();
    }
    
    public void addDoor(String nextRoom)
    {
        Door d =new Door(roomID,nextRoom);
        
        doors.add(d);
        
    }
    
    public boolean hasDoor(String door)
    {
        System.out.println("**To be developed");
        return false;
    }
    
   public String getSearchDescription()
   {
       return searchDescription;
   }
   public String roomDescription()
   {
       System.out.println("***Under development to output room description & list of doors");
       return description;    
   }
   
   public String toString()
   {
       StringBuffer listOfDoors= new StringBuffer();
       //for (classtype variable: the name of arraylist)
       //{
       //
       //}
      
       for (Door d: doors)
       {
           listOfDoors.append(d);
       }
       return "\nYou are in room" + roomID + "\n\n" + description + "\n" + searchDescription + "\nYou can see the following doors\n" + listOfDoors;
   }
}

