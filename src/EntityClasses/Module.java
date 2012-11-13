package EntityClasses;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Michael
 */
public class Module 
{

    int id;
    String name;
 
    
    public Module(int id, String name)
    {
    this.id=id;
    this.name=name;
    
    }

    public void hey()
    {
        System.out.println("hey");
    }
}
