import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField text1;
    JPasswordField text2;
    JLabel label1;
    JLabel label3;
    JLabel label4;
    JButton button;
    JCheckBox button1;

    public Login(){
        setTitle("Password field");
        setBounds(10,20,30,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);

        label1 = new JLabel("Login Page");
        label1.setBounds(30,10,150,30);
        add(label1);

        label3 = new JLabel("Name:");
        label3.setBounds(30,40,150,30);
        add(label3);

        text1 = new JTextField();
        text1.setBounds(30,75,150,30);
        add(text1);

        label4 = new JLabel("Password");
        label4.setBounds(30,110,150,30);
        add(label4);

        text2 = new JPasswordField(20);
        text2.setBounds(30,135,150,30);
        add(text2);

        button = new JButton("Enter");
        button.setBounds(30,200,150,30);
        add(button);
        button.addActionListener(this);

        button1 = new JCheckBox("Show password");
        button1.setBounds(30,160,150,30);
        add(button1);
        button1.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = (text1.getName());
        String password =new String(text2.getPassword());

        if(e.getSource().equals(button1)){
            if (button1.isSelected()){
                text2.setEchoChar((char) 0);
            }
            else{
                text2.setEchoChar('-');
            }

        }

        if(e.getSource().equals(button )){

            String username = text1.getText();
            JOptionPane.showMessageDialog(null,"Logged in as "+username);
            dispose();
//            new Volume().setVisible(true);

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}