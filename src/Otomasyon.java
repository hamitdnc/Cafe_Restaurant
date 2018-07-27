import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JEditorPane;

import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;

import java.awt.TextField;

import javax.swing.JTextField;
public class Otomasyon extends JFrame {

	protected static final String MASALAR = null;
	private JPanel contentPane;
	private JTextField txtMasaNumarasnGiriniz,jtf1,jtf2;
	JButton btnGnlkSatlar;
	JButton button_1;
	JButton btnMesajGnder;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Otomasyon frame = new Otomasyon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
    
	public Connection baglan()
	{
	Connection conn=null;
	 try{
		    conn = DriverManager.getConnection( "jdbc:mysql://localhost/cafe", "root", "" );  
		  
		     }
		     catch(SQLException exp){
		        exp.printStackTrace();
		     }
	return conn;	
	}
	public Otomasyon() {
		setTitle("AUTOCAFE");
		setBackground(UIManager.getColor("EditorPane.inactiveBackground"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 632, 450);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(204, 204, 204));
		contentPane.setToolTipText("MASA ADINI GIRINIZ:");
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMasaNumarasnGiriniz = new JTextField();
		txtMasaNumarasnGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMasaNumarasnGiriniz.setText("AUTOCAFE HOÞGELDÝNÝZ");
		txtMasaNumarasnGiriniz.setBounds(153, 13, 316, 101);
		contentPane.add(txtMasaNumarasnGiriniz);
		txtMasaNumarasnGiriniz.setColumns(10);
		
		btnGnlkSatlar = new JButton("GUNLUK SATISLAR");
		btnGnlkSatlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=0;
				try{
					
					Connection conn = baglan();
					
					if(conn!=null)
					{
						
						String sql = "select toplam from toplam;";
						Statement st = conn.createStatement();
						ResultSet rs =st.executeQuery(sql);
						while(rs.next()){
						a+=(int)rs.getInt("toplam");}
						String b=a+" TL SATIÞ";
						JOptionPane.showMessageDialog(null, b , "GÜNLÜK SATIÞ" , JOptionPane.INFORMATION_MESSAGE);
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
			}
		});
		btnGnlkSatlar.setBackground(new Color(255, 255, 240));
		btnGnlkSatlar.setBounds(470, 0, 152, 67);
		contentPane.add(btnGnlkSatlar);
		
	    button_1 = new JButton("MASA DÜZENÝ");
		button_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				MASALAR frame2=new MASALAR();
				frame2.setVisible(true);
			}
		});
		button_1.setBackground(new Color(255, 255, 240));
		button_1.setBounds(0, 0, 152, 67);
		contentPane.add(button_1);
		
		btnMesajGnder = new JButton("MESAJ GONDER");
		btnMesajGnder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//mesaj gönderme kodlarý
			}
		});
		btnMesajGnder.setBackground(new Color(255, 255, 240));
		btnMesajGnder.setBounds(0, 67, 152, 47);
		contentPane.add(btnMesajGnder);
		
		JButton button_2 = new JButton("KULLANICI");
		button_2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	JFrame jfrm = new JFrame("Market");
        	jfrm.setSize(200,200);
        	jfrm.setLayout(new FlowLayout());
        	jfrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	jtf1=new JTextField(15);
        	jtf2=new JTextField(15);
        	JLabel jlb1=new JLabel("KULLANICI ADI");
        	jfrm.add(jlb1);
        	jfrm.add(jtf1);
        	JLabel jlb2=new JLabel("ÞÝFRE");
        	jfrm.add(jlb2);
        	jfrm.add(jtf2);
        	JButton jbtn=new JButton("GÝRÝÞ");
        	jfrm.add(jbtn);
        	jfrm.setVisible(true);
        	jbtn.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
                    
    				
    				String m1=jtf1.getText();
    				String a="hamit";
    				String m2=jtf2.getText();
    				String b="1597";
    				if(m2.equals(b) && m1.equals(a)){
    					btnMesajGnder.setEnabled(true);
    					button_1.setEnabled(true);
    					btnGnlkSatlar.setEnabled(true);	
    					jfrm.dispose();
    				}
    				else {
    			JOptionPane.showMessageDialog(null, "GÝRÝÞ HATALI" , "HESAP" , JOptionPane.INFORMATION_MESSAGE);
    				}
    				jtf1.setText("");
    				jtf2.setText("");
    		
    			}
    		});
			}
		});
		button_2.setBackground(new Color(255, 255, 240));
		button_2.setBounds(470, 67, 152, 47);
		contentPane.add(button_2);
		
		btnMesajGnder.setEnabled(false);
		button_1.setEnabled(false);
		btnGnlkSatlar.setEnabled(false);
		
		
	}
	public void textnumarasi(int a){
		String numara=new String();
		numara+=a;
		txtMasaNumarasnGiriniz.setText(numara);
	}

  }