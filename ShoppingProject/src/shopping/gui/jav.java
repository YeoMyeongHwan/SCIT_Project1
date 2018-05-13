package shopping.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class jav extends JFrame {
	private JTextField textField;
	private JLabel label;
	private JTextField textField_1;
	private JLabel label_1;
	private JTextField textField_2;
	private JButton button;
	private JButton button_1;
	private JButton button_2;

	public jav() {
		JFrame frame = new JFrame("배송 현황");
		frame.setTitle("물 품 관 리");
		frame.setPreferredSize(new Dimension(420, 300));
		frame.setLocation(500, 400);
		frame.setResizable(false);
		Container contentPane = frame.getContentPane();

		String colNames[] = { "상품ID",  "상품명", "가격" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);

		int widths[] = { 90, 90, 170 };
		for (int i = 0; i < 3; i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth(widths[i]);
		}
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 414, 160);
		contentPane.add(scrollPane);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 160, 414, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblid = new JLabel("상품ID :");
		lblid.setBounds(0, 15, 62, 18);
		panel.add(lblid);
		
		textField = new JTextField();
		textField.setBounds(55, 13, 62, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		label = new JLabel("상품명 :");
		label.setBounds(131, 15, 62, 18);
		panel.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 13, 80, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		label_1 = new JLabel("가격 :");
		label_1.setBounds(276, 15, 47, 18);
		panel.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(320, 13, 68, 24);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		button = new JButton("추가");
		button.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		button.setBounds(65, 55, 80, 27);
		panel.add(button);
		
		button_1 = new JButton("수정");
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		button_1.setBounds(160, 55, 80, 27);
		panel.add(button_1);
		
		button_2 = new JButton("삭제");
		button_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		button_2.setBounds(255, 55, 80, 27);
		panel.add(button_2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}
}
