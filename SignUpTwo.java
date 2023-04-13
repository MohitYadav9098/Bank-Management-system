package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class SignUpTwo extends JFrame implements ActionListener{
    
     JTextField ATextfield,CTextfield;
     Button Back,Submit;
     JRadioButton Yes,No,eYes,eNo;
     JDateChooser dateChooser;
     JComboBox Religionb,category,IncomeSel,Educational,occupation;
     String formno;
    SignUpTwo(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("Create A New Account:Page 2");
        JLabel AdditionalDetails=new JLabel("Page2:additional Details");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        AdditionalDetails.setBounds(290,60,400,30);
        add(AdditionalDetails);
        JLabel Riligion=new JLabel("Riligion:");
        Riligion.setFont(new Font("Osward",Font.BOLD,20));
        Riligion.setBounds(80,100,200,30);
        add(Riligion);
        String ValRiligion[]={"HINDU","MUSLIM","MINORITY"};
        Religionb=new JComboBox(ValRiligion);
        Religionb.setBounds(250,104,400,25);
        Religionb.setFont(new Font("Arial",Font.BOLD,15));
        Religionb.setBackground(Color.WHITE);
        add(Religionb);
        JLabel Category=new JLabel("Category:");
        Category.setFont(new Font("Osward",Font.BOLD,20));
        Category.setBounds(80,140,200,30);
        add(Category);
        String Categorys[]={"OBC","GENERAL","EWS","SC/ST"};
        category=new JComboBox(Categorys);
        category.setFont(new Font("Arial",Font.BOLD,15));
        category.setBounds(250,144,400,25);
        category.setBackground(Color.WHITE);
        add(category);
        JLabel Income=new JLabel("Income:");
        Income.setFont(new Font("Osward",Font.BOLD,20));
        Income.setBounds(80,180,200,30);
        add(Income);
        String ValIncome[]={"Null","<1 lakh","<2.5 lakh","5 lakh","upto 10 lakh or above"};
        IncomeSel=new JComboBox(ValIncome);
        IncomeSel.setFont(new Font("Arial",Font.BOLD,15));
        IncomeSel.setBounds(250,180,400,25);
        IncomeSel.setBackground(Color.WHITE);
        add(IncomeSel);
        JLabel Education=new JLabel("Educational");
        Education.setFont(new Font("Osward",Font.BOLD,20));
        Education.setBounds(80,220,200,30);
        add(Education);
        String EducationVal[]={"10th pass","10+2 Higher Secondary","Graduate","Post-Graduate","Doctorate","Illitrate"};
        Educational=new JComboBox(EducationVal);
        Educational.setFont(new Font("Arial",Font.BOLD,15));
        Educational.setBounds(250,230,400,25);
        Educational.setBackground(Color.WHITE);
        add(Educational);
        JLabel Qualification=new JLabel("Qualification:");
        Qualification.setFont(new Font("Osward",Font.BOLD,20));
        Qualification.setBounds(80,240,200,30);
        add(Qualification);
        JLabel Occupation=new JLabel("Occupation:");
        Occupation.setFont(new Font("Osward",Font.BOLD,20));
        Occupation.setBounds(80,280,200,30);
        add(Occupation);
        String OccupationType[]={"Student","Bussinessman","Salaried","Self-Employed","Retired","Other"};
        occupation=new JComboBox(OccupationType);
        occupation.setFont(new Font("Arial",Font.BOLD,15));
        occupation.setBounds(250,280,400,25);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        JLabel Pan=new JLabel("Pan Number:");
        Pan.setFont(new Font("Osward",Font.BOLD,20));
        Pan.setBounds(80,320,200,30);
        add(Pan);
        ATextfield=new JTextField();
        ATextfield.setFont(new Font("Arial",Font.BOLD,15));
        ATextfield.setBounds(250,324,400,25);
        add(ATextfield);
        JLabel Adhaar=new JLabel("Adhaar Number.:");
        Adhaar.setFont(new Font("Osward",Font.BOLD,20));
        Adhaar.setBounds(80,360,200,30);
        add(Adhaar);
        CTextfield=new JTextField();
        CTextfield.setBounds(250,364,400,25);
        CTextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(CTextfield);
        JLabel State=new JLabel("Senior Citizon:");
        State.setFont(new Font("Osward",Font.BOLD,20));
        State.setBounds(80,400,200,30);
        add(State);
        Yes=new JRadioButton("Yes");
        Yes.setFont(new Font("Osward",Font.BOLD,15));
        Yes.setBounds(300,404,100,20);
        add(Yes);
         No=new JRadioButton("No");
        No.setFont(new Font("Osward",Font.BOLD,15));
        No.setBounds(500,404,100,20);
        add(No);
        ButtonGroup button=new ButtonGroup();
        button.add(No);
        button.add(Yes);
        JLabel PinCode=new JLabel("Existing account:");
        PinCode.setFont(new Font("Osward",Font.BOLD,20));
        PinCode.setBounds(80,440,200,30);
        add(PinCode);
        eYes=new JRadioButton("Yes");
        eYes.setFont(new Font("Arial",Font.BOLD,15));
        eYes.setBounds(300,444,100,20);
        add(eYes);
        eNo=new JRadioButton("No");
        eNo.setFont(new Font("Arial",Font.BOLD,15));
        eNo.setBounds(500,444,100,20);
        add(eNo);
        ButtonGroup buttons=new ButtonGroup();
        buttons.add(eYes);
        buttons.add(eNo);
        Back=new Button("Back");
        Back.setFont(new Font("Arial",Font.BOLD,15));
        Back.setBounds(300,490,60,25);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        add(Back);
        Submit=new Button("Submit");
        Submit.setFont(new Font("Arial",Font.BOLD,15));
        
        Submit.setBounds(535,490,60,25);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
                
        add(Submit);
        setSize(850,800);
        setLocation(400,10);
        setUndecorated(true);
        setVisible(true);
    }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==Submit){
       String Riligion=(String)Religionb.getSelectedItem();
       String Scategory=(String)category.getSelectedItem();
       String Sincome=(String) IncomeSel.getSelectedItem();
       String Education=(String) Educational.getSelectedItem();
       String Occupation=(String) occupation.getSelectedItem();
       String seniorcitizon=null;
       if(Yes.isSelected()){
           seniorcitizon="Yes";
       }else if(No.isSelected()){
           seniorcitizon="No";
       }
       String existingAccount=null;
       if(eYes.isSelected()){
           seniorcitizon="Yes";
       }else if(eNo.isSelected()){
           seniorcitizon="No";
       }
       
       String pan=ATextfield.getText();
       String adhaar=CTextfield.getText();
       try{
         if(pan.equals("")){
             JOptionPane.showMessageDialog(null,"pan is required");
         }
         if(adhaar.equals("")){
             JOptionPane.showMessageDialog(null,"adhaar is required");
         }else{
             cunnectivity c=new cunnectivity();
             String query="insert into signuptwo value('"+formno+"','"+Riligion+"','"+Scategory+"','"+Sincome+"','"+Education+"','"+Occupation+"','"+pan+"','"+adhaar+"','"+seniorcitizon+"','"+existingAccount+"')";
             c.s.executeUpdate(query);
             setVisible(false);
             new SignUpThree(formno).setVisible(true);
         }
       }catch(Exception e){
           System.out.print(e);
       }
       }else if(ae.getSource()==Back){
             setVisible(false);
             new SignUp().setVisible(true);
       }
   } 
   public static void main(String args[]){
       new SignUpTwo("");
       
   }
}
