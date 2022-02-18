import java.awt.*;
import java.awt.event.*;

public class AWTFrame extends Frame{
    AWTFrame(String title) {
        super(title);
        setSize(400, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new AWTFrame("My App");
    }
}
