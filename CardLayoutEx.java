
import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class CardLayoutEx extends JFrame implements ActionListener  
{    
  
CardLayout crd;    
JButton btn1, btn2, btn3;    
Container cPane;   
  
CardLayoutEx()  
{    
  
cPane = getContentPane();    
 
crd = new CardLayout();    
  
cPane.setLayout(crd);    
  
// creating the buttons  
btn1 = new JButton("Apple");    
btn2 = new JButton("Boy");    
btn3 = new JButton("Cat");    
  
// adding listeners to it  
btn1.addActionListener(this);    
btn2.addActionListener(this);    
btn3.addActionListener(this);    
  
cPane.add("a", btn1); // first card is the button btn1  
cPane.add("b", btn2); // first card is the button btn2  
cPane.add("c", btn3);  // first card is the button btn3  
            
}    
public void actionPerformed(ActionEvent e)   
{    
crd.next(cPane);    
}    
  

public static void main(String argvs[])   
{     
CardLayoutEx crdl = new CardLayoutEx();   
  
crdl.setSize(300, 300);    
crdl.setVisible(true);    
crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}    
}    