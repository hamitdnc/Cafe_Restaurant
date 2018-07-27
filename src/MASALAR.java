import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pack.UseBean;

import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.awt.event.ActionEvent;


public class MASALAR extends JFrame {
    String[] masa={"masaa","masab","masac","masad","masae","masaf","masag","masah","masai","masaj","masak","masal","masam","masan","masao","masap"};
    String[] masa2={"MASA-A","MASA-B","MASA-C","MASA-D"
    		+ "MASA-E","MASA-F","MASA-G","MASA-H","MASA-I","MASA-J","MASA-K","MASA-L","MASA-M","MASA-N","MASA-O","MASA-P"};
    String[] id={"ida","idb","idc","idd","ide","idf","idg","idh","idi","idj","idk","idl","idm","idn","ido","idp"};
	private static MASALAR frame;

	public class java {

	}
	 public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frame = new MASALAR();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
		}
	public MASALAR() {
		setTitle("MASALAR");
		getContentPane().setBackground(new Color(255, 255, 255));
		setAutoRequestFocus(true);
		
		setBounds(100, 100, 1107, 532);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("MASA-A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame2=new siparisler();
				frame2.siparisgetir(0);
				frame2.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(0, 0, 155, 93);
		getContentPane().add(btnNewButton);
		
		JButton btnMasab = new JButton("MASA-B");
		btnMasab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame3=new siparisler();
				frame3.siparisgetir(1);
				frame3.setVisible(true);
			
			
			}
		});
		btnMasab.setBackground(new Color(255, 255, 204));
		btnMasab.setBounds(155, 0, 155, 93);
		getContentPane().add(btnMasab);
		
		JButton btnMasac = new JButton("MASA-C");
		btnMasac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame4=new siparisler();
				frame4.siparisgetir(2);
				frame4.setVisible(true);
			
				
			}
		});
		btnMasac.setBackground(new Color(255, 255, 204));
		btnMasac.setBounds(310, 0, 155, 93);
		getContentPane().add(btnMasac);
		
		JButton btnMasad = new JButton("MASA-D");
		btnMasad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame5=new siparisler();
				frame5.siparisgetir(3);
				frame5.setVisible(true);
		
				
			}
		});
		btnMasad.setBackground(new Color(255, 255, 204));
		btnMasad.setBounds(465, 0, 155, 93);
		getContentPane().add(btnMasad);
		
		JButton btnMasae = new JButton("MASA-E");
		btnMasae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame6=new siparisler();
				frame6.siparisgetir(4);
				frame6.setVisible(true);
				
			}
		});
		btnMasae.setBackground(new Color(255, 255, 204));
		btnMasae.setBounds(620, 0, 155, 93);
		getContentPane().add(btnMasae);
		
		JButton btnMasaf = new JButton("MASA-F");
		btnMasaf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame7=new siparisler();
				frame7.siparisgetir(5);
				frame7.setVisible(true);

			
			}
		});
		btnMasaf.setBackground(new Color(255, 255, 204));
		btnMasaf.setBounds(775, 0, 155, 93);
		getContentPane().add(btnMasaf);
		
		JButton btnMasag = new JButton("MASA-G");
		btnMasag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame8=new siparisler();
				frame8.siparisgetir(6);
				frame8.setVisible(true);

			}
		});
		btnMasag.setBackground(new Color(255, 255, 204));
		btnMasag.setBounds(930, 0, 155, 93);
		getContentPane().add(btnMasag);
		
		JButton btnMasah = new JButton("MASA-H");
		btnMasah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame9=new siparisler();
				frame9.siparisgetir(7);
				frame9.setVisible(true);

			}
		});
		btnMasah.setBackground(new Color(255, 255, 204));
		btnMasah.setBounds(0, 93, 155, 93);
		getContentPane().add(btnMasah);
		
		JButton btnMasai = new JButton("MASA-I");
		btnMasai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame10=new siparisler();
				frame10.siparisgetir(8);
				frame10.setVisible(true);

			}
		});
		btnMasai.setBackground(new Color(255, 255, 204));
		btnMasai.setBounds(155, 93, 155, 93);
		getContentPane().add(btnMasai);
		
		JButton btnMasaj = new JButton("MASA-J");
		btnMasaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame11=new siparisler();
				frame11.siparisgetir(9);
				frame11.setVisible(true);

			}
		});
		btnMasaj.setBackground(new Color(255, 255, 204));
		btnMasaj.setBounds(310, 93, 155, 93);
		getContentPane().add(btnMasaj);
		
		JButton btnMasak = new JButton("MASA-K");
		btnMasak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame12=new siparisler();
				frame12.siparisgetir(10);
				frame12.setVisible(true);

			}
		});
		btnMasak.setBackground(new Color(255, 255, 204));
		btnMasak.setBounds(465, 93, 155, 93);
		getContentPane().add(btnMasak);
		
		JButton btnMasal = new JButton("MASA-L");
		btnMasal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame13=new siparisler();
				frame13.siparisgetir(11);
				frame13.setVisible(true);

			}
		});
		btnMasal.setBackground(new Color(255, 255, 204));
		btnMasal.setBounds(620, 93, 155, 93);
		getContentPane().add(btnMasal);
		
		JButton btnMasam = new JButton("MASA-M");
		btnMasam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame14=new siparisler();
				frame14.siparisgetir(12);
				frame14.setVisible(true);

			}
		});
		btnMasam.setBackground(new Color(255, 255, 204));
		btnMasam.setBounds(775, 93, 155, 93);
		getContentPane().add(btnMasam);
		
		JButton btnMasan = new JButton("MASA-N");
		btnMasan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame15=new siparisler();
				frame15.siparisgetir(13);
				frame15.setVisible(true);

			}
		});
		btnMasan.setBackground(new Color(255, 255, 204));
		btnMasan.setBounds(930, 93, 155, 93);
		getContentPane().add(btnMasan);
		
		JButton btnMasao = new JButton("MASA-O");
		btnMasao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame16=new siparisler();
				frame16.siparisgetir(14);
				frame16.setVisible(true);
			}
		});
		btnMasao.setBackground(new Color(255, 255, 204));
		btnMasao.setBounds(0, 186, 155, 93);
		getContentPane().add(btnMasao);
		
		JButton btnMasap = new JButton("MASA-P");
		btnMasap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisler frame17=new siparisler();
				frame17.siparisgetir(15);
				frame17.setVisible(true);
			}
		});
		btnMasap.setBackground(new Color(255, 255, 204));
		btnMasap.setBounds(155, 186, 155, 93);
		getContentPane().add(btnMasap);
		
		
		JButton btnMasaKapat = new JButton("MASA DEGISTIR");
		btnMasaKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				masadegis masa=new masadegis();
			}
		});
		btnMasaKapat.setBackground(new Color(204, 153, 255));
		btnMasaKapat.setBounds(775, 435, 155, 50);
		getContentPane().add(btnMasaKapat);
		
		JButton btnk = new JButton("CIKIÞ");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnk.setBackground(new Color(255, 0, 102));
		btnk.setBounds(930, 435, 155, 50);
		getContentPane().add(btnk);
	}

}

