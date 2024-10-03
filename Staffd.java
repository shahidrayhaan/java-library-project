package library.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class Staffd extends JFrame{
    JTable table;
    Staffd(){
        setSize(900,700);
        setLocation(350,100);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        JLabel heading = new JLabel("STAFF DETAILS");
        heading.setBounds(10,10,200,40);
        heading.setFont(new Font("arial",Font.ITALIC,20));
        add(heading);
        table = new JTable();
        try{
            Con c = new Con();
            ResultSet rs = c.s.executeQuery("select * from staff");
           
                table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,50,900,700);
        add(jsp);
    }
    public static void main(String[] args){
        new Staffd();
    }
}