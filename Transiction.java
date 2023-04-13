
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transiction extends JFrame implements ActionListener{
    JButton deposite,withdrow,Fast_Cash,minStatement,Balance_Enquiry,Changepin,Transfer_Funds,exit;
    String PinNumber;
    Transiction(String PinNumber){
        this.PinNumber=PinNumber;
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(0,0,900,900);
      add(image);
      JLabel text=new JLabel("Please Select Your Transection");
      text.setBounds(210,250,700,35);
      text.setFont(new Font("System",Font.BOLD,16));
      text.setForeground(Color.WHITE);
      image.add(text);
      deposite=new JButton("Deposite");
      deposite.setFont(new Font("System",Font.BOLD,16));
      deposite.setBounds(150,341,150,30);
      deposite.addActionListener(this);
       image.add(deposite); 
        withdrow=new JButton("Withdrow");
      withdrow.setFont(new Font("System",Font.BOLD,16));
      withdrow.setBounds(355,341,150,30);
      withdrow.addActionListener(this);
       image.add(withdrow);
       Fast_Cash=new JButton("Fast Cash");
      Fast_Cash.setFont(new Font("System",Font.BOLD,16));
      Fast_Cash.setBounds(150,374,150,30);
      Fast_Cash.addActionListener(this);
       image.add(Fast_Cash); 
        minStatement=new JButton("Mini Statement");
      minStatement.setFont(new Font("System",Font.BOLD,16));
      minStatement.setBounds(355,374,150,30);
      minStatement.addActionListener(this);
       image.add(minStatement);
        Balance_Enquiry=new JButton("Balance Enquiry");
      Balance_Enquiry.setFont(new Font("System",Font.BOLD,16));
      Balance_Enquiry.setBounds(150,408,150,30);
      Balance_Enquiry.addActionListener(this);
       image.add(Balance_Enquiry); 
       Changepin=new JButton("Change PIN");
      Changepin.setFont(new Font("System",Font.BOLD,16));
      Changepin.setBounds(355,408,150,30);
      Changepin.addActionListener(this);
       image.add(Changepin);
      Transfer_Funds=new JButton("Transfer Funds");
      Transfer_Funds.setFont(new Font("System",Font.BOLD,16));
      Transfer_Funds.setBounds(150,441,150,30);
      Transfer_Funds.addActionListener(this);
       image.add(Transfer_Funds); 
       exit=new JButton("Exit");
      exit.setFont(new Font("System",Font.BOLD,16));
      exit.setBounds(355,441,150,30);
      exit.addActionListener(this);
       image.add(exit);
       setSize(900,900);
      setLocation(300,0);
      setVisible(true);
      
    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==exit){
          System.exit(0);
      } else if(ae.getSource()==minStatement){
          
          new minisimulator(PinNumber).setVisible(true);
      } 
      else if(ae.getSource()==Changepin){
          setVisible(false);
          new PinChange(PinNumber).setVisible(true);
      }
      else if(ae.getSource()==Balance_Enquiry){
        setVisible(false);
          new BalanceEnquiry(PinNumber).setVisible(true);  
      }
      else if(ae.getSource()==Fast_Cash){
          setVisible(false);
          new Fast_Cash(PinNumber).setVisible(true);
      }
      else if(ae.getSource()==withdrow){
         setVisible(false);
          new withdrow(PinNumber).setVisible(true); 
      }
      else if(ae.getSource()==deposite){
          setVisible(false);
          new Deposite(PinNumber).setVisible(true);
      }
      
    }
    public static void main(String[] args){
        new Transiction("");
    }
}
