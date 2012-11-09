
import java.util.HashMap;




public class RoomClashes extends constraintInterface
{
    
   Chromosome c;
    
   public RoomClashes(int l)
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
        
int time,room;
       
Gene g;
g = c.genes[i];
time = g.time;
room = g.room;


        CombinationClass rts = new CombinationClass(time,room);
            int hashCode = rts.hashCode();
            
       
        
        if (RoomMap.containsKey(hashCode)) 
                            { 
                                
            violations = violations + 1;
                               
                            } 
            
        else 
        {
        RoomMap.put(hashCode,rts);
        }
        
        i++;
    }      
    return violations*this.weight;
    }
    
    
    
    
    
}