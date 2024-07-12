import java.awt.*;
import java.applet.*;

public class APPLet extends Applet {
    public void init() {
        setBackground(Color.black);
        setForeground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome", 100, 100);
    }
}