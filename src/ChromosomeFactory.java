
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class ChromosomeFactory
{
    
    Chromosome c;
    
   

   public ChromosomeFactory(int l)
   {
       
   c = new Chromosome(l);
   
   //DatabseAccess da = new DatabaseAccess
   
   //int teacher = da.getTeacher;
   //int lecture = da.getLecture;
   
   //int numOfRooms = da.GetNumRooms
   int numLectures=1;
   int numOfRooms=1;
   
   Random rand = new Random();
   
   
   int i=0;
   
   while(i<=numLEctures)
   {
       
   int teacher=1;
   int lecture=1;
   int RoomID = rand.nextInt(numOfRooms);
   int TimeSlotID = rand.nextInt(55);    
   Gene g = new Gene(teacher,lecture,RoomID,TimeSlotID);
   
   c.genes[i] = g;
   
   i++;
   }
   
   }

    
    
    
    
    
    
    
    
}
