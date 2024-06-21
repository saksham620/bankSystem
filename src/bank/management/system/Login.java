package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    String formno;
    Login(String formno){
        this.formno = formno;
        setTitle("BANK MANAGEMENT SYSTEM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3= new ImageIcon(ii2);
        JLabel photo = new JLabel(ii3);
        photo.setBounds(630,350,100,100);
        add(photo);


        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD,38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 450, 40);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325, 190,230 , 30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway", Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 450, 30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);


        button2= new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);


        button3= new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350, 230, 30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3= new ImageIcon(iii2);
        JLabel photos = new JLabel(iii3);
        photos.setBounds(0,0,850,480);
        add(photos);



        setSize(850,480);
        setVisible(true);
        setLocation(450, 200);
        setLayout(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            if(e.getSource()==button1) {
                conn c = new conn();
                String cardnumber = textField2.getText();
                String pinnumber = passwordField3.getText();
                String query = "select * from login where cardNumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
                try{
                   ResultSet rs =  c.s.executeQuery(query);
                   if(rs.next()){
                       setVisible(false);
                       new Transaction(pinnumber).setVisible(true);
                   }else{
                       JOptionPane.showMessageDialog(null,"Incorrect Crd Number or Pin");
                   }
                }catch(Exception x){
                    System.out.println(x);
                }
            }
            else if(e.getSource() == button3){
                    setVisible(false);
                    new Signup1().setVisible(true);

            }

            else if(e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");
            }
            else if(e.getSource()==button3){
                setVisible(false);
                new Signup1().setVisible(true);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Login("");
    }
}