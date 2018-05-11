package shopping.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.Font;

public class CustomerInfoGUI extends JFrame {

	/**
	 * Create the frame.
	 */
	public CustomerInfoGUI() {
		JFrame frame = new JFrame("회원 관리");
		frame.setPreferredSize(new Dimension(420, 250));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();

		String colNames[] = { "회원ID", "비번", "생년월일", "주소", "전화번호", "이메일" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);

		int widths[] = { 90, 90, 170 };
		for (int i = 0; i < 3; i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth(widths[i]);
		}

		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

		JButton button1 = new JButton("조 회");
		button1.setFont(new Font("맑은 고딕", Font.BOLD, 17));

		JPanel panel2 = new JPanel();
		button1.setSize(300, 300);
		panel2.add(button1);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		panel.add(panel2, BorderLayout.SOUTH);
		contentPane.add(panel, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}