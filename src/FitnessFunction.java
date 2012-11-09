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

    public double calculateFitnesScore()
    {
    
        RoomClashes rc = new RoomClashes(19);
        LecturerTimeClashes ltc = new LecturerTimeClashes(19);
        LunchTimeFree ltf = new LunchTimeFree(19);
        
        
        Gene g1 = new Gene(1,1,1,11);
        rc.c.genes[0]=g1;
        ltc.c.genes[0]=g1;
        ltf.c.genes[0]=g1;
        //em.c.genes[0]=g1;
        
        Gene g2 = new Gene(1,2,1,16);
        rc.c.genes[1]=g2;
        ltc.c.genes[1]=g2;
        ltf.c.genes[1]=g2;
        //em.c.genes[1]=g2;
        
        Gene g3 = new Gene(2,3,2,26);
        rc.c.genes[2]=g3;
        ltc.c.genes[2]=g3;
        ltf.c.genes[2]=g3;
        //em.c.genes[2]=g3;
        
        Gene g4 = new Gene(3,4,3,27);
        rc.c.genes[3]=g4;
        ltc.c.genes[3]=g4;
        ltf.c.genes[3]=g4;
        //em.c.genes[3]=g4;
      
        Gene g5 = new Gene(3,5,3,32);
        rc.c.genes[4]=g5;
        ltc.c.genes[4]=g5;
        ltf.c.genes[4]=g5;
        //em.c.genes[4]=g5;
        
        Gene g6 = new Gene(2,6,4,37);
        rc.c.genes[5]=g6;
        ltc.c.genes[5]=g6;
        ltf.c.genes[5]=g6;
        //em.c.genes[5]=g6;
        
        Gene g7 = new Gene(4,7,5,8);
        rc.c.genes[6]=g7;
        ltc.c.genes[6]=g7;
        ltf.c.genes[6]=g7;
        //em.c.genes[6]=g7;
        
        Gene g8 = new Gene(5,8,1,13);
        rc.c.genes[7]=g8;
        ltc.c.genes[7]=g8;
        ltf.c.genes[7]=g8;
        //em.c.genes[7]=g8;
        
        Gene g9 = new Gene(5,9,6,18);
        rc.c.genes[8]=g9;
        ltc.c.genes[8]=g9;
        ltf.c.genes[8]=g9;
        //em.c.genes[8]=g9;
        
        Gene g10 = new Gene(4,10,5,33);
        rc.c.genes[9]=g10;
        ltc.c.genes[9]=g10;
        ltf.c.genes[9]=g10;
        //em.c.genes[9]=g10;
        
        Gene g11 = new Gene(6,11,7,9);
        rc.c.genes[10]=g11;
        ltc.c.genes[10]=g11;
        ltf.c.genes[10]=g11;
        //em.c.genes[10]=g11;
        
        Gene g12 = new Gene(6,12,7,14);
        rc.c.genes[11]=g12;
        ltc.c.genes[11]=g12;
        ltf.c.genes[11]=g12;
        //em.c.genes[11]=g12;
        
        Gene g13 = new Gene(2,13,8,34);
        rc.c.genes[12]=g13;
        ltc.c.genes[12]=g13;
        ltf.c.genes[12]=g13;
        //em.c.genes[12]=g13;
        
        Gene g14 = new Gene(2,14,8,39);
        rc.c.genes[13]=g14;
        ltc.c.genes[13]=g14;
        ltf.c.genes[13]=g14;
        //em.c.genes[13]=g14;
        
        Gene g15 = new Gene(7,15,1,20);
        rc.c.genes[14]=g15;
        ltc.c.genes[14]=g15;
        ltf.c.genes[14]=g15;
        //em.c.genes[14]=g15;
        
        Gene g16 = new Gene(7,16,6,30);
        rc.c.genes[15]=g16;
        ltc.c.genes[15]=g16;
        ltf.c.genes[15]=g16;
        //em.c.genes[15]=g16;
        
        Gene g17 = new Gene(8,17,9,35);
        rc.c.genes[16]=g17;
        ltc.c.genes[16]=g17;
        ltf.c.genes[16]=g17;
        //em.c.genes[16]=g17;
        
        Gene g18 = new Gene(8,18,10,40);
        rc.c.genes[17]=g18;
        ltc.c.genes[17]=g18;
        ltf.c.genes[17]=g18;
        //em.c.genes[17]=g18;
        
        
        Gene g19 = new Gene(8,19,10,45);
        rc.c.genes[18]=g19;      
        ltc.c.genes[18]=g19;
        ltf.c.genes[18]=g19;
        
        
        rc.setWeight(0.4); 
        ltc.setWeight(0.4);
                
                
        ltf.setWeight(0.01);
                
        double violationScore = rc.calculateViolations() + ltc.calculateViolations() + ltf.calculateViolations();
        
        double score = (1/(1 + violationScore));
       
        
        return score;
    
     }  }

    

