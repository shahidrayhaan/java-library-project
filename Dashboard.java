package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton books,staff,addb,adds,removeb,removes,edit;
    Dashboard(){
        setSize(600,500);
        setLocation(350,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        JLabel heading = new JLabel("DASHBOARD");
        heading.setBounds(10,10,150,40);
        heading.setFont(new Font("arial",Font.ITALIC,20));
        add(heading);
        books = new JButton("Books");
        books.setBounds(120,100,150,40);
        books.addActionListener(this);
         books.setFont(new Font("arial",Font.BOLD,15));
        add(books);
         staff = new JButton("Staff");
        staff.setBounds(300,100,150,40);
        staff.addActionListener(this);
         staff.setFont(new Font("arial",Font.BOLD,15));
        add(staff);
         addb = new JButton("Add Books");
        addb.setBounds(120,160,150,40);
        addb.addActionListener(this);
         addb.setFont(new Font("arial",Font.BOLD,15));
        add(addb);
         adds = new JButton("Add Staff");
        adds.setBounds(300,160,150,40);
        adds.addActionListener(this);
         adds.setFont(new Font("arial",Font.BOLD,15));
        add(adds);
         removeb = new JButton("Remove Books");
        removeb.setBounds(120,220,150,40);
        removeb.addActionListener(this);
         removeb.setFont(new Font("arial",Font.BOLD,15));
        add(removeb);
         removes = new JButton("Remove Staff");
        removes.setBounds(300,220,150,40);
        removes.addActionListener(this);
         removes.setFont(new Font("arial",Font.BOLD,15));
        add(removes);
         edit = new JButton("Edit Admin");
        edit.setBounds(200,280,150,40);
        edit.addActionListener(this);
         edit.setFont(new Font("arial",Font.BOLD,15));
        add(edit);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== books){
            new Booktable();
           
        }else if(ae.getSource()== staff){
            new Staffd();
           
        }else if(ae.getSource()==addb){
            new Addb();
        }else if(ae.getSource()==adds){
            new Adds();
        }else if(ae.getSource()==removeb){
            new Removeb();
        }else if(ae.getSource()==removes){
            new Deletes();
        }else{
            new Dadmin();
        }
    }
    public static void main(String[] args){
        new Dashboard();
    }
}