/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2v2;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Maruf Siddique
 */
public class World {

    // data to build the map of the world. nodes are the rooms, edges are the doors
    static String[] roomIDs = {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12",
        "13",
        "14",
        "15",
        "16",
        "17",
        "18",
        "19",
        "20",};

    static String[] roomDescriptions = {
        "desc1",
        "desc2",
        "desc3",
        "desc4",
        "desc5",
        "desc6",
        "desc7",
        "desc8",
        "desc9",
        "desc10",
        "desc11",
        "desc12",
        "desc13",
        "desc14",
        "desc15",
        "desc16",
        "desc17",
        "desc18",
        "desc19",
        "desc20",};

    static String[] searchDescriptions = {
        "room1 detailed description of results of search",
        "room2 detailed description of results of search",
        "room3 detailed description of results of search",
        "room4 detailed description of results of search",
        "room5 detailed description of results of search",
        "room6 detailed description of results of search",
        "room7 detailed description of results of search",
        "room8 detailed description of results of search",
        "room9 detailed description of results of search",
        "room10 detailed description of results of search",
        "room11 detailed description of results of search",
        "room12 detailed description of results of search",
        "room13 detailed description of results of search",
        "room14 detailed description of results of search",
        "room15 detailed description of results of search",
        "room16 detailed description of results of search",
        "room17 detailed description of results of search",
        "room18 detailed description of results of search",
        "room19 detailed description of results of search",
        "room20 detailed description of results of search",};

    //edges are the doors: Edge format is <from, to> 
    static String[][] edges = {
        {"1", "11"},
        {"1", "10"},
        {"1", "2"},
        {"2", "12"},
        {"2", "1"},
        {"2", "3"},
        {"3", "13"},
        {"3", "2"},
        {"3", "4"},
        {"4", "14"},
        {"4", "13"},
        {"4", "3"},
        {"4", "5"},
        {"5", "15"},
        {"5", "4"},
        {"5", "6"},
        {"6", "16"},
        {"6", "5"},
        {"6", "7"},
        {"7", "17"},
        {"7", "6"},
        {"7", "8"},
        {"8", "18"},
        {"8", "7"},
        {"8", "9"},
        {"9", "19"},
        {"9", "8"},
        {"9", "10"},
        {"10", "20"},
        {"10", "9"},
        {"10", "1"},
        {"11", "1"},
        {"11", "19"},
        {"11", "13"},
        {"12", "2"},
        {"12", "20"},
        {"12", "14"},
        {"13", "4"},
        {"13", "3"},
        {"13", "11"},
        {"13", "15"},
        {"14", "4"},
        {"14", "12"},
        {"14", "16"},
        {"15", "5"},
        {"15", "13"},
        {"15", "17"},
        {"16", "6"},
        {"16", "14"},
        {"16", "18"},
        {"17", "7"},
        {"17", "15"},
        {"17", "19"},
        {"18", "8"},
        {"18", "16",},
        {"18", "20",},
        {"19", "9",},
        {"19", "17",},
        {"19", "11",},
        {"20", "10",},
        {"20", "18",},
        {"20", "12",}};

    private HashMap<String, Room> map;
    private Room currentRoom;

    public World()
    {
       loadMap(); 
    }
    
    public void start()
    {
        currentRoom = map.get("1");
        
    }
    
    public void loadMap()
    {
        map= new HashMap();
        
        //Build the hashmap of rooms
        for(int i=0;i<roomIDs.length;i++)
        {
            Room r = new Room( roomIDs[i], roomDescriptions[i], searchDescriptions[i] );
            //Put needs to be passed or given the key i.e. the room ID & the whole room we just created
            map.put(roomIDs[i],r);
        }
        
        //Add the edges or doors to the rooms   
        for (int i=0;i<edges.length;i++)
        {
            String from =edges[i][0];
            String to = edges[i][1];
            
            Room r = map.get(from);
            r.addDoor(to);
        }
        
    }
    
    public void displayMapData() {

        Collection<Room> values = map.values();

        for (Room r : values) {

            System.out.println(r + "\n\n");

        }

    }

    public String describe() {
        currentRoom.roomDescription();
        return null;
    }
    
}
