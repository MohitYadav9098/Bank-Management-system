
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class withdrow  extends JFrame implements ActionListener{
    JButton Continue,Cancel;
    JTextField textField;
    String PinNumber;
    withdrow(String PinNumber){
        this.PinNumber=PinNumber;
        setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image);
    JLabel text=new JLabel("Enter the amount you want to Withdrow");
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
    Continue=new JButton("Withdrow");
    Continue.setFont(new Font("System",Font.BOLD,16));
    Continue.setBounds(385,418,110,29);
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
            JOptionPane.showMessageDialog(null,"please enter the amount that you want to withdrow");
        }else{
            try{
            cunnectivity conn=new cunnectivity();
            String query="insert into withdrow values ('"+PinNumber+"','"+date+"','-Withdrowal','"+number+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Rs:"+number+" withdrowal successfully");
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
        new withdrow("");
    }
}
