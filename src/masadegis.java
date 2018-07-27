import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

public class masadegis{
	JTextField jtf1,jtf2;
	
	public masadegis(){
	JFrame jfrm = new JFrame("Market");
	jfrm.setSize(100,150);
	jfrm.setLayout(new FlowLayout());
	jfrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	jtf1=new JTextField(10);
	jtf2=new JTextField(10);
	jfrm.add(jtf1);
	jfrm.add(jtf2);
	JButton jbtn=new JButton("DEÐÝÞTÝR");
	jbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
	    jfrm.dispose();
	    masadeg();
		}
	});
	jfrm.add(jbtn);
	jfrm.setVisible(true);
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
	public void masadeg(){
		String m1=jtf1.getText();
		String m2=jtf2.getText();
		
		String[] urun = new String[30];
		int[] tutar = new int[30];
		int sayac = 0;
		
		try{
			
			
			Connection conn = baglan();
			if(conn!=null && m1.length()>0 && m2.length()>0)
			{  
				String sql="select tutar,"+m1+" from "+m1+";";
				System.out.println(m1);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()) // kayit varsa
				{   
				
				urun[sayac]=rs.getString(m1);
                tutar[sayac]=rs.getInt("tutar");
                System.out.println(tutar[sayac]);
                sayac++;
                
				}
                String sql2 = "Delete from "+ m1 +" ;";
			
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql2);
				ps.executeUpdate();
				
				String sql3 = "insert into "+m2+"("+m2+",tutar) values(?,?);";
        		
    			PreparedStatement ps1 = (PreparedStatement) conn.prepareStatement(sql3);
    			for(int i=0;i<sayac;i++){
    			ps1.setString(1,urun[i]);
    			ps1.setInt(2,tutar[i]);
    		    ps1.executeUpdate();
    		    
    			}
				
			}
			
			
			}catch(Exception ex)
			{
				System.out.println(ex);
				
			}
		
		
	}
}
