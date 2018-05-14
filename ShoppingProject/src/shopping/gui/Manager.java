package shopping.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import java.awt.Dimension;

public class Manager extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btn_itemlist;
	private JButton btn_payment;
	private JButton btn_sales;
	private JButton btn_customerlist;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Manager() {
		init();
	}
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("관리자 시스템");
		
		btn_customerlist = new JButton("회 원 관 리");
		btn_customerlist.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		btn_customerlist.setBounds(0, 0, 311, 105);
		contentPane.add(btn_customerlist);
		
		btn_itemlist = new JButton("물 품 관 리");
		btn_itemlist.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		btn_itemlist.setBounds(0, 100, 311, 105);
		contentPane.add(btn_itemlist);
		
		btn_payment = new JButton("배 송 현 황");
		btn_payment.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		btn_payment.setBounds(0, 200, 311, 105);
		contentPane.add(btn_payment);
		
		btn_sales = new JButton("매 출 조 회");
		btn_sales.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		btn_sales.setBounds(0, 300, 311, 105);
		contentPane.add(btn_sales);
		
		setResizable(false);
		btn_customerlist.addActionListener(this);
		btn_itemlist.addActionListener(this);
		btn_payment.addActionListener(this);
		btn_sales.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_customerlist) {
			JOptionPane.showMessageDialog(this, btn_customerlist.getText() + " 페이지로 이동하겠습니다");
			CustomerManager cig = new CustomerManager();
		} else if (e.getSource() == btn_itemlist) {
			JOptionPane.showMessageDialog(this, btn_itemlist.getText() + " 페이지로 이동하겠습니다");
			ItemManager im = new ItemManager();
		} else if (e.getSource() == btn_payment) {
			
		} else if (e.getSource() == btn_sales) {
			
		}
	}
	public void setenable() {
		setEnabled(true);
	}
}
