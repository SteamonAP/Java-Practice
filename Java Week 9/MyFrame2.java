import java.awt.event.*;
import javax.swing.*;

public class MyFrame2 extends JFrame implements ActionListener {
    private JButton myButton;

    public MyFrame2() {
        super("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        myButton = new JButton("Click me");
        myButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(myButton);
        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            JOptionPane.showMessageDialog(this, "Button clicked!");
        }
    }

    public static void main(String[] args) {
        new MyFrame2();
    }
}