import javax.swing.*;
public class tog_btn {
    tog_btn() {
        JFrame f = new JFrame();
        JToggleButton tButton1 = new JToggleButton("on");
        tButton1.setBounds(50,50,100,100);
    
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLocation(200,100);

        f.add(tButton1);
        f.setLayout(null);
    }

    
    public static void main(String[] args) {
        new tog_btn();
    }
}
