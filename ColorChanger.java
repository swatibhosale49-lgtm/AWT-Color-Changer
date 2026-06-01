import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends Frame implements ActionListener {

    Button btn;

    ColorChanger() {
        btn = new Button("Change Color");
        add(btn);

        btn.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setBackground(new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)));
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}