package shopping.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyInfoGUI extends JFrame {

	private JPanel contentPane;
	private JLabel labed_title;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textField;
	private JTextField tf_barth;
	private JTextField tf_id;
	private JTextField tf_phone;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button;
	private JPasswordField passwordField;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public MyInfoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 592);
		setTitle("내 정보");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labed_title = new JLabel("*****************내 정보****************");
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
		label_3.setBounds(25, 310, 141, 32);
		contentPane.add(label_3);
		
		label_4 = new JLabel("주소*   :");
		label_4.setFont(new Font("굴림", Font.BOLD, 18));
		label_4.setBounds(25, 430, 77, 32);
		contentPane.add(label_4);
		
		label_5 = new JLabel("이메일   :");
		label_5.setFont(new Font("굴림", Font.BOLD, 18));
		label_5.setBounds(25, 370, 104, 32);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		textField.setBounds(180, 70, 116, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		tf_barth = new JTextField();
		tf_barth.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		tf_barth.setColumns(10);
		tf_barth.setBounds(180, 130, 116, 24);
		contentPane.add(tf_barth);
		
		tf_id = new JTextField();
		tf_id.setBounds(180, 190, 116, 24);
		contentPane.add(tf_id);
		tf_id.setColumns(10);
		
		tf_phone = new JTextField();
		tf_phone.setColumns(10);
		tf_phone.setBounds(180, 310, 116, 24);
		contentPane.add(tf_phone);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 370, 292, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 430, 292, 24);
		contentPane.add(textField_2);
		
		button = new JButton("취소");
		button.setBounds(290, 510, 105, 27);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 250, 116, 24);
		contentPane.add(passwordField);
		
		button_1 = new JButton("확인");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(120, 510, 105, 27);
		contentPane.add(button_1);
		setResizable(false);
	}

}
