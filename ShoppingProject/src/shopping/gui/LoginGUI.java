package shopping.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI extends JFrame implements ActionListener {
	private JTextField tf_ID;
	private JPasswordField tf_pw;
	private JButton btn_login = new JButton("로그인");
	private JButton btn_make = new JButton("회원가입");
	private JComboBox comboBox = new JComboBox();
	static LoginGUI frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame = new LoginGUI();
					frame.setBounds(100, 100, 300, 300);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginGUI() {
		init();
	}

	public void init() {
		getContentPane().setLayout(null);

		JLabel Label_list = new JLabel("\uB85C\uADF8\uC778 \uBAA9\uB85D:");
		Label_list.setBounds(25, 60, 75, 15);
		getContentPane().add(Label_list);

		JLabel Label_ID = new JLabel("\uC544\uC774\uB514:");
		Label_ID.setBounds(25, 99, 75, 15);
		getContentPane().add(Label_ID);

		JLabel Label_pw = new JLabel("\uBE44\uBC00\uBC88\uD638:");
		Label_pw.setBounds(25, 140, 75, 15);
		getContentPane().add(Label_pw);
		
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uAD00\uB9AC\uC790", "\uD68C\uC6D0" }));
		comboBox.setBounds(130, 57, 120, 21);
		getContentPane().add(comboBox);

		tf_ID = new JTextField();
		tf_ID.setBounds(130, 96, 120, 21);
		getContentPane().add(tf_ID);
		tf_ID.setColumns(10);

		tf_pw = new JPasswordField();
		tf_pw.setBounds(130, 137, 120, 21);
		getContentPane().add(tf_pw);

		btn_login.setBounds(25, 210, 97, 23);
		getContentPane().add(btn_login);
		
		btn_make.setBounds(153, 210, 97, 23);
		getContentPane().add(btn_make);

		btn_login.addActionListener(this); // 메인클래스가 ActionListener
		btn_make.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_login) { // 객체변수명으로 비교
			String catalog = comboBox.getSelectedItem().toString();
			String id = tf_ID.getText();
			String pw = tf_pw.getText();

			//DB에서 id와 pw를 비교하여 true면 접속 or 실패
			JOptionPane.showMessageDialog(this, catalog+" 페이지로 이동하겠습니다");
			if(catalog.equals("관리자")) {
				ManagerGUI mg = new ManagerGUI();
				mg.setVisible(true);
			}else {
				CustomerGUI ci = new CustomerGUI();
				ci.setVisible(true);
			}
			frame.dispose();
		} else if (e.getSource() == btn_make) {
			NewCustomerGUI ng = new NewCustomerGUI();
			ng.setVisible(true);
		}
	}
}
