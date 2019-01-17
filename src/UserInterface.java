import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    public UserInterface() {
    }

    //Hello
    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(500, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JPanel panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(100,500));

        JPanel panelRight = new JPanel();
        panelRight.setBackground(Color.gray);
        panelRight.setPreferredSize(new Dimension(400,500));


        container.add(panelLeft, BorderLayout.WEST);
        container.add(panelRight, BorderLayout.EAST);
    }

    public JFrame getFrame() {
        return frame;
    }
}
