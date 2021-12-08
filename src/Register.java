import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener {
    JLabel names;
    JLabel collage;
    JLabel email;
    JLabel phone;
    JLabel gender;
    JLabel address;
    JTextField first;
    JTextField last;
    JTextField field1;
    JTextField field2;
    JTextField field3;
    JTextField field4;
    JRadioButton female;
    JRadioButton male;
    JRadioButton others;
    JButton button;

    public Register() {
        setTitle("Password field");
        setBounds(10, 20, 30, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 700);
        setLayout(null);

        names = new JLabel("Name:");
        names.setBounds(30,50,150,30);
        add(names);

        first = new JTextField();
        first.setBounds(100, 50, 100, 30);
        add(first);

        last = new JTextField();
        last.setBounds(250, 50, 100, 30);
        add(last);

        collage = new JLabel("College");
        collage.setBounds(30, 100, 250, 30);
        add(collage);

        field1 = new JTextField();
        field1.setBounds(100, 100, 150, 30);
        add(field1);

        email = new JLabel("Email");
        email.setBounds(30, 150, 250, 30);
        add(email);

        field2 = new JTextField();
        field2.setBounds(100, 150, 150, 30);
        add(field2);

        phone = new JLabel("Phone no.");
        phone.setBounds(30, 200, 150, 30);
        add(phone);

        field3 = new JTextField();
        field3.setBounds(100, 200, 150, 30);
        add(field3);

        gender = new JLabel("Gender");
        gender.setBounds(30, 250, 150, 30);
        add(gender);

        female = new JRadioButton("Female");
        female.setBounds(100, 250, 100, 30);
        add(female);

        male = new JRadioButton("Male");
        male.setBounds(180, 250, 100, 30);
        add(male);

        others = new JRadioButton("others");
        others.setBounds(260, 250, 100, 30);
        add(others);

        address = new JLabel("Address");
        address.setBounds(30, 300, 150, 30);
        add(address);

        field4 = new JTextField();
        field4.setBounds(100, 300, 150, 30);
        add(field4);

        button = new JButton("Register");
        button.setBounds(90, 500, 150, 30);
        add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = (first.getText());

        if(e.getSource().equals(button)){
            JOptionPane.showMessageDialog(null,"Registration completed "+name);
            dispose();
        }

    }

    public static void main(String[] args) {
        new Register();
    }
}