package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class UseBean {

    public String masam;
    public UseBean(String masa){
    	masam=masa;
    	
    }
public Connection baglan()
{
Connection conn=null;
 try{
	    conn = DriverManager.getConnection( "jdbc:mysql://localhost/cafe", "root", "" );  
	    System.out.println("Baglanti Kuruldu");
	     }
	     catch(SQLException exp){
	        exp.printStackTrace();
	     }
return conn;	
}

}