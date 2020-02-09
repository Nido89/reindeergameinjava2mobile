/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SyedjReindeer;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.*;

/**
 * @author syedj
 */
public class HelloworldMidlet extends MIDlet {
// The display for this MIDlet
private Display display;
// TextBox to display text
TextBox box = null;
    public void startApp() {
        display = Display.getDisplay(this);
box = new TextBox("Example Title", "Hello World", 20, 0);
display.setCurrent(box);
}
// inherited pauseApp method
public void pauseApp( ) {
}
// inherited destroyApp method
public void destroyApp(boolean unconditional){
    }
    
    
    }

