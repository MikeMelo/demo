import EntityClasses.*;


public class DummyDatabase implements DatabaseAccessor
{
   
   
   int[] Lecturers = { 1,2,3,4,5,6,7,8,9 };
   int[] Lectures = { 1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19} ;
   
   int[] TimeSlots = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55};
   
   int[] Rooms = {1,2,3,4,5,6,7,8,9,10};
  
   
          
           
           
    @Override
    public int GetRoom(int entry) {
        
        return this.Rooms[entry];
    }

    @Override
    public int GetNumLectures() {
        return this.Lectures.length;
    }

    @Override
    public int getTeacher(int entry) {
        return this.Lecturers[entry];
    }

    @Override
    public int getLecture(int entry) {
        return this.Lectures[entry];
    }

    @Override
    public int getNumRooms() {
        return this.Rooms.length;
    }

     
    
   }
