
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Deposite extends JFrame implements ActionListener{
    JButton Continue,Cancel;
    JTextField textField;
    String PinNumber;
    Deposite(String PinNumber){
        this.PinNumber=PinNumber;
        setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image);
    JLabel text=new JLabel("Enter the amount you want to Deposite");
    text.setForeground(Color.WHITE);
    text.setFont(new Font("System",Font.BOLD,16));
    text.setBounds(190,300,300,35);
    image.add(text);
    textField=new JTextField();
    textField.setFont(new Font("Raleway",Font.BOLD,26));
    textField.setBounds(280,350,100,35);
    textField.setBackground(Color.BLACK);
    textField.setForeground(Color.WHITE);
    image.add(textField);
    Continue=new JButton("Deposite");
    Continue.setFont(new Font("System",Font.BOLD,16));
    Continue.setBounds(390,418,105,29);
    Continue.addActionListener(this);
    //Continue.setForeground(Color.WHITE);
    image.add(Continue);
    Cancel=new JButton("Cancel");
    Cancel.setFont(new Font("System",Font.BOLD,16));
    Cancel.setBounds(180,418,105,28);
    Cancel.addActionListener(this);
    image.add(Cancel);
    setSize(900,900);
    setLocation(300,0);
   
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       
        if(ae.getSource()==Continue){
        String number =textField.getText();
        Date date=new Date();
        if(textField.equals("")){
            JOptionPane.showMessageDialog(null,"please enter the amount that you want to Deposite");
        }else{
            try{
            cunnectivity conn=new cunnectivity();
            String query="insert into bank values ('"+PinNumber+"','"+date+"','Deposite','"+number+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Rs:"+number+" deposited successfully");
            }catch(Exception e){
                System.out.print(e);
            }
        }
        }else if(ae.getSource()==Cancel){
           setVisible(false);
           new Transiction(PinNumber).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Deposite("");
    }
}
