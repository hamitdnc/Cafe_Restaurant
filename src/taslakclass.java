import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import pack.UseBean;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;


public class taslakclass extends JFrame {
	String[] masam={"masaa","masab","masac","masad","masae","masaf","masag","masah","masai","masaj","masak","masal","masam","masan","masao","masap"};
	public static String masa;
	PreparedStatement ps;
	DefaultListModel dlm;
	JTextField jtf1;
public class java {

	}


	public taslakclass() {
		
		setBounds(100, 100, 1335, 665);
		getContentPane().setLayout(null);
		dlm=new DefaultListModel();
		JList list_1 = new JList(dlm);
		list_1.setBounds(0, 51, 309, 477);
		getContentPane().add(list_1);
		
		JLabel label_1 = new JLabel("SÝPARÝÞ GÝRDÝSÝ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(0, 13, 309, 26);
		getContentPane().add(label_1);
	
		
		JButton btnNewButton = new JButton("KÖRI SOSLU TAVUK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("KÖRI SOSLU TAVUK",25);
			dlm.addElement("KÖRI SOSLU TAVUK");
			}
		});
		btnNewButton.setBackground(new Color(255, 250, 204));
		btnNewButton.setBounds(352, 8, 200, 104);
		getContentPane().add(btnNewButton);
		
		JButton btnIecekler = new JButton("ARABÝATTA");
		btnIecekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("ARABIATTA",15);
			dlm.addElement("ARABIATTA");
			}
		});
		btnIecekler.setBackground(new Color(205, 255, 204));
		btnIecekler.setBounds(352, 118, 200, 104);
		getContentPane().add(btnIecekler);
		
		JButton btnAparatifler = new JButton("BONFÝLE IZGARA");
		btnAparatifler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("BONFILE IZGARA",30);
			dlm.addElement("BONFILE IZGARA");
				
			}
		});
		btnAparatifler.setBackground(new Color(255, 255, 204));
		btnAparatifler.setBounds(352, 228, 200, 104);
		getContentPane().add(btnAparatifler);
		
		JButton btnNargileler = new JButton("TORTELLÝNÝ");
		btnNargileler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("TORTELLINI",17);
			dlm.addElement("TORTELLINI");	
			}
		});
		btnNargileler.setBackground(new Color(255, 255, 204));
		btnNargileler.setBounds(558, 8, 200, 104);
		getContentPane().add(btnNargileler);
		
		JButton btnSigaralar = new JButton("KAÞARLI TAVUK");
		btnSigaralar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("BONFILE IZGARA",30);
			dlm.addElement("BONFILE IZGARA");
			}
		});
		btnSigaralar.setBackground(new Color(255, 255, 204));
		btnSigaralar.setBounds(558, 118, 200, 104);
		getContentPane().add(btnSigaralar);
		
		JButton btnTatllar = new JButton("ÇÝN USULU KREMALI TAVUK");
		btnTatllar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("CIN USULU KREMALI TAVUK",22);
			dlm.addElement("CIN USULU KREMALI TAVUK");	
			}
		});
		btnTatllar.setBackground(new Color(255, 255, 204));
		btnTatllar.setBounds(558, 228, 200, 104);
		getContentPane().add(btnTatllar);
		
		JButton btnBurgerler = new JButton("PARMESAN STEAK");
		btnBurgerler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("PARMESAN STEAK",30);
			dlm.addElement("PARMESAN STEAK");	
			}
		});
		btnBurgerler.setBackground(new Color(255, 255, 204));
		btnBurgerler.setBounds(764, 8, 200, 104);
		getContentPane().add(btnBurgerler);
		
		JButton btnSandviler = new JButton("MEKSÝKALI USULU TAVUK");
		btnSandviler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("MEKSIKA USULU TAVUK",21);
			dlm.addElement("MEKSIKA USULU TAVUK");
			}
		});
		btnSandviler.setBackground(new Color(255, 255, 204));
		btnSandviler.setBounds(764, 118, 200, 104);
		getContentPane().add(btnSandviler);
		
		JButton btnTostlar = new JButton("SATIR KÖFTE");
		btnTostlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("SATIR KOFTE",28);
			dlm.addElement("SATIR KOFTE");	
			}
		});
		btnTostlar.setBackground(new Color(255, 255, 204));
		btnTostlar.setBounds(764, 228, 200, 104);
		getContentPane().add(btnTostlar);
		
		JButton btnSigaralar_1 = new JButton("MÝLANO USULÜ ÞNÝTZEL");
		btnSigaralar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("MILANO USULU SNITZEL",30);
			dlm.addElement("MILANO USULU SNITZEL");	
			}
		});
		btnSigaralar_1.setBackground(new Color(255, 255, 204));
		btnSigaralar_1.setBounds(970, 8, 200, 104);
		getContentPane().add(btnSigaralar_1);
		
		JButton btnEkstralar = new JButton("TAVUK ÞNÝTZEL");
		btnEkstralar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("TAVUK SNITZEL",25);
			dlm.addElement("TAVUK SNITZEL");	
			}
		});
		btnEkstralar.setBackground(new Color(255, 255, 204));
		btnEkstralar.setBounds(970, 118, 200, 104);
		getContentPane().add(btnEkstralar);
		
		JButton btnSpecialIecekler = new JButton("TACO SOSLU TAVUK");
		btnSpecialIecekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("TACO SOSLU TAVUK",24);
			dlm.addElement("TACO SOSLU TAVUK");	
			}
		});
		btnSpecialIecekler.setBackground(new Color(255, 255, 204));
		btnSpecialIecekler.setBounds(970, 228, 200, 104);
		getContentPane().add(btnSpecialIecekler);
		
		
		JButton btnNewButton_1 = new JButton("S\u0130PAR\u0130\u015E\u0130 \r\nG\u0130R");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				siparisler sip=new siparisler();
				sip.siparis();
				ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(1177, 8, 128, 55);
		getContentPane().add(btnNewButton_1);
		
		JButton btnHesapKapat = new JButton("HESAP KAPAT");
		btnHesapKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			hesapkapat();
			}
		});
		btnHesapKapat.setBackground(new Color(255, 255, 255));
		btnHesapKapat.setBounds(1177, 69, 128, 55);
		getContentPane().add(btnHesapKapat);
		
		JButton btnVazge = new JButton("VAZGE\u00C7");
		btnVazge.setBackground(new Color(255, 255, 255));
		btnVazge.setBounds(1177, 130, 128, 55);
		getContentPane().add(btnVazge);
		
		JButton btnMiktar = new JButton("M\u0130KTAR");
		btnMiktar.setBackground(new Color(255, 255, 255));
		btnMiktar.setBounds(1176, 191, 129, 55);
		getContentPane().add(btnMiktar);
		
		JButton btnAklama = new JButton("A\u00C7IKLAMA");
		btnAklama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame jfrm = new JFrame("Market");
				jfrm.setSize(150,100);
				jfrm.setLayout(new FlowLayout());
				jfrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				jfrm.setVisible(true);
				jtf1 = new JTextField(10);
				jfrm.add(jtf1);
				JButton jbtn=new JButton("AÇIKLAMA");
				jfrm.add(jbtn);
				jbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
				    jfrm.dispose();
				    dlm.addElement(jtf1.getText());
					}
				});
			}
		});
		btnAklama.setBackground(new Color(255, 255, 255));
		btnAklama.setBounds(1176, 252, 129, 55);
		getContentPane().add(btnAklama);
		
		JButton btnSil = new JButton("S\u0130L");
		btnSil.setBackground(new Color(255, 255, 255));
		btnSil.setBounds(1177, 313, 128, 55);
		getContentPane().add(btnSil);
		
		JButton btnHesapAyr = new JButton("HESAP AYIR");
		btnHesapAyr.setBackground(new Color(255, 255, 255));
		btnHesapAyr.setBounds(1177, 374, 128, 55);
		getContentPane().add(btnHesapAyr);
		
		JButton btnToplamYazdr = new JButton("TOPLAM YAZDIR");
		btnToplamYazdr.setBackground(new Color(255, 255, 255));
		btnToplamYazdr.setBounds(1177, 435, 128, 55);
		getContentPane().add(btnToplamYazdr);
		
		JButton btnk = new JButton("\u00C7IKI\u015E");
		btnk.setBackground(new Color(255, 255, 255));
		btnk.setBounds(1177, 496, 128, 55);
		getContentPane().add(btnk);
		
		JButton btnIkram = new JButton("ÝKRAM");
		btnIkram.setBackground(new Color(250, 250, 210));
		btnIkram.setBounds(352, 559, 104, 34);
		getContentPane().add(btnIkram);
		
		JButton btnIade = new JButton("ÝADE");
		btnIade.setBackground(new Color(250, 250, 210));
		btnIade.setBounds(461, 559, 104, 34);
		getContentPane().add(btnIade);
		
		JButton btnIskonto = new JButton("\u0130SKONTO");
		btnIskonto.setBackground(new Color(250, 250, 210));
		btnIskonto.setBounds(571, 559, 104, 34);
		getContentPane().add(btnIskonto);
		
		JButton btnMiktar_1 = new JButton("M\u0130KTAR");
		btnMiktar_1.setBackground(new Color(250, 250, 210));
		btnMiktar_1.setBounds(682, 559, 104, 34);
		getContentPane().add(btnMiktar_1);
		
		JLabel lblHzlEriimMens = new JLabel("HIZLI ERÝÞÝM MENÜSÜ");
		lblHzlEriimMens.setBounds(682, 338, 157, 50);
		getContentPane().add(lblHzlEriimMens);
		
		JButton btnay = new JButton("\u00C7AY");
		btnay.setBackground(new Color(255, 255, 153));
		btnay.setBounds(365, 379, 67, 50);
		getContentPane().add(btnay);
		
		JButton btnSu = new JButton("SU");
		btnSu.setBackground(new Color(255, 255, 153));
		btnSu.setBounds(438, 379, 67, 50);
		getContentPane().add(btnSu);
		
		JButton btnKahve = new JButton("KAHVE");
		btnKahve.setBackground(new Color(255, 255, 153));
		btnKahve.setBounds(511, 379, 85, 50);
		getContentPane().add(btnKahve);
		
		JButton btnKola = new JButton("KOLA");
		btnKola.setBackground(new Color(255, 255, 153));
		btnKola.setBounds(608, 379, 85, 50);
		getContentPane().add(btnKola);
		
		JButton btnFanta = new JButton("FANTA");
		btnFanta.setBackground(new Color(255, 255, 153));
		btnFanta.setBounds(705, 379, 85, 50);
		getContentPane().add(btnFanta);
		
		JButton btnKriSosluTavuk = new JButton("KÖRÝ SOSLU TAVUK");
		btnKriSosluTavuk.setBackground(new Color(255, 255, 153));
		btnKriSosluTavuk.setBounds(814, 379, 173, 50);
		getContentPane().add(btnKriSosluTavuk);
		
		JButton btnCips = new JButton("CÝPS");
		btnCips.setBackground(new Color(255, 255, 153));
		btnCips.setBounds(365, 440, 91, 50);
		getContentPane().add(btnCips);
		
		JButton btnArabiatta = new JButton("ARABiATTA");
		btnArabiatta.setBackground(new Color(255, 255, 153));
		btnArabiatta.setBounds(473, 440, 104, 50);
		getContentPane().add(btnArabiatta);
		
		JButton btnBonfileIzgara = new JButton("BONFiLE IZGARA");
		btnBonfileIzgara.setBackground(new Color(255, 255, 153));
		btnBonfileIzgara.setBounds(596, 440, 151, 50);
		getContentPane().add(btnBonfileIzgara);
		
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
    public void veridegis(String a){
    	
	masa=a;
	
	
    }
    
    public void veriekle(String masam,int a){
	Connection conn=baglan();
	try {
		
		String sql = "insert into "+masa+"("+masa+",tutar) values(?,?);";
		
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1,masam);
			ps.setInt(2,a);
		
			
		
		
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
	
	}
    public void hesapkapat(){
    	Connection conn =baglan();
		try {
			String sql = "delete * from "+masa+" ;";
			
			    System.out.println(masa);
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
				ps.executeUpdate();
				
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
    }
}

