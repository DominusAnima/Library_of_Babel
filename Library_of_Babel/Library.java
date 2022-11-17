
/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Library {
    Room loadedRoom;
    
    public Library() {
        // initialise instance variables
    }
    
    public void loadRoom(int posX, int posY) {
        loadedRoom = new Room(posX, posY);
    }
}
