import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private static final int MAX_WIDTH = 1000;
    private static final int MAX_HEIGHT = 700;

     Frame(){

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(new Dimension(MAX_WIDTH,MAX_HEIGHT));
        this.setTitle("YOU HAVE BEEN HACKED");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0,0,0));

    }

}
