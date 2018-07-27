import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.Color;
public class siparisler extends JFrame {
	JLabel label_1;
    JScrollPane jsp=new JScrollPane();
    public static DefaultListModel dlm_id,dlm1;
    private JList list1;
    public static int veri;
    public static siparisler jframe;
    JTextField jtf1;
    JLabel lblToplam;
    String[] masa={"masaa","masab","masac","masad","masae","masaf","masag","masah","masai","masaj","masak","masal","masam","masan","masao","masap"};
    String[] masa2={"MASA-A","MASA-B","MASA-C","MASA-D","MASA-E","MASA-F","MASA-G","MASA-H","MASA-I","MASA-J","MASA-K","MASA-L","MASA-M","MASA-N","MASA-O","MASA-P"};
    		
    String[] id={"ida","idb","idc","idd","ide","idf","idg","idh","idi","idj","idk","idl","idm","idn","ido","idp"};
    public class java {

	}
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe = new siparisler();
					jframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public siparisler() {
		setBounds(100, 100, 1335, 665);
		getContentPane().setLayout(null);
		dlm1=new DefaultListModel();
		list1 = new JList(dlm1);
		list1.setBounds(0, 51, 309, 477);
		getContentPane().add(list1);
		
		
		label_1 = new JLabel("MASA NO:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(0, 13, 309, 26);
		getContentPane().add(label_1);
		
		lblToplam = new JLabel("TOPLAM:");
		lblToplam.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblToplam.setBounds(0, 538, 309, 55);
		getContentPane().add(lblToplam);
//YEMEKLER FRAME'Ý		
		JButton btnNewButton = new JButton("YEMEKLER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taslakclass frame2=new taslakclass();
				frame2.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(352, 8, 200, 104);
		getContentPane().add(btnNewButton);
//SOÐUK ÝÇECEKLER		
		JButton btnIecekler = new JButton("SOÐUK ÝÇECEKLER");
		btnIecekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soguk frame2=new soguk();
				frame2.setVisible(true);
			}
		});
		btnIecekler.setBackground(new Color(255, 255, 204));
		btnIecekler.setBounds(352, 118, 200, 104);
		getContentPane().add(btnIecekler);
		
		
		JButton btnNargileler = new JButton("NARG\u0130LELER");
		btnNargileler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nargile frame2=new nargile();
				frame2.setVisible(true);
			}
		});
		btnNargileler.setBackground(new Color(255, 255, 204));
		btnNargileler.setBounds(558, 8, 200, 104);
		getContentPane().add(btnNargileler);
		
		JButton btnSicak = new JButton("SICAK \u0130\u00C7ECEKLER");
		btnSicak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sicak frame2=new sicak();
				frame2.setVisible(true);
			}
		});
		btnSicak.setBackground(new Color(255, 255, 204));
		btnSicak.setBounds(558, 118, 200, 104);
		getContentPane().add(btnSicak);
		
		
		JButton btnBurgerler = new JButton("BURGERLER");
		btnBurgerler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				burger frame2=new burger();
				frame2.setVisible(true);
			}
		});
		btnBurgerler.setBackground(new Color(255, 255, 204));
		btnBurgerler.setBounds(764, 8, 200, 104);
		getContentPane().add(btnBurgerler);
		
		JButton btnSandviler = new JButton("SPESÝYAL ÝÇECEKLER");
		btnSandviler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				spesiyal frame2=new spesiyal();
				frame2.setVisible(true);
			}
		});
		btnSandviler.setBackground(new Color(255, 255, 204));
		btnSandviler.setBounds(764, 118, 200, 104);
		getContentPane().add(btnSandviler);
		
		
		JButton btnSigaralar = new JButton("S\u0130GARALAR");
		btnSigaralar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sigara frame2=new sigara();
				frame2.setVisible(true);
			}
		});
		btnSigaralar.setBackground(new Color(255, 255, 204));
		btnSigaralar.setBounds(970, 8, 200, 104);
		getContentPane().add(btnSigaralar);
		
		JButton btnEkstralar = new JButton("TATLILAR");
		btnEkstralar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tatlilar frame2=new tatlilar();
				
				frame2.setVisible(true);
			}
		});
		btnEkstralar.setBackground(new Color(255, 255, 204));
		btnEkstralar.setBounds(970, 118, 200, 104);
		getContentPane().add(btnEkstralar);
		
		
		JButton btnNewButton_1 = new JButton("S\u0130PAR\u0130\u015E\u0130 \r\nG\u0130R");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(1177, 8, 128, 55);
		getContentPane().add(btnNewButton_1);
		
		JButton btnHesapKapat = new JButton("HESAP KAPAT");
		btnHesapKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    hasilat();
				hesapkapat();
				siparis();
				JOptionPane.showMessageDialog(null, "HESAP KAPANDI" , "HESAP" , JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnHesapKapat.setBackground(new Color(255, 255, 255));
		btnHesapKapat.setBounds(1177, 69, 128, 55);
		getContentPane().add(btnHesapKapat);
		
		JButton btnVazge = new JButton("VAZGE\u00C7");
		btnVazge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    jframe.dispose();
			}
		});
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
				    dlm1.addElement(jtf1.getText());
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
		btnIkram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ikram();
			}
		});
		btnIkram.setBackground(new Color(250, 250, 210));
		btnIkram.setBounds(352, 559, 104, 34);
		getContentPane().add(btnIkram);
		
		JButton btnIade = new JButton("ÝADE");
		btnIade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iade();
			}
		});
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
		btnay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("CAY",2);
			siparis();
			}
		});
		btnay.setBackground(new Color(255, 255, 153));
		btnay.setBounds(365, 379, 67, 50);
		getContentPane().add(btnay);
		
		JButton btnSu = new JButton("SU");
		btnSu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("SU",1);
			siparis();
			}
		});
		btnSu.setBackground(new Color(255, 255, 153));
		btnSu.setBounds(438, 379, 67, 50);
		getContentPane().add(btnSu);
		
		JButton btnKahve = new JButton("KAHVE");
		btnKahve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("KAHVE",6);
			siparis();
			}
		});
		btnKahve.setBackground(new Color(255, 255, 153));
		btnKahve.setBounds(511, 379, 85, 50);
		getContentPane().add(btnKahve);
		
		JButton btnKola = new JButton("KOLA");
		btnKola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("KOLA",5);
			siparis();
			}
		});
		btnKola.setBackground(new Color(255, 255, 153));
		btnKola.setBounds(608, 379, 85, 50);
		getContentPane().add(btnKola);
		
		JButton btnFanta = new JButton("FANTA");
		btnFanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("FANTA",4);
			siparis();
			}
		});
		btnFanta.setBackground(new Color(255, 255, 153));
		btnFanta.setBounds(705, 379, 85, 50);
		getContentPane().add(btnFanta);
		
		JButton btnKriSosluTavuk = new JButton("KÖRÝ SOSLU TAVUK");
		btnKriSosluTavuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("KORI SOSLU TAVUK",25);
			siparis();
			}
		});
		btnKriSosluTavuk.setBackground(new Color(255, 255, 153));
		btnKriSosluTavuk.setBounds(814, 379, 173, 50);
		getContentPane().add(btnKriSosluTavuk);
		
		JButton btnCips = new JButton("CÝPS");
		btnCips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("CIPS",10);
			siparis();
			}
		});
		btnCips.setBackground(new Color(255, 255, 153));
		btnCips.setBounds(365, 440, 91, 50);
		getContentPane().add(btnCips);
		
		JButton btnArabiatta = new JButton("ARABiATTA");
		btnArabiatta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("ARABIATTA",15);
			siparis();
			}
		});
		btnArabiatta.setBackground(new Color(255, 255, 153));
		btnArabiatta.setBounds(473, 440, 104, 50);
		getContentPane().add(btnArabiatta);
		
		JButton btnBonfileIzgara = new JButton("BONFiLE IZGARA");
		btnBonfileIzgara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			veriekle("BONFiLE IZGARA",30);
			siparis();
			}
		});
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
    public void siparisgetir(int i){
	veri=i;
	System.out.println(veri);
	siparis();
    }
	public void siparis() {
		dlm1.clear();
		// Masa a'ya ait sipariþler
		try{
			String sq=masa[veri];
			String sid=id[veri];
			String masam=masa2[veri];
			
			Connection conn = baglan();
			if(conn!=null)
			{   
				dlm_id=new DefaultListModel();
				label_1.setText(masam);
				lblToplam.setText("TOPLAM: "+toplam()+" TL");
				String sql="select "+sid+",tutar,"+sq+" from "+sq+";";
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) // kayit varsa
				{   
					dlm_id.addElement(rs.getInt(sid));
					dlm1.addElement(rs.getString(sq)+" "+rs.getInt("tutar")+"TL");
				}
			}
			taslakclass tas=new taslakclass();
			tas.veridegis(sq);
			nargile nar=new nargile();
			nar.veridegis(sq);
			burger bur=new burger();
			bur.veridegis(sq);
			sigara sig=new sigara();
			sig.veridegis(sq);
			soguk sog=new soguk();
			sog.veridegis(sq);
			sicak sic=new sicak();
			sic.veridegis(sq);
			spesiyal spe=new spesiyal();
			spe.veridegis(sq);
			tatlilar tat=new tatlilar();
			tat.veridegis(sq);
			
			}catch(Exception ex)
			{
				System.out.println(ex);
				
			}
		
	}
     public int toplam() throws SQLException{
	 int top=0;
	 Connection conn=baglan();
	 String sql="select tutar from "+masa[veri]+";";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) // kayit varsa
		{   
			top+=(int)rs.getInt("tutar");
		}
	   return top;
       }
      public void hesapkapat(){
 	   Connection conn =baglan();
		try {
			String sql = "Delete from "+ masa[veri] +" ;";
			
			    
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
				ps.executeUpdate();
				
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
 }
        public void hasilat(){
	    int top=0;
        	 Connection conn =baglan();
     		try {
     			String sql2="select tutar from "+masa[veri]+";";
					Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql2);
					while(rs.next()) // kayit varsa
					{   
						top+=(int)rs.getInt("tutar");
					}
     			String sql = "Insert into toplam(toplam) values(?) ;";
     				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     			    ps.setInt(1,top);
     				ps.executeUpdate();
     			
     		}
     		catch(Exception ex)
     		{
     			System.out.println(ex);
     		}
 }
        public void iade(){
        	
        	Connection conn =baglan();
			try {
				String sql = "delete from "+ masa[veri] +" where "+id[veri]+"=?;";
				int secilen = list1.getSelectedIndex();
				if(secilen>-1)
				{
					int secilen_id = (int) dlm_id.get(secilen); // urunler icin id listesi;
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
					ps.setInt(1,secilen_id);
					ps.executeUpdate();
					siparis();
					
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
        }
        public void ikram(){

        	Connection conn =baglan();
			try {
				String sql = "Update "+ masa[veri] +" set tutar=0 where "+ id[veri] + "=?;";
				int secilen = list1.getSelectedIndex();
				if(secilen>-1)
				{
					int secilen_id = (int) dlm_id.get(secilen); // urunler icin id listesi;
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
					ps.setInt(1,secilen_id);
					ps.executeUpdate();
					siparis();
					
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
}
        public void veriekle(String masam,int a){
        	Connection conn=baglan();
        	try {
        		
        		String sql = "insert into "+masa[veri]+"("+masa[veri]+",tutar) values(?,?);";
        		
        			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
        			ps.setString(1,masam);
        			ps.setInt(2,a);
        		    ps.executeUpdate();
        			
        		
        		
        	}
        	catch(Exception ex)
        	{
        		System.out.println(ex);
        	}
        	
        	}
}

