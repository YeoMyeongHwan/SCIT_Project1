package shopping.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import shopping.dao.ShoppingDAO;
import shopping.vo.Customer;

public class CustomerManager extends JFrame implements ActionListener{
	private JButton btn_check;
	private JButton btn_close;
	private ShoppingDAO dao = new ShoppingDAO();
	private JTable table;
	private JFrame frame = new JFrame("회원 관리");
	/**
	 * Create the frame.
	 */
	public CustomerManager() {
		init();
	}
	public void init() {
		frame.setPreferredSize(new Dimension(600, 250));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();

		String colNames[] = { "회원ID", "비번", "이름", "생년월일", "주소", "전화번호", "이메일" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		table = new JTable(model);

		int widths[] = { 90, 90, 170 };
		for (int i = 0; i < 3; i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth(widths[i]);
		}

		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

		btn_check = new JButton("조 회");
		btn_check.setFont(new Font("맑은 고딕", Font.BOLD, 17));

		JPanel panel2 = new JPanel();
		btn_check.setSize(300, 300);
		panel2.add(btn_check);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		panel.add(panel2, BorderLayout.SOUTH);
		
		btn_close = new JButton("닫 기");
		btn_close.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		panel2.add(btn_close);
		contentPane.add(panel, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		btn_check.addActionListener(this);
		btn_close.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_check) {
			ArrayList<Customer> customers = dao.selectAllCustomer();	//원본데이터를 건들지 않고 table의 매개변수인 model에 있는 데이터를 변경합니다
			//테이블에 데이터 추가하기

			DefaultTableModel m = (DefaultTableModel)table.getModel();	//모델에 데이터 추가 , 1번째 출에 새로운 데이터를 추가합니다

			for(int i = 0; i < customers.size(); i++)
				m.insertRow(i, new Object[]{customers.get(i).getId(), customers.get(i).getPassword(), customers.get(i).getName(), customers.get(i).getBirth()
											,customers.get(i).getAddress(), customers.get(i).getPhone(), customers.get(i).getEmail()});
		    table.updateUI();	//추가를 마치고 데이터 갱신을 알립니다.
		}else if(e.getSource() == btn_close) {
			frame.dispose();
		}
	}
}