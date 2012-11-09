/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public interface DatabaseAccessor 
{

   int GetRoom (int entry);
   int GetNumLectures();
   int getTeacher(int entry);
   int getLecture(int entry);
   int getNumRooms();
   
   
}
