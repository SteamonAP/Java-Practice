import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class EmploymentRegistrationForm extends JFrame implements ActionListener {
    private JLabel nameLabel, emailLabel, genderLabel, educationLabel, experienceLabel;
    private JTextField nameField, emailField, educationField, experienceField;
    private JRadioButton maleRadio, femaleRadio;
    private JCheckBox javaCheck, pythonCheck, csharpCheck;
    private JButton submitButton;

    public EmploymentRegistrationForm() {
        super("Employment Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        genderLabel = new JLabel("Gender:");
        educationLabel = new JLabel("Education:");
        experienceLabel = new JLabel("Experience:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        educationField = new JTextField(20);
        experienceField = new JTextField(20);

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

        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(genderLabel);
        panel.add(maleRadio);
        panel.add(new JLabel(""));
        panel.add(femaleRadio);
        panel.add(educationLabel);
        panel.add(educationField);
        panel.add(experienceLabel);
        panel.add(experienceField);
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
        String education = educationField.getText();
        String experience = experienceField.getText();
        String skills = "";
        if (javaCheck.isSelected()) {
            skills += "Java ";
        }
        if (pythonCheck.isSelected()) {
            skills += "Python ";
        }
        if (csharpCheck.isSelected()) {
            skills += "C#";
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employment", "root", "");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO employees (name, email, gender, education, experience, skills) VALUES ('" + name
                    + "', '" + email + "', '" + gender + "', '" + education + "', '" + experience + "', '" + skills
                    + "')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Registration successful!");
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new EmploymentRegistrationForm();
    }
}