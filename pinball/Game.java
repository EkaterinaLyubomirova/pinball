package pinball;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Game {
    public static void main(String []args){
        JFrame frame = new JFrame();


        frame.setSize(1920,1080);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Pane100 panel = new Pane100();


        frame.add(panel);

        frame.setVisible(true);

    }


}
