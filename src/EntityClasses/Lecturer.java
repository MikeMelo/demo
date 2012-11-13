/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Lecturer 
{

    ArrayList<Module> module = new ArrayList<Module>();
    String name;
    int id;
    
    public Lecturer(int id)
    {
     this.id=id;   
    }

    
    
    public void AddModule(Module mod)
    {
    
    this.module.add(mod);
    
    }
    
    public void setName(String name)
    {
        this.name=name;
    }       
    
}
