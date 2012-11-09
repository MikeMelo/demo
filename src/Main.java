/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Main 
{

    public static void main(String args[])
     {
     
         //Test function on current timetable

         FitnessFunction ff = new FitnessFunction();
         System.out.println(ff.calculateFitnesScore());
         
         System.out.println("Random Chromosome");
         System.out.println("------------------");
         
         ChromosomeFactory cf = new ChromosomeFactory(19);
         
     }
    
}
