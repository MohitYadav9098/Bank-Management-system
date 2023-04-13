
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;

public class Fast_Cash  extends JFrame implements ActionListener{
    JButton deposite,withdrow,Create_New_Pin,minStatement,Balance_Enquiry,Changepin,Transfer_Funds,exit;
    String PinNumber;
    Fast_Cash(String PinNumber){
        this.PinNumber=PinNumber;
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(0,0,900,900);
      add(image);
      JLabel text=new JLabel("Select Withdrowal Amount");
      text.setBounds(210,250,700,35);
      text.setFont(new Font("System",Font.BOLD,16));
      text.setForeground(Color.WHITE);
      image.add(text);
      deposite=new JButton("Rs:100");
      deposite.setFont(new Font("System",Font.BOLD,16));
      deposite.setBounds(150,341,150,30);
      deposite.addActionListener(this);
       image.add(deposite); 
        withdrow=new JButton("Rs:200");
      withdrow.setFont(new Font("System",Font.BOLD,16));
      withdrow.setBounds(355,341,150,30);
      withdrow.addActionListener(this);
       image.add(withdrow);
         Create_New_Pin=new JButton("Rs:500");
      Create_New_Pin.setFont(new Font("System",Font.BOLD,16));
      Create_New_Pin.setBounds(150,374,150,30);
      Create_New_Pin.addActionListener(this);
       image.add(Create_New_Pin); 
        minStatement=new JButton("Rs:1000");
      minStatement.setFont(new Font("System",Font.BOLD,16));
      minStatement.setBounds(355,374,150,30);
      minStatement.addActionListener(this);
       image.add(minStatement);
        Balance_Enquiry=new JButton("Rs:2000");
      Balance_Enquiry.setFont(new Font("System",Font.BOLD,16));
      Balance_Enquiry.setBounds(150,408,150,30);
      Balance_Enquiry.addActionListener(this);
       image.add(Balance_Enquiry); 
       Changepin=new JButton("Rs:5000");
      Changepin.setFont(new Font("System",Font.BOLD,16));
      Changepin.setBounds(355,408,150,30);
      Changepin.addActionListener(this);
       image.add(Changepin);
      Transfer_Funds=new JButton("Rs:10,000");
      Transfer_Funds.setFont(new Font("System",Font.BOLD,16));
      Transfer_Funds.setBounds(150,441,150,30);
      Transfer_Funds.addActionListener(this);
       image.add(Transfer_Funds); 
       exit=new JButton("Back");
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
          setVisible(false);
          new Transiction(PinNumber).setVisible(true);
      } else{
          String amount=((JButton)ae.getSource()).getText().substring(3);
          cunnectivity conn=new cunnectivity();
          try{
           ResultSet rs=conn.s.executeQuery("select*from bank where PinNumber='"+PinNumber+"'");
           int Balance=0;
           while(rs.next()){
               if(rs.getString("type").equals("Deposite")){
               Balance+=Integer.parseInt(rs.getString("amount"));
               }
               else{
                  Balance-=Integer.parseInt(rs.getString("amount"));  
               }
           }
           if(ae.getSource()!=exit&& Balance<=Integer.parseInt(amount)){
               JOptionPane.showMessageDialog(null,"Insufficiant Balance");
               return;
           }
           Date date=new Date();
           String query="insert into bank values ('"+PinNumber+"','"+date+"','withdrow','"+amount+"')";
           conn.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"Rs:"+amount+" Debited successfully");
           setVisible(false);
           new Transiction(PinNumber).setVisible(true);
          }catch(Exception e){
          System.out.print(e);
      }
      }
      
    }
    public static void main(String[] args){
        new Fast_Cash("");
    }
}

    

