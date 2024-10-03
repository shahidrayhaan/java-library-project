package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dadmin extends JFrame implements ActionListener{
    JTextField ee;
    JPasswordField eek;
    JButton edit;
    Dadmin(){
        setSize(500,400);
        setLocation(350,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        JLabel heading = new JLabel("EDIT DETAILS");
        heading.setBounds(5,5,200,40);
        heading.setFont(new Font("arial",Font.ITALIC,20));
        add(heading);
        JLabel editu = new JLabel("Edit Username");
        editu.setBounds(100,60,200,40);
        editu.setFont(new Font("arial",Font.ITALIC,20));
        add(editu);
         ee = new JTextField();
         ee.setBounds(250,70,200,20);
         add(ee);
        
         JLabel editp = new JLabel("Edit Password");
        editp.setBounds(100,100,200,40);
        editp.setFont(new Font("arial",Font.ITALIC,20));
        add(editp);
         eek = new JPasswordField();
         eek.setBounds(250,110,200,20);        
         add(eek);
        edit = new JButton("Edit");
        edit.setBounds(210,150,100,40);
        edit.addActionListener(this);
        add(edit);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==edit){
            try{
                Con c = new Con();
                String username = ee.getText();
                String password = eek.getText();
                c.s.executeUpdate("UPDATE login SET username='"+username+"',  password='"+password+"' LIMIT 1");
                JOptionPane.showMessageDialog(null, "Sucessful");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        new Dadmin();
    }
}