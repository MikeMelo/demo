/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
import java.util.HashMap;




public class LecturerTimeClashes extends constraintInterface
{
    
   Chromosome c;
    
    public LecturerTimeClashes(int l)
    {
    
    c = new Chromosome(l);
    
    }    
    

    @Override
    public double calculateViolations() 
    {
    int violations=0;    
        
    //code to check violations
    int i = 0; 
    int y = c.getLength();
  
   HashMap<Integer,CombinationClass> RoomMap = new HashMap<Integer,CombinationClass>();
  
    while(i <= y-1 )
    {
        
int teacher,time;
       
Gene g;
g = c.genes[i];
time = g.time;
teacher = g.teacher;


        CombinationClass lc = new CombinationClass(time,teacher);
            int hashCode = lc.hashCode();
            
       
        
        if (RoomMap.containsKey(hashCode)) 
                            { 
                                
            violations = violations + 1;
                                
                            } 
            
        else 
        {
        RoomMap.put(hashCode,lc);
        }
        
        i++;
    }      
    return violations*this.weight;
    }
    
    
    
    
    
}