import javax.swing.*;

public class jbut_img extends JFrame {

    jbut_img() {
        JFrame f = new JFrame();
        JButton b = new JButton(new ImageIcon("../img/now.jpg"));

        f.add(b);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);

    }

    public static void main(String[] args) {
        new jbut_img();
    }

}
