
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    JPasswordField text,retext;
    JButton change,Back;
    String PinNumber;
    PinChange(String PinNumber){
       
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(0,0,900,900);
      add(image);
      JLabel label=new JLabel("Change Your PIN");
      label.setBounds(250,250,700,35);
      label.setFont(new Font("System",Font.BOLD,18));
      label.setForeground(Color.WHITE);
      image.add(label);
      JLabel pin=new JLabel("Enter PIN");
      pin.setBounds(200,300,700,35);
      pin.setFont(new Font("System",Font.BOLD,18));
      pin.setBackground(Color.BLACK);
      pin.setForeground(Color.WHITE);
      image.add(pin);
      JLabel repin=new JLabel("Renter PIN");
      repin.setBounds(200,360,700,35);
      repin.setFont(new Font("System",Font.BOLD,18));
      repin.setForeground(Color.WHITE);
      image.add(repin);
      text=new JPasswordField();
      text.setBounds(320,305,100,25);
      text.setFont(new Font("System",Font.BOLD,16));
      text.setBackground(Color.BLACK);
      text.setForeground(Color.WHITE);
      image.add(text);
       retext=new JPasswordField();
      retext.setBounds(320,365,100,25);
      retext.setFont(new Font("System",Font.BOLD,16));
      retext.setBackground(Color.BLACK);
      retext.setForeground(Color.WHITE);
      image.add(retext);
      change=new JButton("Change");
      change.setFont(new Font("System",Font.BOLD,16));
      change.setBounds(390,440,95,25);
      change.addActionListener(this);
      image.add(change);
      Back=new JButton("Back");
      Back.setFont(new Font("System",Font.BOLD,16));
      Back.setBounds(180,440,95,25);
      Back.addActionListener(this);
      image.add(Back);
      setSize(900,900);
      setLocation(300,0);
      setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==change){
            try{
                String ePin=text.getText();
                String rePin=retext.getText();
                if(!ePin.equals(rePin)){
                    JOptionPane.showMessageDialog(null,"Entered Pin Doesn't Match");
                }else if(ePin.equals("")){
                    JOptionPane.showMessageDialog(null,"please enter New Pin");
                    return;
                }
                else if(rePin.equals("")){
                    JOptionPane.showMessageDialog(null,"please Renter New Pin");
                    return; 
                }
                cunnectivity conn=new cunnectivity();
                String query="Update bank set PinNumber='"+ePin+"' where PinNumber='"+PinNumber+"'";
                String query2="Update login set pin_number='"+ePin+"' where pin_number='"+PinNumber+"'";
                String query3="Update signupthree set pin_number='"+ePin+"' where pin_number='"+PinNumber+"'";
                conn.s.executeUpdate(query);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"Pin Changed Successfully");
                setVisible(false);
                new Transiction(ePin).setVisible(true);
            }catch(Exception e){
                System.out.print(e);
            }
            }
            else{
                setVisible(false);
                new Transiction(PinNumber).setVisible(true);
            }
        
    }
    public static void main(String[] args){
        new PinChange("");
        
    }
    
}
