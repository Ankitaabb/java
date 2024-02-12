import javax.swing.*;
import java.awt.event.*;

public class ex_jbtn extends JFrame implements ActionListener {
    JTextField tfno, tsno;
    JLabel lbl;
    JButton btn1,btn2,btn3,btn4;

    // @Override
    public void actionPerformed(ActionEvent e) {  //1
        int i = Integer.parseInt(tfno.getText());
        int j = Integer.parseInt(tsno.getText());
        double r =0;
        if(e.getSource() == btn1)
        {
            r=i+j;
        }
        if(e.getSource() == btn2)
        {
            r=i-j;
        }
        if(e.getSource() == btn3)
        {
            r=i*j;
        }
        if(e.getSource() == btn4)
        {
            r=i/j;
        }
        lbl.setText(String.valueOf(r));
        
    }

    ex_jbtn() {
        this.setSize(400, 400);
        this.setVisible(true);
        this.setLocation(200, 100);

        tfno = new JTextField();
        tfno.setBounds(100,50,150,40);
        this.add(tfno);

        tsno = new JTextField();
        tsno.setBounds(100,100,150,40);


        btn1 = new JButton("ADD");
        btn1.setBounds(100, 150, 150, 40);
        this.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("sub");
        btn2.setBounds(100, 200, 150, 40);
        this.add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("mul");
        btn3.setBounds(100, 250, 150, 40);
        this.add(btn3);
        btn3.addActionListener(this);

        btn4 = new JButton("div");
        btn4.setBounds(100, 300, 150, 40);
        this.add(btn4);
        btn4.addActionListener(this);

        lbl=new JLabel();
        lbl.setBounds(100, 350, 150, 40);
        this.add(lbl);

        this.setLayout(null);

    }

    public static void main(String[] args) {
        new ex_jbtn();
    }
}