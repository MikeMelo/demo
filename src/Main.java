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
     
         ChromosomeFactory cf = new ChromosomeFactory();
         FitnessFunction ff = new FitnessFunction(cf.c);
         
        Double score = ff.calculateFitnesScore();

        System.out.println("------------");
        System.out.println("Fitness Score");
        System.out.println("------------");
        System.out.println(score);
         
         
     }
    
}
