package shopping.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import shopping.dao.ShoppingDAO;
import shopping.vo.Customer;

public class NewCustomerGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel labed_title;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField tf_name;
	private JTextField tf_birth;
	private JTextField tf_id;
	private JTextField tf_phone;
	private JTextField tf_address;
	private JTextField tf_email;
	private JButton btn_checkid;
	private JButton btn_cancel;
	private JLabel label_6;
	private JPasswordField tf_password;
	private JPasswordField tf_repassword;
	private JButton btn_ok;
	private ShoppingDAO dao = new ShoppingDAO();
	private boolean id_check = false;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public NewCustomerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 660);
		setTitle("회원가입");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		labed_title = new JLabel("****************회원 가입****************");
		labed_title.setFont(new Font("굴림", Font.BOLD, 20));
		labed_title.setBounds(14, 12, 486, 32);
		contentPane.add(labed_title);

		lblNewLabel_1 = new JLabel("이름*   :");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(25, 70, 77, 32);
		contentPane.add(lblNewLabel_1);

		label = new JLabel("생년월일*   :");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		label.setBounds(25, 130, 141, 32);
		contentPane.add(label);

		label_1 = new JLabel("아이디*   :");
		label_1.setFont(new Font("굴림", Font.BOLD, 18));
		label_1.setBounds(25, 190, 104, 32);
		contentPane.add(label_1);

		label_2 = new JLabel("비밀번호*   :");
		label_2.setFont(new Font("굴림", Font.BOLD, 18));
		label_2.setBounds(25, 250, 120, 32);
		contentPane.add(label_2);

		label_3 = new JLabel("핸드폰번호*  :");
		label_3.setFont(new Font("굴림", Font.BOLD, 18));
		label_3.setBounds(25, 370, 141, 32);
		contentPane.add(label_3);

		label_4 = new JLabel("주소*   :");
		label_4.setFont(new Font("굴림", Font.BOLD, 18));
		label_4.setBounds(25, 420, 77, 32);
		contentPane.add(label_4);

		label_5 = new JLabel("이메일   :");
		label_5.setFont(new Font("굴림", Font.BOLD, 18));
		label_5.setBounds(25, 480, 104, 32);
		contentPane.add(label_5);

		tf_name = new JTextField();
		tf_name.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		tf_name.setBounds(180, 70, 116, 24);
		contentPane.add(tf_name);
		tf_name.setColumns(10);

		tf_birth = new JTextField();
		tf_birth.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		tf_birth.setColumns(10);
		tf_birth.setBounds(180, 130, 116, 24);
		contentPane.add(tf_birth);

		tf_id = new JTextField();
		tf_id.setBounds(180, 190, 116, 24);
		contentPane.add(tf_id);
		tf_id.setColumns(10);

		tf_phone = new JTextField();
		tf_phone.setColumns(10);
		tf_phone.setBounds(180, 370, 116, 24);
		contentPane.add(tf_phone);

		tf_address = new JTextField();
		tf_address.setColumns(10);
		tf_address.setBounds(180, 420, 292, 24);
		contentPane.add(tf_address);

		tf_email = new JTextField();
		tf_email.setColumns(10);
		tf_email.setBounds(180, 480, 292, 24);
		contentPane.add(tf_email);

		btn_checkid = new JButton("중복확인*");
		btn_checkid.setBounds(337, 190, 105, 27);
		contentPane.add(btn_checkid);

		btn_cancel = new JButton("취소");
		btn_cancel.setBounds(290, 570, 105, 27);
		contentPane.add(btn_cancel);

		label_6 = new JLabel("재입력*   :");
		label_6.setFont(new Font("굴림", Font.BOLD, 18));
		label_6.setBounds(25, 310, 120, 32);
		contentPane.add(label_6);

		tf_password = new JPasswordField();
		tf_password.setBounds(180, 250, 116, 24);
		contentPane.add(tf_password);

		tf_repassword = new JPasswordField();
		tf_repassword.setBounds(180, 310, 116, 24);
		contentPane.add(tf_repassword);

		btn_ok = new JButton("회원가입");
		btn_ok.setForeground(Color.BLACK);
		btn_ok.setBackground(Color.WHITE);
		btn_ok.setBounds(120, 570, 105, 27);
		contentPane.add(btn_ok);

		btn_checkid.addActionListener(this); // 메인클래스가 ActionListener
		btn_ok.addActionListener(this);
		btn_cancel.addActionListener(this);

		setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_checkid) {
			String id = tf_id.getText();
			if (dao.checkCustomerID(id) && !id.equals("")) {
				JOptionPane.showMessageDialog(this, "사용가능한 ID입니다.");
				id_check = true;
			} else {
				JOptionPane.showMessageDialog(this, "사용할수 없는 ID입니다.");
			}
		} else if (e.getSource() == btn_ok) { // 객체변수명으로 비교
			if (id_check = true) {
				String pw = tf_password.getText();
				String pw2 = tf_repassword.getText();
				if (pw.equals(pw2) && !pw.equals("")) {
					if (!tf_name.getText().equals("") && !tf_address.getText().equals("")
							&& !tf_phone.getText().equals("")) {
						String id = tf_id.getText();
						String birth = tf_birth.getText();
						String name = tf_name.getText();
						String phone = tf_phone.getText();
						String email = tf_email.getText();
						String address = tf_address.getText();
						
						if(email.equals(""))
							email = "";
						else if(birth.equals(""))
							birth = "";
						Customer cus = new Customer(id, pw, name, birth, address, phone, email);
						if (dao.insertCustomer(cus)) {
							JOptionPane.showMessageDialog(this, "회원가입이 완료되었습니다.");
							dispose();
						}
					}else {
						JOptionPane.showMessageDialog(this, "필수항목을 확인해주세요.");
					}
				} else {
					JOptionPane.showMessageDialog(this, "비밀번호를 확인해주세요.");
				}
			} else {
				JOptionPane.showMessageDialog(this, "ID 중복검사를 해주세요.");
			}
		} else if (e.getSource() == btn_cancel) {
			LoginGUI lg = new LoginGUI();
			lg.setenable();
			dispose();
		}
	}
}
