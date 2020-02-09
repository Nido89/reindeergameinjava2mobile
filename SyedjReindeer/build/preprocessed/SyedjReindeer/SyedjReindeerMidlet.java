/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SyedjReindeer;

import java.util.Random;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

/**
 * @author syedj
 */
public class SyedjReindeerMidlet extends MIDlet implements CommandListener {
//Refernce Variable Reindeer is deifned as an object syedjReindeer from the Objct class Reindeer 

    private Command moveCommand, exitCommand, restartCommand;
    private Display dDisplay;
    private Form f;
    private StringItem wolfsaysSI, ammoSI, distanceSI;
    private Gauge reindeerspeed;
    public Alert startAlert, winAlert, looseAlert,wolfcatch;
    Reindeer syedjReindeer;
    Wolf syedjwolf;
    int[] xCoord;

    // A new object called new Reindeer is constructed in the constructor of the midlet
    public SyedjReindeerMidlet() {

        
        // This is a new reindeer which is an instance of the objct class Reindeer with name my reindeer and size = 10;
        syedjReindeer = new Reindeer("Jalal Reindeer", 10);
        syedjwolf = new Wolf();

        f = new Form("Reindeer Game");
        distanceSI = new StringItem("Distance:", "100 ");
        distanceSI.setLayout(StringItem.LAYOUT_2);
        ammoSI = new StringItem("Ammo:", "100");
        ammoSI.setLayout(StringItem.LAYOUT_2);

        wolfsaysSI = new StringItem("Wolfsays:", "");
        wolfsaysSI.setLayout(StringItem.LAYOUT_2);

        reindeerspeed = new Gauge("Speed", true, 20, 0);
        moveCommand = new Command("Move", Command.OK, 1);
        restartCommand = new Command("Eat", Command.BACK, 2);
        exitCommand = new Command("Exit", Command.EXIT, 3);

        f.addCommand(moveCommand);
        f.addCommand(restartCommand);
        f.addCommand(exitCommand);
        f.setCommandListener(this);

        f.append(distanceSI);
        f.append(ammoSI);
        f.append(wolfsaysSI);
        f.append(reindeerspeed);
        startAlert = new Alert("Start Game:", "Game Started", null,
                AlertType.CONFIRMATION);
        startAlert.setTimeout(Alert.FOREVER);
        winAlert = new Alert("Win Game:", "Game Won", null,
                AlertType.INFO);
        winAlert.setTimeout(Alert.FOREVER);
        looseAlert = new Alert("Loose Game:", "Game lost", null,
                AlertType.CONFIRMATION);
        looseAlert.setTimeout(Alert.FOREVER);
        wolfcatch = new Alert("GAME OVER!");
        wolfcatch.setTimeout(Alert.FOREVER);
        








    }

    // This is the default method of the class Midlet which would start the application with assigned parameters;
    public void startApp() {
        if (dDisplay == null) {

            f.setCommandListener(this);
            syedjReindeer.status();
            syedjwolf.status();

            dDisplay = Display.getDisplay(this);
            dDisplay.setCurrent(f);
        }







        // Agan an x value or a name variable type Reindder  is assigned to the Reindeer;

        Reindeer another;
        xCoord = new int[5];




        Random r = new Random();

        for (int i = 0; i < xCoord.length; i++) {
            int j = r.nextInt(100);
            xCoord[i] = j;

        }



        // An other instance of the object class Reindeer is constructed with the given name strig(Jimmy) and size (10);
        another = new Reindeer("Jimmy", 20);
        // This will just Prints the name of Reindeer x.
        System.out.println("Name of instance Reindeer is " + another.name);
        //This will Print the name and size of Reindeer syedjReindeer;
        System.out.println("Name of my own Reindeer is  " + syedjReindeer.name + "   Size of my own Reindeer is  " + syedjReindeer.size);
        //This will print the line of the size of the Reindeer x;
        System.out.println("Size of my own Reindeer is " + syedjReindeer.size);
        //This will print the name of x and also size of Reindeer instance x;
        System.out.println("Size of the instance reindeer  is " + another.size + "  Name of instance is " + another.name);
        System.out.println("Array for X Parameters " + xCoord);
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number from Array " + xCoord[i]);
        }

    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void showAlert(String aText) {
        startAlert.setString(aText);
        System.out.println(aText);
        dDisplay = Display.getDisplay(this);
        dDisplay.setCurrent(startAlert);
    }

    public void commandAction(Command c, Displayable d) {

        if (c == moveCommand) {
            syedjReindeer.move(this);
        }
        syedjReindeer.status();
        syedjwolf.status();
    }

    public void showAmmo() {
    }

    public void Distence() {
    }

    public void Straved() {
        dDisplay = Display.getDisplay(this);
        dDisplay.setCurrent(looseAlert);
    }

    public void WolfCatch() {
        dDisplay = Display.getDisplay(this);
        dDisplay.setCurrent(looseAlert);
    }

    public void WinGame() {
        dDisplay = Display.getDisplay(this);
        dDisplay.setCurrent(winAlert);
    }

    public void commandAction() {
    }
} // end class

