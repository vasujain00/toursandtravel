import javax.swing.*;
import java.awt.event.*;
public class MainForm extends JFrame implements ActionListener {
    
JMenuBar mb1;
JMenu m1,m2,m3,m4;
JMenuItem mm11,mm12,mm13;
JMenuItem mm21,mm22
;



public MainForm()
{
    setVisible(true);
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    mb1=new JMenuBar();
    m1= new JMenu("Master");
    m2= new JMenu("transaction");
    m3= new JMenu("report");
    m4= new JMenu("Help");
     mm11= new JMenuItem("Taxi");
     mm12= new JMenuItem("Driver");
     mm13= new JMenuItem("Exit");
     mm21 = new JMenuItem("Booking");
     mm22 = new JMenuItem("Bill");
             
     
      m1.add(mm11);
    m1.add(mm12);
    m1.add(mm13);
    mb1.add(m1);
    mb1.add(m2);
    mb1.add(m3);
    mb1.add(m4);
    setJMenuBar(mb1);
    m2.add(mm21);
    m2.add(mm22);
    
    mm11.addActionListener(this);
    mm12.addActionListener(this);
    mm13.addActionListener(this);
    mm22.addActionListener(this);
    mm21.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{ 
    if(e.getSource()==mm11)
{
        
    javax.swing.JFrame frm = new Taxi();
    frm.setVisible(true);
 }
     if(e.getSource()==mm12)
     {
        javax.swing.JFrame awx= new Driver();
         awx.setVisible(true);
     }
     if(e.getSource()==mm13)
     {
        System.exit(0);
     }
     if(e.getSource()==mm21)
     {
         javax.swing.JFrame xx= new Booking();
         xx.setVisible(true);
     }
     if(e.getSource()==mm22)
     {
         javax.swing.JFrame zz= new Bill();
         zz.setVisible(true);
     }
}
public static void main(String []args)
{
    new MainForm();
}
}
