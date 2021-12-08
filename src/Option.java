import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Option extends JFrame implements ActionListener{
    JLabel label;
    JButton button1;
    JButton button2;

    public Option(){
        setTitle("Option");
        setBounds(10,20,30,50);
        setSize(250,250);
        setLayout(null);

        button1 = new JButton("Login");
        button1.setBounds(30,60,150,30);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("Register");
        button2.setBounds(30,100,150,30);
        add(button2);
        button2.addActionListener(this);

        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button1)){
            new Login().setVisible(true);

        }
        else if(e.getSource().equals(button2)){
            new Register().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Option();
    }
}