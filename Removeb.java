package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Removeb extends JFrame implements ActionListener{
    JTextField rname,rid;
    JButton delete;
    Removeb(){
        setSize(400,300);
        setLocation(350,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        JLabel heading = new JLabel("Remove Books");
        heading.setBounds(5,5,150,40);
        heading.setFont(new Font("Arial",Font.ITALIC,20));
        add(heading);
        JLabel name = new JLabel("Name");
        name.setBounds(70,110,100,30);
        name.setFont(new Font("arial",Font.ITALIC,20));
        add(name);
         rname = new JTextField();
        rname.setBounds(200,110,100,30);
        rname.setFont(new Font("arial",Font.ITALIC,20));
        add(rname);
         JLabel id = new JLabel("Book ID");
        id.setBounds(70,150,100,30);
        id.setFont(new Font("arial",Font.ITALIC,20));
        add(id);
         rid = new JTextField();
        rid.setBounds(200,150,100,30);
        rid.setFont(new Font("arial",Font.ITALIC,20));
        add(rid);
        delete = new JButton("Delete");
        delete.setBounds(120,220,150,30);
        delete.setFont(new Font("arial",Font.ITALIC,20));
        delete.addActionListener(this);
        add(delete);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== delete){
            try{
                Con c = new Con();
                String bookids= rid.getText();
                String query= "delete from book where bookno='"+bookids+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Deleted");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    
}
    public static void main(String[] args){
        new Removeb();
    }
}