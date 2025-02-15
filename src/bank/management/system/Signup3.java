package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
        String formno;
    Signup3( String formno){
            this.formno = formno;

            setLayout(null);

            JLabel l1 = new JLabel("Page 3: Account Details");
            l1.setFont(new Font("Raleway",Font.BOLD,22));
            l1.setBounds(280,40,400,40);
            add(l1);

            JLabel type = new JLabel("Account Types");
            type.setFont(new Font("Raleway",Font.BOLD,22));
            type.setBounds(100,140,200,30);
            add(type);

            r1= new JRadioButton("Saving Account");
            r1.setFont(new Font("Raleway",Font.BOLD,16));
            r1.setBounds(100,180,150,20);
            r1.setBackground(Color.WHITE);
            add(r1);

            r2= new JRadioButton("Fixed Deposit Account");
            r2.setFont(new Font("Raleway",Font.BOLD,16));
            r2.setBounds(400,180,200,20);
            r2.setBackground(Color.WHITE);
            add(r2);

            r3= new JRadioButton("Current Account");
            r3.setFont(new Font("Raleway",Font.BOLD,16));
            r3.setBounds(100,220,150,20);
            r3.setBackground(Color.WHITE);
            add(r3);

            r4= new JRadioButton("Recurring Account");
            r4.setFont(new Font("Raleway",Font.BOLD,16));
            r4.setBounds(400,220,200,20);
            r4.setBackground(Color.WHITE);
            add(r4);

            ButtonGroup groupaccount = new ButtonGroup();
            groupaccount.add(r1);
            groupaccount.add(r2);
            groupaccount.add(r3);
            groupaccount.add(r4);


            JLabel card = new JLabel("Card Number");
            card.setFont(new Font("Raleway",Font.BOLD,22));
            card.setBounds(100,300,200,30);
            add(card);

            JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
            number.setFont(new Font("Raleway",Font.BOLD,22));
            number.setBounds(300,300,300,30);
            add(number);

            JLabel carddetail = new JLabel("Your 16 Digit Card Number");
            carddetail.setFont(new Font("Raleway",Font.BOLD,12));
            carddetail.setBounds(100,330,300,20);
            add(carddetail);

            JLabel pin = new JLabel("Pin Number");
            pin.setFont(new Font("Raleway",Font.BOLD,22));
            pin.setBounds(100,360,200,30);
            add(pin);

            JLabel number2 = new JLabel("XXXX");
            number2.setFont(new Font("Raleway",Font.BOLD,22));
            number2.setBounds(300,360,300,30);
            add(number2);

            JLabel pindetail = new JLabel("Your 4 Digit Pin Number");
            pindetail.setFont(new Font("Raleway",Font.BOLD,12));
            pindetail.setBounds(100,395,300,20);
            add(pindetail);


            JLabel services = new JLabel("Services Required:");
            services.setFont(new Font("Raleway",Font.BOLD,22));
            services.setBounds(100,450,300,20);
            add(services);

            c1 = new JCheckBox("ATM CARD");
            c1.setBackground(Color.WHITE);
            c1.setBounds(100,500,150,30);
            c1.setFont(new Font("Raleway",Font.BOLD,16));
            add(c1);

            c2 = new JCheckBox("Internet Banking");
            c2.setBackground(Color.WHITE);
            c2.setBounds(350,500,200,30);
            c2.setFont(new Font("Raleway",Font.BOLD,16));
            add(c2);

            c3 = new JCheckBox("Mobile Banking");
            c3.setBackground(Color.WHITE);
            c3.setBounds(100,550,200,30);
            c3.setFont(new Font("Raleway",Font.BOLD,16));
            add(c3);

            c4 = new JCheckBox("EMAIL & SMS Alert");
            c4.setBackground(Color.WHITE);
            c4.setBounds(350,550,200,30);
            c4.setFont(new Font("Raleway",Font.BOLD,16));
            add(c4);

            c5 = new JCheckBox("Cheque Book");
            c5.setBackground(Color.WHITE);
            c5.setBounds(100,600,200,30);
            c5.setFont(new Font("Raleway",Font.BOLD,16));
            add(c5);

            c6 = new JCheckBox("E-Statement");
            c6.setBackground(Color.WHITE);
            c6.setBounds(350,600,200,30);
            c6.setFont(new Font("Raleway",Font.BOLD,16));
            add(c6);

            c7 = new JCheckBox("I Hereby declares that the above entered details are correct to the best of my knowledge");
            c7.setBackground(Color.WHITE);
            c7.setBounds(100,700,600,30);
            c7.setFont(new Font("Raleway",Font.BOLD,12));
            add(c7);

            submit = new JButton("Submit");
            submit.setBackground(Color.BLACK);
            submit.setForeground(Color.WHITE);
            submit.setFont(new Font("Raleway",Font.BOLD,14));
            submit.setBounds(250,750,100,30);
            submit.addActionListener(this);
            add(submit);

            cancle = new JButton("Cancle");
            cancle.setBackground(Color.BLACK);
            cancle.setForeground(Color.WHITE);
            cancle.setFont(new Font("Raleway",Font.BOLD,14));
            cancle.setBounds(420,750,100,30);
            cancle.addActionListener(this);
            add(cancle);

            getContentPane().setBackground(Color.WHITE);


            setSize(850,820);
            setLocation(350,0);
            setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == submit){
                    String accounType = null;
                    if(r1.isSelected()){
                            accounType = "Saving Account";
                    } else if (r2.isSelected()) {
                            accounType="Fixed Deposit Account";
                    } else if (r3.isSelected()) {
                            accounType="Current Account";
                    }else if (r4.isSelected()) {
                            accounType="Reccuring Deposit Account";
                    }
                    Random random = new Random();
                    String cardnumber =  "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

                    String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

                    String facility = "";
                    if(c1.isSelected()){
                            facility = facility + "ATM Card";
                    } else if (c2.isSelected()) {
                            facility = facility + "Internet Banking";
                    } else if (c3.isSelected()) {
                            facility = facility + "Mobile Banking";
                    } else if (c4.isSelected()) {
                            facility = facility + "Email & SMS Alert";
                    } else if (c5.isSelected()) {
                            facility = facility + "Cheque Book";
                    } else if (c6.isSelected()) {
                            facility = facility + "E-Statement";
                    }

                    try{
                            if(accounType.equals("")){
                                    JOptionPane.showMessageDialog(null,"Account Type is Required");

                            } else{
                                    conn c  = new conn();
                                    String query1 = "INSERT INTO Signup3 VALUES ('"+formno+"', '"+accounType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                                    String query2 = "INSERT INTO login VALUES ('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                                    c.s.executeUpdate(query1);
                                    c.s.executeUpdate(query2);

                                    JOptionPane.showMessageDialog(null,"Card Number:" + cardnumber + "\n Pin: " + pinnumber);
                                    setVisible(false);
                                    new Deposit(pinnumber).setVisible(false);
                            }
                    } catch(Exception e){
                            System.out.println(e);
                    }
            } else if (ae.getSource() == cancle) {
                    setVisible(false);
                   new Login(formno).setVisible(true);
            }
    }
    public static void main(String[] args) {
        new Signup3("");
    }


}
