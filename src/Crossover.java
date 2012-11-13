/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Crossover 
{
    Chromosome parent1;
    Chromosome parent2;
 
    
    public Crossover(Chromosome c1,Chromosome c2)
    {
    this.parent1=c1;
    this.parent2=c2;
    
    }

    public Chromosome Reproduce()
    {
        
        int length = this.parent1.genes.length;
        Chromosome child = new Chromosome(length);
        
        Gene[] genes;
        genes = new Gene[length/2]; 
        
        for(int i=0;i<(length/2);i++)
        {
        
           child.genes[i]=this.parent1.genes[i];
            
        }
        
         for(int i=(length/2);i<(length);i++)
        {
        
           child.genes[i]=this.parent2.genes[i];
            
        }

        return child;
        
    }
    
    
}
