
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class minisimulator extends JFrame implements ActionListener{
 
    JButton b1, b2;
    JLabel l1,l2,l3,l4;
    minisimulator(String PinNumber){
        
        super("Mini Statement");
       
        getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(20,20);
        
        l1 = new JLabel();
        add(l1);
        
        l2 = new JLabel("MY Bank");
        l2.setBounds(150, 20, 100, 20);
        add(l2);
        
        l3 = new JLabel();
        l3.setBounds(20, 80, 300, 20);
     
        add(l3);
        
        l4 = new JLabel();
        l4.setBounds(20, 400, 300, 20);
        add(l4);
        
        try{
            cunnectivity c = new cunnectivity();
            ResultSet rs = c.s.executeQuery("select * from login where pin_number = '"+PinNumber+"'");
            while(rs.next()){
                l3.setText("Card Number:    " + rs.getString("card_number").substring(0, 4) + "XXXXXXXX" + rs.getString("card_number").substring(12));
            }
        }catch(Exception e){
        System.out.print(e);
        }
        	 try{
            int balance = 0;
            cunnectivity c1  = new cunnectivity();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where PinNumber = '"+PinNumber+"'");
            while(rs.next()){
                l1.setText(l1.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposite")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            l4.setText("Your total Balance is Rs "+balance);
        }catch(Exception e){
           System.out.print(e);
        }
        
        setLayout(null);
        b1 = new JButton("Exit");
        add(b1);
        
        b1.addActionListener(this);
        
        l1.setBounds(20, 140, 400, 200);
        b1.setBounds(20, 500, 100, 25); 
       
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new minisimulator("").setVisible(true);
    }
    
}
