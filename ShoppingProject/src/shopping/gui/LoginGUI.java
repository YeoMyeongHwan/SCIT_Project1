package shopping.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginGUI extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.getContentPane().setBackground(Color.PINK);
					frame.setBounds(100, 100, 300, 300);
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
	public LoginGUI() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 \uBAA9\uB85D:");
		lblNewLabel.setBounds(25, 70, 75, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514:");
		lblNewLabel_1.setBounds(25, 118, 75, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638:");
		lblNewLabel_2.setBounds(25, 170, 75, 15);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uAD00\uB9AC\uC790", "\uD68C\uC6D0"}));
		comboBox.setBounds(112, 67, 120, 21);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(112, 115, 120, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 167, 120, 21);
		getContentPane().add(passwordField);

	}
}
