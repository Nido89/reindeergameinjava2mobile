/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SyedjReindeer;

import javax.microedition.midlet.*;

/**
 * @author syedj
 */
public class BeersongMidlet extends MIDlet {

    private int beercount = 10;
    String word;

    /*  public BeersongMidlet() {
    this.beercount = 99;
    }*/
    public void startApp() {
        word = "bottles";
        while (beercount > 0) {


            System.out.println(beercount + " " + word + " of beer on the wall\n");
            System.out.println(beercount + " " + word + " cuurently of beer\n");
            System.out.println("Take one down and pass it around,\n");
            beercount = beercount - 1;
            if (beercount == 1) {
                word = "bottle";
            }
            if (beercount > 0) {
                System.out.println(beercount + " " + word + " of beer  left now on the wall\n");
            } else {
                System.out.println("No more bottles of beer left on the wall");
            }
        }
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
