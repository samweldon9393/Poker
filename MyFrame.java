import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{

    public MyFrame(){
        /* frame settings */
        this.setTitle("Video Poker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500, 1000);
        this.setVisible(true);

        /* add little icon to frame */
        //TODO doenst work :(
        ImageIcon image = new ImageIcon("CardBack.png");
        this.setIconImage(image.getImage());

        /* set background color */
        this.getContentPane().setBackground(new Color(0x4a0204));
    }
}
