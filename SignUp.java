package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class SignUp extends JFrame implements ActionListener{
    long random;
    JTextField NameTextfield,fTextfield,MTextfield,MailTextfield,NTextfield,ATextfield,CTextfield,StateTextfield,PTextfield;
     Button Back,Submit;
     JRadioButton male,Female,Singal,married,Divorced;
     JDateChooser dateChooser;
    SignUp(){
        setLayout(null);
        Random ren=new Random();
        random= Math.abs((ren.nextLong()%9000L)+1000L);
        JLabel formno =new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        JLabel ParsonalDetails=new JLabel("(Page1:Parsonal Details)");
        ParsonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        ParsonalDetails.setBounds(290,60,400,30);
        add(ParsonalDetails);
        JLabel Name=new JLabel("Name:");
        Name.setFont(new Font("Osward",Font.BOLD,20));
        Name.setBounds(80,100,200,30);
        add(Name);
         NameTextfield=new JTextField();
        NameTextfield.setBounds(250,104,400,25);
        NameTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(NameTextfield);
        JLabel Fathers_Name=new JLabel("Father's Name:");
        Fathers_Name.setFont(new Font("Osward",Font.BOLD,20));
        Fathers_Name.setBounds(80,140,200,30);
        add(Fathers_Name);
       fTextfield=new JTextField();
        fTextfield.setBounds(250,144,400,25);
        fTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(fTextfield);

        JLabel Mother_Name=new JLabel("Mother's Name:");
        Mother_Name.setFont(new Font("Osward",Font.BOLD,20));
        Mother_Name.setBounds(80,180,200,30);
        add(Mother_Name);
        MTextfield=new JTextField();
        MTextfield.setBounds(250,184,400,25);
        MTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(MTextfield);
        JLabel DOB=new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Osward",Font.BOLD,20));
        DOB.setBounds(80,220,200,30);
        add(DOB);
        dateChooser=new JDateChooser();
        dateChooser.setBounds(250,220,400,30);
        add(dateChooser);
        JLabel Gander=new JLabel("Gander:");
        Gander.setFont(new Font("Osward",Font.BOLD,20));
        Gander.setBounds(80,260,200,30);
        add(Gander);
         male=new JRadioButton("male");
        male.setFont(new Font("Osward",Font.BOLD,15));
        male.setBounds(250,265,100,20);
        add(male);
         Female=new JRadioButton("female");
        Female.setFont(new Font("Osward",Font.BOLD,15));
        Female.setBounds(450,265,100,20);
        add(Female);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(Female);
        JLabel mail=new JLabel("e-mail:");
        mail.setFont(new Font("Osward",Font.BOLD,20));
        mail.setBounds(80,300,200,30);
        add(mail);
         MailTextfield=new JTextField();
        MailTextfield.setBounds(250,304,400,25);
        MailTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(MailTextfield);
        JLabel number=new JLabel("Mobile Number:");
        number.setFont(new Font("Osward",Font.BOLD,20));
        number.setBounds(80,340,200,30);
        add(number);
         NTextfield=new JTextField();
        NTextfield.setBounds(250,344,400,25);
        NTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(NTextfield);
        JLabel Status=new JLabel("Meritorial Status:");
        Status.setFont(new Font("Osward",Font.BOLD,20));
        Status.setBounds(80,380,200,30);
        add(Status);
        married=new JRadioButton("Married");
        married.setFont(new Font("Osward",Font.BOLD,15));
        married.setBounds(250,385,100,20);
        add(married);
         Singal=new JRadioButton("Singal");
        Singal.setFont(new Font("Osward",Font.BOLD,15));
        Singal.setBounds(400,385,100,20);
        add(Singal);
        Divorced=new JRadioButton("Divorced");
        Divorced.setFont(new Font("Osward",Font.BOLD,15));
        Divorced.setBounds(555,385,100,20);
        add(Divorced);
        ButtonGroup select=new ButtonGroup();
        select.add(married);
        select.add(Singal);
        select.add(Divorced);
        JLabel Address=new JLabel("Address:");
        Address.setFont(new Font("Osward",Font.BOLD,20));
        Address.setBounds(80,420,200,30);
        add(Address);
        ATextfield=new JTextField();
        ATextfield.setBounds(250,424,400,25);
        ATextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(ATextfield);
        JLabel City=new JLabel("City:");
        City.setFont(new Font("Osward",Font.BOLD,20));
        City.setBounds(80,460,200,30);
        add(City);
         CTextfield=new JTextField();
        CTextfield.setBounds(250,464,400,25);
        CTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(CTextfield);
        JLabel State=new JLabel("State:");
        State.setFont(new Font("Osward",Font.BOLD,20));
        State.setBounds(80,500,200,30);
        add(State);
         StateTextfield=new JTextField();
        StateTextfield.setBounds(250,504,400,25);
        StateTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(StateTextfield);
        JLabel PinCode=new JLabel("PinCode:");
        PinCode.setFont(new Font("Osward",Font.BOLD,20));
        PinCode.setBounds(80,540,200,30);
        add(PinCode);
         PTextfield=new JTextField();
        PTextfield.setBounds(250,544,400,25);
        PTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(PTextfield);
        Back=new Button("Back");
        Back.setFont(new Font("Arial",Font.BOLD,15));
        Back.setBounds(300,585,60,25);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        add(Back);
        Submit=new Button("Submit");
        Submit.setFont(new Font("Arial",Font.BOLD,15));
        
        Submit.setBounds(535,584,60,25);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);
        setSize(850,800);
        setUndecorated(true);
        setLocation(400,10);
        setVisible(true);
    }
   public void actionPerformed(ActionEvent ae){
       String formno=""+ random;
       String name=NameTextfield.getText();
       String Fathers_Name=fTextfield.getText();
       String Mothers_Name=MTextfield.getText();
       String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
       String gander=null;
       if(male.isSelected()){
           gander="male";
       }else if(Female.isSelected()){
           gander="female";
       }
       String status=null;
       if(Singal.isSelected()){
           status="Singal";
       }else if(married.isSelected()){
           status="married";
       }else if(Divorced.isSelected()){
           status="Divorced";
       }
       String Mail=MailTextfield.getText();
       String number=NTextfield.getText();
       String Address=ATextfield.getText();
       String city=CTextfield.getText();
       String State=StateTextfield.getText();
       String pin=PTextfield.getText();
       try{
         if(name.equals("")){
             JOptionPane.showMessageDialog(null,"name is required");
         }else{
             cunnectivity c=new cunnectivity();
             String query="insert into signup value('"+formno+"','"+name+"','"+Fathers_Name+"','"+Mothers_Name+"','"+dob+"','"+gander+"','"+Mail+"','"+number+"','"+status+"','"+Address+"','"+city+"','"+State+"','"+pin+"')";
             c.s.executeUpdate(query);
             setVisible(false);
             new SignUpTwo(formno).setVisible(true);
         }
         }
         
       catch(Exception e){
           System.out.print(e);
       }
   } 
   public static void main(String args[]){
       new SignUp();
       
   }
}
