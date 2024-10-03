package library.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login;
    JTextField un;
    JPasswordField pwd;
    
    Login(){
        setSize(750,500);
        setLocation(350,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        JLabel heading = new JLabel("Login");
        heading.setBounds(15,15,100,40);
        heading.setFont(new Font("arial",Font.ITALIC,30));
        add(heading);
        JLabel username = new JLabel("Username");
        username.setBounds(120,100,100,30);
        username.setFont(new Font("arial",Font.ITALIC,20));
        add(username);
         un = new JTextField();
        un.setBounds(230,110,100,20);
        add(un);
        JLabel password = new JLabel("Password");
        password.setBounds(120,170,100,30);
        password.setFont(new Font("arial",Font.ITALIC,20));
        add(password);
         pwd = new JPasswordField();
        pwd.setBounds(230,180,100,20);
        add(pwd);
        
         login = new JButton("Login");
        login.setBounds(200,240,75,30);
        login.addActionListener(this);
        add(login);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon14.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,100,300,200);
        add(image);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            try{
                Con c = new Con();
                String user = un.getText();
                String pass = pwd.getText();
                String query = "select * from login where username='"+user+"'and password='"+pass+"'";
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    new Dashboard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
                                                                                                
public static void main(String[] args){
        new Login();
    }
}