
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
    
   

   public ChromosomeFactory()
   {
       
   DummyDatabase da = new DummyDatabase();
   int numOfLectures = da.GetNumLectures();    
   c = new Chromosome(numOfLectures);
   
   
   
   
   
   

   int i=0;
   
   while(i<=numOfLectures-1)
   {
  
   int lecture = da.getLecture(i);   
   
   int r = da.Rooms[(int)(Math.random() * da.Rooms.length)];
   int t = da.TimeSlots[(int)(Math.random() * da.TimeSlots.length)]; 
   
   Gene g = new Gene(lecture,lecture,r,t);
   
   c.genes[i] = g;
   
   System.out.println(""+this.c.genes[i].teacher+","+this.c.genes[i].lecture+","+this.c.genes[i].room+","+this.c.genes[i].time+"");
   
   
   i++;
   }
   

   }  
}
