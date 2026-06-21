import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {

    JLabel msg;
    JRadioButton red, yellow, green;

    TrafficLight() {

        msg = new JLabel("");
        msg.setHorizontalAlignment(JLabel.CENTER);

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        ButtonGroup bg = new ButtonGroup();
        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        setLayout(new GridLayout(4,1));

        add(msg);
        add(red);
        add(yellow);
        add(green);

        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(red.isSelected()) {
            msg.setText("STOP");
            msg.setForeground(Color.RED);
        }
        else if(yellow.isSelected()) {
            msg.setText("READY");
            msg.setForeground(Color.ORANGE);
        }
        else {
            msg.setText("GO");
            msg.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
