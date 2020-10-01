package simpleProgs;

import javax.swing.*;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

public class LoginForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3031166406454909019L;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();

					frame.setSize(300, 140);
					frame.setLocationRelativeTo(null);
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
	public LoginForm() {
		Font font1 = new Font("Monospaced", Font.PLAIN, 16);

		setLayout(new GridLayout(3, 2, 5, 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFont(font1);
		setTitle("Login Form");

		add(new JLabel("Username: "));
		add(new JTextField(8));
		add(new JLabel("Password: "));
		add(new JPasswordField(8));
		add(new JButton("Login"));
		add(new JButton("Register"));

	}

}
