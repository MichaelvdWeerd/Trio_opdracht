import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class UserInterface extends JFrame {

    public UserInterface() {

        setTitle("Netflix Statistix");
        setSize(500,250);
        JTabbedPane pane = new JTabbedPane();

        pane.setTabPlacement(SwingConstants.LEFT);

        getContentPane().add(pane);

        GridLayout layoutPane2 = new GridLayout(4,2);

        //Making panels
        JPanel pane1 = new JPanel();
        JPanel pane2 = new JPanel();
        JPanel pane3 = new JPanel();
        JPanel pane4 = new JPanel();
        JPanel pane5 = new JPanel();
        JPanel pane6 = new JPanel();
        JPanel pane7 = new JPanel();
        JPanel pane8 = new JPanel();

        //Adding panels
        pane.addTab("Home", pane1);
        pane.addTab("Account", pane2);
        pane.addTab("Serie per profiel", pane3);
        pane.addTab("Serie per account", pane4);
        pane.addTab("Vijf", pane5);
        pane.addTab("Zes", pane6);
        pane.addTab("Zeven", pane7);
        pane.addTab("Acht", pane8);


        //Making components for tab1
        JLabel Welcome = new JLabel("Welcome to Netflix Statistix");
        Welcome.setFont(new Font("Serif", Font.CENTER_BASELINE, 30));

        //Adding components for tab1
        pane1.add(Welcome);

        //Making components for tab2
        JLabel name = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel address = new JLabel("Address:");
        JTextField addressField = new JTextField();
        JLabel area = new JLabel("Area:");
        JTextField areaField = new JTextField();
        JButton test = new JButton("Press");
        JButton addAccount = new JButton("Add account");

        //Adding components for tab2
        pane2.setLayout(layoutPane2);
        pane2.add(name);
        pane2.add(nameField);
        pane2.add(address);
        pane2.add(addressField);
        pane2.add(area);
        pane2.add(areaField);
        pane2.add(addAccount);
        //pane2.add(test);


        ButtonHandler phandler = new ButtonHandler();
        test.addActionListener(phandler);
        setVisible(true);
    }

}


class ButtonHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "I've been pressed", "What happened?", JOptionPane. INFORMATION_MESSAGE);
    }
}
