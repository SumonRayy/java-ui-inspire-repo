package simpleProgs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1256266431693942667L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("A Random SignUp Form");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 250, 455);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMadeBysumonrayy = new JLabel("Made by @sumonrayy");
		lblMadeBysumonrayy.setHorizontalAlignment(SwingConstants.CENTER);
		lblMadeBysumonrayy.setForeground(Color.WHITE);
		lblMadeBysumonrayy.setFont(new Font("Exo", Font.PLAIN, 12));
		lblMadeBysumonrayy.setBounds(10, 113, 230, 50);
		panel.add(lblMadeBysumonrayy);
		
		JLabel lblNewLabel_2 = new JLabel("RANDOM JAVA FORM");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Ink Free", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 90, 230, 50);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(-935, -16, 1280, 760);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/simpleProgs/images/laptop-1478822_1280.jpg")));
		panel.add(lblNewLabel_1);
		
		Button button = new Button("SignUp");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(255, 102, 51));
		button.setBounds(297, 354, 240, 35);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(297, 29, 240, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(260, 332, 314, 28);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(297, 11, 120, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(297, 135, 95, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(297, 160, 240, 35);
		contentPane.add(passwordField);
		
		JLabel lblReenterPassword = new JLabel("RE-ENTER PASSWORD");
		lblReenterPassword.setBounds(297, 206, 178, 14);
		contentPane.add(lblReenterPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(297, 231, 240, 35);
		contentPane.add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(299, 298, 77, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(414, 298, 95, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(299, 277, 79, 14);
		contentPane.add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(297, 89, 240, 35);
		contentPane.add(textField_2);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(297, 74, 79, 14);
		contentPane.add(lblEmail);
	}
}
