/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class CombinationClass
{
    
    int comb1;
    int comb2;
    
    public CombinationClass(int t, int r)
    {
    
        this.comb1=t;
        this.comb2=r;
        
    }
    
    
    public int hashCode()
    {
    int hash=23;
    hash = hash * 31 + this.comb1;
    hash = hash * 31 + this.comb2;
    return hash;
    }
    
    
    
}
