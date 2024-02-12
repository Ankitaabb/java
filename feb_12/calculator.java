import javax.swing.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener{
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
    JTextField tfno,tsno;
    JLabel lbl;
    
    
    public void actionPerformed(ActionEvent e){
        int i = Integer.parseInt(tfno.getText());
        int j = Integer.parseInt(tsno.getText());

    }





    calculator(){
        this.setSize(400,400);
        this.setVisible(true);
        this.setLayout(null);

        tfno = new JTextField();
        tfno.setBounds(100,50,150,40);
        this.add(tfno);

        tsno = new JTextField();
        tfno.setBounds(100,50,150,40);
        this.add(tsno);

        btn1 = new JButton("1");
        btn1.setBounds(100,150,50,50);
        this.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("2");
        btn2.setBounds(170,150,50,50);
        this.add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("3");
        btn3.setBounds(240,150,50,50);
        this.add(btn3);
        btn3.addActionListener(this);

        btn4 = new JButton("/");
        btn4.setBounds(310,150,50,50);
        this.add(btn4);
        btn4.addActionListener(this);



        
        btn5 = new JButton("4");
        btn5.setBounds(100,220,50,50);
        this.add(btn5);
        btn5.addActionListener(this);

        btn6 = new JButton("5");
        btn6.setBounds(170,220,50,50);
        this.add(btn6);
        btn6.addActionListener(this);

        btn7 = new JButton("6");
        btn7.setBounds(240,220,50,50);
        this.add(btn7);
        btn7.addActionListener(this);

        btn8 = new JButton("x");
        btn8.setBounds(310,220,50,50);
        this.add(btn8);
        btn8.addActionListener(this);



        btn9 = new JButton("7");
        btn9.setBounds(100,290,50,50);
        this.add(btn9);
        btn9.addActionListener(this);

        btn10 = new JButton("8");
        btn10.setBounds(170,290,50,50);
        this.add(btn10);
        btn10.addActionListener(this);

        btn11 = new JButton("9");
        btn11.setBounds(240,290,50,50);
        this.add(btn11);
        btn11.addActionListener(this);

        btn12 = new JButton("-");
        btn12.setBounds(310,290,50,50);
        this.add(btn12);
        btn12.addActionListener(this);



        btn13 = new JButton("+/-");
        btn13.setBounds(100,360,50,50);
        this.add(btn13);
        btn13.addActionListener(this);

        btn14 = new JButton("0");
        btn14.setBounds(170,360,50,50);
        this.add(btn14);
        btn14.addActionListener(this);
        btn15 = new JButton(".");
        btn15.setBounds(240,360,50,50);
        this.add(btn15);
        btn15.addActionListener(this);

        btn16 = new JButton("=");
        btn16.setBounds(310,360,50,50);
        this.add(btn16);
        btn16.addActionListener(this);


        lbl = new JLabel();
        this.add(lbl);
        this.setLayout(null);
        lbl.setBounds(100, 350, 150, 40);
    }




    public static void main(String[] args) {
        new calculator();
    }
    
}