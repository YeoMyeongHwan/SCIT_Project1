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

import shopping.dao.ShoppingDAO;
import shopping.vo.Customer;

public class Login extends JFrame implements ActionListener {
	private JTextField tf_ID;
	private JPasswordField tf_pw;
	private JButton btn_login = new JButton("로그인");
	private JButton btn_make = new JButton("회원가입");
	private JComboBox comboBox = new JComboBox();
	private ShoppingDAO dao = new ShoppingDAO();
	static Login frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Login();
					frame.setBounds(100, 100, 300, 300);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
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

			Customer cus = new Customer();
			cus.setId(id);
			cus.setPw(pw);
			
			boolean res = dao.loginCustomer(cus);	// DB에서 id와 pw를 비교하여 true면 접속 or 실패
			if (res) {

				if (catalog.equals("관리자")) {
					JOptionPane.showMessageDialog(this, catalog + " 페이지로 이동하겠습니다");
					Manager mg = new Manager();
					mg.setVisible(true);
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(this, catalog + " 페이지로 이동하겠습니다");
					CustomerGUI ci = new CustomerGUI();
					ci.setVisible(true);
					frame.dispose();
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "아이디 또는 비밀번호를 다시 확인하세요.");
			}
		} else if (e.getSource() == btn_make) {
			frame.setEnabled(false);
			NewCustomer ng = new NewCustomer();
			ng.setVisible(true);
		}
	}
	public void setenable() {
		frame.setEnabled(true);
	}
}
