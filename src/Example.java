import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Enumeration;
import javax.swing.AbstractButton;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Example {

    ButtonGroup group = new ButtonGroup();//used to store all radio buttons.

    public Example() {
        initComponents();
        currentSelectedOption();
    }

    private void initComponents() {
        //Radio buttons
        JRadioButton female = new JRadioButton("Female");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton other = new JRadioButton("Other");

        female.setSelected(true);//by default, select female
        //Add all radio buttons to a group.
        //It will allow to only have one selected at a time.
        group.add(male);
        group.add(female);
        group.add(other);

        //Add your components to a panel, it's a good practice.
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(female);
        panel.add(male);
        panel.add(other);

        JFrame frame = new JFrame("Example");
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Getting the current selected radio button.
     *
     * @return Text of the radio button currently selected.
     */
    public String getSelectedOption() {
        Enumeration<AbstractButton> radioButtons = group.getElements();
        while (radioButtons.hasMoreElements()) {
            AbstractButton currentRadioButton = radioButtons.nextElement();
            if (currentRadioButton.isSelected()) {
                return currentRadioButton.getText();
            }
        }
        return null;
    }

    private void currentSelectedOption() {
        String selected = getSelectedOption();
        if (selected == null) {
            System.out.println("There is something wrong! Nothing is selected");
            return;
        }
        switch (selected.toLowerCase()) {
            case "male":
                System.out.println("male is selected");
                break;
            case "female":
                System.out.println("female is selected");
                break;
            case "other":
                System.out.println("other is selected");
                break;
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new Example();
            }
        });
    }
}