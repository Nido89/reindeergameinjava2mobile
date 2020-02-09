/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SyedjReindeer;



/**
 *
 * @author syedj
 */
// Reindeer Class added to the Midlet Package
//Object Reindeer is Created to be used in the Midlet Class
public class Reindeer extends Animal{
    // Two Properties parameters for the reindeer are set

   int size;
    String name;
    private int [] pCoord;
    int speed;
    int location;
    int ammo;
    private SyedjReindeerMidlet myMidlet;
   
   
    // Reindeer construcor to set the name and size varaibale types

    public Reindeer(String name, int size) {
        // Reindeer object name and size are called using keyword .this.
        this.name = name;
        this.size = size;
    }

    void move(SyedjReindeerMidlet aThis) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void status() {
        
        
           
    }
}
