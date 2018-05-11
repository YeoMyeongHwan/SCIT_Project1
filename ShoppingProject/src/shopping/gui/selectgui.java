package shopping.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.Dimension;

public class selectgui extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	private JButton button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectgui frame = new selectgui();
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
	public selectgui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("관리자 시스템");
		
		JButton btnNewButton = new JButton("회 원 관 리");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		btnNewButton.setBounds(0, 0, 311, 105);
		contentPane.add(btnNewButton);
		
		button = new JButton("물 품 관 리");
		button.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		button.setBounds(0, 100, 311, 105);
		contentPane.add(button);
		
		button_1 = new JButton("배 송 현 황");
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		button_1.setBounds(0, 200, 311, 105);
		contentPane.add(button_1);
		
		button_2 = new JButton("매 출 조 회");
		button_2.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		button_2.setBounds(0, 300, 311, 105);
		contentPane.add(button_2);
		
		setResizable(false);
		
		
	}
}
