// This code is a proposal for my girl to be my girlfriend, i need a menu with 4  options
// in three of them once clicked it will bring text to read, the other one pops up
// another two customizable buttons
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Proposal implements ActionListener {
    private JFrame frame;

    public Proposal() {
        JFrame frame= new JFrame(" For Lizzie");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setVisible(true);
        panel.setLayout(new GridLayout(4,1,10,10));
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.setBackground(Color.red);
        panel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {







    }
}
