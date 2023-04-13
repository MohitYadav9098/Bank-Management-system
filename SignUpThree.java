
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignUpThree extends JFrame implements ActionListener{
   JRadioButton a1,a2,a3,a4;
   JCheckBox c1,c2,c3,c4,c5,c6,c7;
   String formno;
   Button Submit,cancel;
  SignUpThree(String formno){
      this.formno=formno;
      setLayout(null);
      JLabel label=new JLabel("Page 3. Acount Details");
      label.setFont(new Font("Raleway",Font.BOLD,28));
      label.setBounds(270,50,600,50);
      label.setBackground(Color.WHITE);
      add(label);
      setSize(850,820);
      setUndecorated(true);
      setLocation(400,10);
      setVisible(true);
      JLabel Type=new JLabel("Acount Type");
      Type.setFont(new Font("Raleway",Font.BOLD,22));
      Type.setBounds(110,117,200,35);
      add(Type);
      a1=new JRadioButton("Saving Account");
      a1.setFont(new Font("Arial",Font.BOLD,15));
      a1.setBounds(110,167,145,35);
      add(a1);
      a2=new JRadioButton("Fixed Diposite Account");
      a2.setFont(new Font("Arial",Font.BOLD,15));
      a2.setBounds(330,167,195,35);
      add(a2);
      a3=new JRadioButton("Current Account");
      a3.setFont(new Font("Arial",Font.BOLD,15));
      a3.setBounds(110,220,148,35);
      add(a3);
      a4=new JRadioButton("Recurring Deposite Account");
      a4.setFont(new Font("Arial",Font.BOLD,15));
      a4.setBounds(330,220,225,35);
      add(a4);
      ButtonGroup button=new ButtonGroup();
      button.add(a1);
      button.add(a2);
      button.add(a3);
      button.add(a4);
      JLabel CardNumber=new JLabel("Card Number");
      CardNumber.setFont(new Font("Raleway",Font.BOLD,22));
      CardNumber.setBounds(110,275,200,35);
      add(CardNumber);
      JLabel CardDetails=new JLabel("XXXX-XXXX-XXXX-4647");
      CardDetails.setFont(new Font("Arial",Font.BOLD,22));
      CardDetails.setBounds(340,275,500,35);
      add(CardDetails);
      JLabel CardDetail=new JLabel("Your 16 Digit Card Number");
      CardDetail.setFont(new Font("Arial",Font.BOLD,15));
      CardDetail.setBounds(110,301,500,35);
      add(CardDetail);
      JLabel PINNumber=new JLabel("Pin Number");
      PINNumber.setFont(new Font("Raleway",Font.BOLD,22));
      PINNumber.setBounds(110,330,200,35);
      add(PINNumber);
      JLabel PINNumberD=new JLabel("4 Digit Pin Number");
      PINNumberD.setFont(new Font("Arial",Font.BOLD,15));
      PINNumberD.setBounds(110,355,200,35);
      add(PINNumberD);
      JLabel PINDetails=new JLabel("XXX");
      PINDetails.setFont(new Font("Arial",Font.BOLD,22));
      PINDetails.setBounds(340,331,200,35);
      add(PINDetails);
      JLabel ServisesRequired=new JLabel("Sarvices Required:");
      ServisesRequired.setFont(new Font("Raleway",Font.BOLD,22));
      ServisesRequired.setBounds(110,400,200,35);
      add(ServisesRequired);
      c1=new JCheckBox("ATM CARD");
      c1.setBackground(Color.WHITE);
      c1.setFont(new Font("Arial",Font.BOLD,15));
      c1.setBounds(110,435,200,35);
      add(c1);
      c2=new JCheckBox("Mobile Banking");
      c2.setBackground(Color.WHITE);
      c2.setFont(new Font("Arial",Font.BOLD,15));
      c2.setBounds(310,435,200,35);
      add(c2);
      c3=new JCheckBox("E-MAIL & SMS Alerts");
      c3.setBackground(Color.WHITE);
      c3.setFont(new Font("Arial",Font.BOLD,15));
      c3.setBounds(510,435,200,35);
      add(c3);
      c4=new JCheckBox("Chaque Book");
      c4.setBackground(Color.WHITE);
      c4.setFont(new Font("Arial",Font.BOLD,15));
      c4.setBounds(110,470,200,35);
      add(c4);
      c5=new JCheckBox("E-Statement");
      c5.setBackground(Color.WHITE);
      c5.setFont(new Font("Arial",Font.BOLD,15));
      c5.setBounds(310,470,200,35);
      add(c5);
      c6=new JCheckBox("Mutual Funds");
      c6.setBackground(Color.WHITE);
      c6.setFont(new Font("Arial",Font.BOLD,15));
      c6.setBounds(510,470,200,35);
      add(c6);
      c7=new JCheckBox(" I hereby decleared that the above details are correct to the best of my knowledge");
      //c7.setBackground(Color.WHITE);
      c7.setFont(new Font("Arial",Font.BOLD,15));
      c7.setBounds(110,535,610,35);
      add(c7);
      cancel=new Button("Cancel");
        cancel.setFont(new Font("Arial",Font.BOLD,15));
        cancel.setBounds(190,575,60,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        Submit=new Button("Submit");
        Submit.setFont(new Font("Arial",Font.BOLD,15));
        Submit.setBounds(575,575,60,25);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);
  }
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==Submit){
          String AccountType="null";
          if(a1.isSelected()){
              AccountType="Saving Account";
          }
          else if(a2.isSelected()){
              AccountType="Fixed Diposite Account";
          }
          else if(a3.isSelected()){
              AccountType="Current Account";
          }
          else if(a4.isSelected()){
              AccountType="Recurring Deposite Account";
          }
          Random random=new Random();
          String CardNumber=""+Math.abs(random.nextLong()%900000L)+5040900000L;
          String Pin=""+Math.abs((random.nextLong()%9000L)+1000L);
          String facility="";
          if(c1.isSelected()){
             facility=facility+"ATM CARD";
          }else if(c2.isSelected()){
             facility=facility+"Mobile Banking"; 
          }else if(c3.isSelected()){
             facility=facility+"E-MAIL & SMS Alerts"; 
          }
          else if(c4.isSelected()){
             facility=facility+"Chaque Book"; 
          }
          else if(c5.isSelected()){
             facility=facility+"E-Statement"; 
          }
          else if(c6.isSelected()){
             facility=facility+"Mutual Funds"; 
          }
          try{
            if(AccountType.equals("")){
                JOptionPane.showMessageDialog(null,"Please Select Account Type");
            }else if(!c7.isSelected()){
                JOptionPane.showMessageDialog(null,"Pleaze Accept the decleration check box");
            } 
            else{
            cunnectivity con=new cunnectivity();
            String query="insert into signupthree value('"+formno+"','"+AccountType+"','"+CardNumber+"','"+Pin+"','"+facility+"')";
            String query1="insert into login value('"+formno+"','"+CardNumber+"','"+Pin+"')";
            con.s.executeUpdate(query);
            con.s.executeUpdate(query1);
            JOptionPane.showMessageDialog(null,"Card NUmber:"+CardNumber+"\nPin:"+Pin);
            setVisible(false);
            new Deposite(Pin).setVisible(true);
  
            }
            
          }catch(Exception e){
             System.out.println(e); 
          }
      }else if(ae.getSource()==cancel){
          setVisible(false);
          new SignUpTwo(formno).setVisible(true);
      }
  }
  public static void main(String[] args){
      new SignUpThree("");
  }  
}
