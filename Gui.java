import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Gui{

    public static void main(String[] args){

        JFrame frame = new JFrame();

        /* frame settings */
        frame.setTitle("Video Poker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1000);
        frame.setVisible(true);

        /* add little icon to frame */
        //TODO doenst work :(
        ImageIcon image = new ImageIcon("CardBack.png");
        frame.setIconImage(image.getImage());

        /* set background color */
        frame.getContentPane().setBackground(new Color(0x4a0204));
    }
}
