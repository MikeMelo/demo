/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Chromosome 
{

    Gene[] genes;
   
    
     
    public Chromosome(int l)
    {
    genes = new Gene[l]; 
   
    }
    
    public int getLength()
    {
   return genes.length;
    }
    
    
    
}
