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
    
    public LunchTimeFree(int l)
    {
    c = new Chromosome(l);
    }
    

    @Override
    public double calculateViolations() 
    {
      
    double violations=0;    
        

    int i = 0; 
    int y = c.getLength();
  
  
    while(i <= y-1 )
    {
        
int time;
       
Gene g;
g = c.genes[i];
time = g.time;

        if (time >= 16 && time <= 25)
                            { 
                                
            violations = violations + 1;
                                
                            } 
 
                i++;
    }      
    
    System.out.println(violations);
    return violations*this.weight;
  
    }
    
}
