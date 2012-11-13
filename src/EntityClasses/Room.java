/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

/**
 *
 * @author Michael
 */
public class Room 
{

    int id;
    int size;
    Building building;
   
    public Room(int id, int size, Building building)
    {
        this.id=id;
        this.size=size;
        this.building=building;
    }
    
}
