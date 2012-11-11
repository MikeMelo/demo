/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class LunchTimeFree extends constraintInterface {

    Chromosome c;
    
    public LunchTimeFree(Chromosome chromo)
    {
    c = chromo;
    }
    

    @Override
    public double calculateViolations() 
    {
      
    double violations=0;    
        

    int i = 0; 
    int y = c.getLength();
  
  
    for (i=0; i < c.getLength(); i++) {
final Gene[] allGenes = c.genes;
final Gene aGene = allGenes[i];
final int time = aGene.time;
   if (time >= 16 && time <= 25) {                           
      violations++;   
   }
}
    
   
    return violations*this.weight;
    
    }
    
}
