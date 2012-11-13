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
       
       Chromosome c1,c2;
       c1=cf.newChromo();
       c2=cf.newChromo();
       
       
       FitnessFunction ff2 = new FitnessFunction(c1);
       FitnessFunction ff1 = new FitnessFunction(c2);
       
       
        Double score1 = ff1.calculateFitnesScore();
        Double score2 = ff2.calculateFitnesScore();
        
      
        System.out.println("Fitness Score for Chromosome 1:");
        System.out.println("------------");
        System.out.println(score1);
        System.out.println("------------");
     
        System.out.println("Fitness Score for Chromosome 2:");
        System.out.println("------------");
        System.out.println(score2);
        System.out.println("------------");  
        
        int length = c2.genes.length;
        Chromosome child = new Chromosome(length);
        Crossover crosser = new Crossover(c1,c2);
        child = crosser.Reproduce();
        
        FitnessFunction ff3 = new FitnessFunction(child);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Fitness Score for Chromosome 23:");
        System.out.println("------------");
        System.out.println(ff3.calculateFitnesScore());
        System.out.println("------------");  
        
     }
    
}
