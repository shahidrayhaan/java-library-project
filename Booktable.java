package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class Booktable extends JFrame{
    JTable table;
    Booktable(){
        setSize(900,700);
        setLocation(350,100);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel heading = new JLabel("Books Available");
        heading.setBounds(10,10,200,40);
        heading.setFont(new Font("arial",Font.ITALIC,20));
        add(heading);
        table = new JTable();
        
        try{
            Con c = new Con();
            
            ResultSet rs = c.s.executeQuery("select * from book");
            
                table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        JScrollPane jsp = new JScrollPane(table);
        
        jsp.setBounds(0,50,900,700);
        add(jsp);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Booktable();
    }
}