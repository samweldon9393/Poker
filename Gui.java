import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class Gui{

    public static void main(String[] args){

        ImageIcon image = new ImageIcon("CardBack.png");

        /* label */
        JLabel label = new JLabel();
        label.setText("Welcome to Video Poker!");
        label.setIcon(image);

        MyFrame frame = new MyFrame();
        frame.add(label);
        frame.setLayout(new FlowLayout());
    }
}
