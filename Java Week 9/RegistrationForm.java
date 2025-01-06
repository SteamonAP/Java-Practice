import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JLabel nameLabel, emailLabel, genderLabel, courseLabel;
    private JTextField nameField, emailField;
    private JRadioButton maleRadio, femaleRadio;
    private JCheckBox javaCheck, pythonCheck, csharpCheck;
    private JButton submitButton;

    public RegistrationForm() {
        super("Student Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        genderLabel = new JLabel("Gender:");
        courseLabel = new JLabel("Course:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);

        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        javaCheck = new JCheckBox("Java");
        pythonCheck = new JCheckBox("Python");
        csharpCheck = new JCheckBox("C#");

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(genderLabel);
        panel.add(maleRadio);
        panel.add(new JLabel(""));
        panel.add(femaleRadio);
        panel.add(courseLabel);
        panel.add(javaCheck);
        panel.add(new JLabel(""));
        panel.add(pythonCheck);
        panel.add(new JLabel(""));
        panel.add(csharpCheck);
        panel.add(new JLabel(""));
        panel.add(submitButton);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String courses = "";
        if (javaCheck.isSelected()) {
            courses += "Java ";
        }
        if (pythonCheck.isSelected()) {
            courses += "Python ";
        }
        if (csharpCheck.isSelected()) {
            courses += "C#";
        }
        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\nEmail: " + email + "\nGender: " + gender + "\nCourses: " + courses);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}