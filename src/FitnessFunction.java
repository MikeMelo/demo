/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class FitnessFunction 
{
    Chromosome c;
    
    public FitnessFunction(Chromosome newChromo)
    {
    
        c = newChromo;
        
    }
    
    public double calculateFitnesScore()
    {
     
       RoomClashes rc = new RoomClashes(c);
       // LecturerTimeClashes ltc = new LecturerTimeClashes(length);
        LunchTimeFree ltf = new LunchTimeFree(c);
       
        rc.setWeight(1); 
        //ltc.setWeight(0.4);
                
                
        ltf.setWeight(0.01);
        
        double violationScore =ltf.calculateViolations() + rc.calculateViolations();
        
        double score = (1/(1 + violationScore));
       
        
        return score;
    
     } 


}

    

