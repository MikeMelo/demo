/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
abstract class constraintInterface 

{

 double weight;
 
 void setWeight(double w)
 {
 
     this.weight=w;
 
 }

double getWeight()
{
return this.weight;
}
 
public abstract double calculateViolations();

    
    
    
}
