
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton button,button2,button3;
    JTextField card;
    JPasswordField pintext;
   
    Login(){
    ImageIcon i0=new ImageIcon(ClassLoader.getSystemResource("icons/Background.jpg"));
    Image i=i0.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i4=new ImageIcon(i);
    JLabel label=new JLabel(i4);
    label.setBounds(0,0,900,900);
    add(label);
    JLabel text=new JLabel("WELCOME TO ATM");
    text.setFont(new Font("Osward",Font.BOLD,38));
    text.setBounds(220, 45, 400, 40);
    text.setForeground(Color.WHITE);
    label.add(text);
    setLayout(null);
    setTitle("AOUTOMATED TELLOR MACHINE");
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
    Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel lable=new JLabel(i3);
    
    JLabel cardt=new JLabel("CARD NUMBER:");
    cardt.setFont(new Font("Osward",Font.BOLD,18));
    cardt.setForeground(Color.WHITE);
    cardt.setBounds(80, 150, 150, 40);
    label.add(cardt);
    card=new JTextField();
    card.setBounds(250,155,300,30);
    card.setFont(new Font("Arial",Font.BOLD,14));
    label.add(card);
    JLabel pin=new JLabel("PIN NUMBER:");
    pin.setFont(new Font("Osward",Font.BOLD,18));
    pin.setForeground(Color.WHITE);
    pin.setBounds(80,200, 150, 40);
    label.add(pin);
    pintext=new JPasswordField();
    pintext.setBounds(250,205,300,30);
    label.add(pintext);
    lable.setBounds(70,10,100,100);
    button=new JButton("Sign In");
    button.setBounds(250,280,100,30);
    button.addActionListener(this);
    label.add(button);
    button2=new JButton("Clear");
    button2.setBounds(450,280,100,30);
    button2.addActionListener(this);
    label.add(button2);
    button3=new JButton("Sign Up");
    button3.setBounds(250,330,300,30);
    button3.addActionListener(this);
    label.add(button3);
    getContentPane().setBackground(Color.WHITE);
    label.add(lable);
    setSize(800,500);
    setLocation(350,0);
    setUndecorated(true);
    setVisible(true);
}
 public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==button2){
         card.setText("");
         pintext.setText("");
         }
     else if(ae.getSource()==button){
       cunnectivity c=new cunnectivity();
       String CardNo=card.getText();  
       String PinNo=pintext.getText();
       String query="select*from login where card_number='"+CardNo+"' and pin_number='"+PinNo+"'";
       try{
            ResultSet rn=c.s.executeQuery(query);
            if(rn.next()){
                setVisible(false);
                new Transiction(PinNo).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect CardNo or Pin");
            }
       }catch(Exception e){
           System.out.print(e);
       }
     }
     else if(ae.getSource()==button3){
        setVisible(false);
        new SignUp().setVisible(true);
     }
 }  
    public static void main(String[] args) {
        new Login();
    }
    
}