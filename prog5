import javax.swing.*;
import java.awt.*;
import java.io.*;

public class DisplayTable {

    public static void main(String[] args) throws Exception {

        JFrame f = new JFrame("Table");

        BufferedReader br =
                new BufferedReader(new FileReader("Table.txt"));

        String line;
        JPanel panel = new JPanel(new GridLayout(0,3));

        while((line = br.readLine()) != null) {
            String[] data = line.split(",");

            for(String s : data)
                panel.add(new JLabel(s));
        }

        f.add(panel);
        f.setSize(400,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
