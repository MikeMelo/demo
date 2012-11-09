
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
   
   DummyDatabase da = new DummyDatabase();
   
   int numOfLectures = da.GetNumLectures();
   int numOfRooms = da.getNumRooms();
   Random rand = new Random();

   int i=0;
   
   while(i<=numOfLectures)
   {
  
   int lecture = da.getLecture(i);   
   int teacher = da.getTeacher(i);
   
   int RoomID = rand.nextInt(numOfRooms);
   int TimeSlotID = rand.nextInt(55);    
   Gene g = new Gene(teacher,lecture,RoomID,TimeSlotID);
   
   c.genes[i] = g;
   
   System.out.println(""+this.c.genes[i].teacher+""+this.c.genes[i].lecture+""+this.c.genes[i].room+""+this.c.genes[i].time+"");
   
   
   i++;
   }
   

   }  
}
