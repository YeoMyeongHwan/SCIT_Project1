package shopping.gui;
import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.Scrollbar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class CustomerGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton button_1;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */

	

	/**
	 * Create the frame.
	 */
	public CustomerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("상 품 판 매");
		setBounds(100, 100, 500, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("장바구니");
		btnNewButton.setBounds(290, 164, 90, 30);
		contentPane.add(btnNewButton);
		
		button_1 = new JButton("삭제");
		button_1.setBounds(290, 425, 90, 30);
		contentPane.add(button_1);
		
		JButton button = new JButton("결제");
		button.addActionListener((ActionListener) this);
		button.setActionCommand("");
		button.setBounds(290, 383, 90, 30);
		contentPane.add(button);
		
		btnNewButton_1 = new JButton("내 정보");
		btnNewButton_1.setBounds(359, 12, 105, 27);
		contentPane.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 103, 270, 170);
		contentPane.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		lblNewLabel = new JLabel("     상 품 ID  /  상 품 명  /  상 품 가 격");
		scrollPane.setColumnHeaderView(lblNewLabel);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(14, 346, 262, 142);
		contentPane.add(scrollPane_1);
		
		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		lblNewLabel_2 = new JLabel("     상 품 ID  /  상 품 명  /  상 품 가 격");
		scrollPane_1.setColumnHeaderView(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("장바구니");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel_1.setBounds(90, 304, 105, 30);
		contentPane.add(lblNewLabel_1);
		
		label = new JLabel("판매 목록");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		label.setBounds(90, 61, 105, 30);
		contentPane.add(label);
		
		JScrollPane scroll = new JScrollPane();
	     scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
	}
}
