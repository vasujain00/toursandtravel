import javax.swing.*;
import java.awt.event.*;
public class TaxiMaster extends JFrame implements ActionListener {
    
    JPanel p1;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1;
    
    public TaxiMaster()
    {
        p1= new JPanel();
        l1=new JLabel("Vechile type");
        l2=new JLabel("capacity");
        
        l3=new JLabel("rates/km");
        l4= new JLabel("AC");
        t1=new JTextField();
        t2=new JTextField();
        b1= new JButton("SUBMIT");
        t3=new JTextField();
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(b1);
        
        
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().add(p1);
        
        b1.addActionListener(this);
        
                
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    public static void main(String []args)
    {
        new TaxiMaster();
    }
}
