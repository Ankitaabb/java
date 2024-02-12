import javax.swing.*;

public class jbutton extends JFrame {
    JButton btn;

    jbutton() {
        this.setSize(400, 400);
        this.setVisible(true);
        this.setLocation(200, 100);

        btn = new JButton("ok");
        btn.setBounds(100, 50, 150, 40);
        this.add(btn);
        this.setLayout(null);

    }

    public static void main(String[] args) {
        new jbutton();
    }

}
