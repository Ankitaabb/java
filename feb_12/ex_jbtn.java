import javax.swing.*;
import java.awt.event.*;
public class ex_jbtn extends JFrame implements ActionListener {
    JButton btn;
    
    
    
    ex_jbtn () {
        
        this.setSize(400, 400);
        this.setVisible(true);
        this.setLocation(100,100); 
        
        btn = new JButton("ok");
        btn.setBounds(100,100,150,40);
        
        
        btn.addActionListener(this);
        this.add(btn);
        this.setLayout(null);
    }
    

public void actionPerformed(ActionEvent e){
    JDialog d = new JDialog();
    
    d.setSize(200, 200);
    d.setVisible(true);
    d.setLocation(100,100);
}
    public static void main(String[] args) {
        new ex_jbtn();
    } 
}

