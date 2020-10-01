package com.sumonrayy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;

public class MainUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2164571597142553015L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					
					frame.setTitle("Weather Application");
					frame.setUndecorated(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 102));
		panel.setBounds(0, 0, 130, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setBackground(new Color(51, 51, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 133, 110, 32);
		panel.add(lblNewLabel);
		
		JLabel lblSettings = new JLabel("LOCATION");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setBounds(10, 176, 110, 32);
		panel.add(lblSettings);
		
		JLabel label = new JLabel("SETTINGS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setBounds(10, 219, 110, 32);
		panel.add(label);
		
		JLabel lblLogout = new JLabel("LOGOUT");
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setForeground(Color.WHITE);
		lblLogout.setBounds(10, 256, 110, 32);
		panel.add(lblLogout);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setBounds(-48, 133, 178, 32);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon(MainUI.class.getResource("/com/sumonrayy/images/vector-clouds-png-cloud.png")));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-21, 0, 164, 114);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(MainUI.class.getResource("/com/sumonrayy/images/icons8-cloud-100.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 153, 255));
		panel_1.setBounds(129, 0, 707, 522);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(716, 120, -725, -5);
		panel_1.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainUI.class.getResource("/com/sumonrayy/images/icons8-night-96.png")));
		lblNewLabel_1.setBounds(501, 156, 108, 104);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Partly Cloudy");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 204, 255));
		lblNewLabel_2.setFont(new Font("Ink Free", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(208, 181, 220, 79);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblC = new JLabel("28\u00B0 C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setForeground(new Color(255, 204, 255));
		lblC.setFont(new Font("Exo", Font.PLAIN, 30));
		lblC.setBounds(41, 181, 138, 79);
		panel_1.add(lblC);
		
		JLabel lblNewLabel_3 = new JLabel("TODAY");
		lblNewLabel_3.setForeground(new Color(255, 204, 255));
		lblNewLabel_3.setFont(new Font("Exo", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(40, 156, 72, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblTomorrow = new JLabel("TOMORROW");
		lblTomorrow.setForeground(new Color(255, 204, 255));
		lblTomorrow.setFont(new Font("Exo", Font.PLAIN, 14));
		lblTomorrow.setBounds(40, 322, 108, 14);
		panel_1.add(lblTomorrow);
		
		JLabel lblC_1 = new JLabel("23\u00B0 C");
		lblC_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_1.setForeground(new Color(255, 204, 255));
		lblC_1.setFont(new Font("Exo", Font.PLAIN, 30));
		lblC_1.setBounds(41, 347, 138, 79);
		panel_1.add(lblC_1);
		
		JLabel lblSmallBreeze = new JLabel("Drizzle");
		lblSmallBreeze.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmallBreeze.setForeground(new Color(255, 204, 255));
		lblSmallBreeze.setFont(new Font("Ink Free", Font.PLAIN, 30));
		lblSmallBreeze.setBounds(208, 347, 220, 79);
		panel_1.add(lblSmallBreeze);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(MainUI.class.getResource("/com/sumonrayy/images/icons8-rain-96.png")));
		label_4.setBounds(501, 322, 108, 104);
		panel_1.add(label_4);
		
		JLabel lblNewLabel_5 = new JLabel("JAVA WEATHER");
		lblNewLabel_5.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 30));
		lblNewLabel_5.setForeground(new Color(255, 255, 204));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(-48, -34, 359, 114);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(MainUI.class.getResource("/com/sumonrayy/images/icons8-windsock-64.png")));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(340, 38, 72, 77);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("6 km/h");
		lblNewLabel_7.setFont(new Font("Exo", Font.PLAIN, 14));
		lblNewLabel_7.setForeground(new Color(255, 255, 204));
		lblNewLabel_7.setBounds(422, 59, 87, 32);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("Asansol , WB, India");
		lblNewLabel_9.setIcon(new ImageIcon(MainUI.class.getResource("/com/sumonrayy/images/icons8-region-16.png")));
		lblNewLabel_9.setFont(new Font("Exo", Font.PLAIN, 17));
		lblNewLabel_9.setForeground(new Color(255, 204, 255));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(1, 38, 188, 32);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(1, 0, 750, 531);
		panel_1.add(lblNewLabel_10);
		lblNewLabel_10.setIcon(new ImageIcon(MainUI.class.getResource("/com/sumonrayy/images/download.png")));
	}
}
