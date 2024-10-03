package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Adds extends JFrame implements ActionListener{
    JTextField bbname,bbid,ccbook;
    JButton add;
    Adds(){
        setSize(600,500);
        setLocation(350,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        JLabel heading = new JLabel("Add Staff");
        heading.setFont(new Font("arial",Font.ITALIC,20));
        heading.setBounds(5,5,100,30);
        add(heading);
        
        JLabel bname = new JLabel("Staff Name");
        bname.setFont(new Font("arial",Font.ITALIC,15));
        bname.setBounds(105,50,100,30);
        add(bname);
        bbname = new JTextField();
        bbname.setBounds(200,60,150,20);
        add(bbname);
        JLabel bid = new JLabel("Staff ID");
        bid.setFont(new Font("arial",Font.ITALIC,15));
        bid.setBounds(105,100,100,30);
        add(bid);
        bbid = new JTextField();
        bbid.setBounds(200,110,150,20);
        add(bbid);
        JLabel cbook = new JLabel(" Staff Contact");
        cbook.setFont(new Font("arial",Font.ITALIC,15));
        cbook.setBounds(105,150,100,30);
        add(cbook);
        ccbook = new JTextField();
        ccbook.setBounds(200,160,150,20);
        add(ccbook);
        add = new JButton("Add");
        add.setBounds(180,220,100,40);
        add.setFont(new Font("arial",Font.ITALIC,15));
        add.addActionListener(this);
        add(add);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== add){
            try{
            Con c = new Con();
            String bookname = bbname.getText();
            String bookid=  bbid.getText();
            String copies = ccbook.getText();
            c.s.executeUpdate("insert into staff values('"+bookid+"','"+bookname+"','"+copies+"')");
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully");
            setVisible(false);
        }catch(Exception e){
                e.printStackTrace();
                }
        }
    }
    public static void main(String[] args){
        new Adds();
    }
}