package shopping.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import shopping.dao.ShoppingDAO;
import shopping.vo.Item;

public class ItemManager extends JFrame implements ActionListener, MouseListener{
	private JLabel label;
	private JTextField tf_name;
	private JLabel label_1;
	private JTextField tf_price;
	private JButton btn_add;
	private JButton btn_edit;
	private JButton btn_del;
	private JButton btn_close;
	private ShoppingDAO dao = new ShoppingDAO();
	private JTable table;
	private JFrame frame = new JFrame("배송 현황d");
	private DefaultTableModel m ;
	
	public ItemManager() {
		init();
	}
	public void init() {
		frame.setTitle("물 품 관 리");
		frame.setPreferredSize(new Dimension(420, 300));
		frame.setLocation(500, 400);
		frame.setResizable(false);
		Container contentPane = frame.getContentPane();

		String colNames[] = { "상품ID",  "상품명", "가격" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0) ;
		
		table = new JTable(model);
		
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
		
		label = new JLabel("상품명 :");
		label.setBounds(40, 15, 62, 18);
		panel.add(label);
		
		tf_name = new JTextField();
		tf_name.setBounds(91, 13, 80, 24);
		panel.add(tf_name);
		tf_name.setColumns(10);
		
		label_1 = new JLabel("가격 :");
		label_1.setBounds(219, 15, 47, 18);
		panel.add(label_1);
		
		tf_price = new JTextField();
		tf_price.setBounds(260, 13, 80, 24);
		panel.add(tf_price);
		tf_price.setColumns(10);
		
		btn_add = new JButton("추가");
		btn_add.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btn_add.setBounds(12, 55, 80, 27);
		panel.add(btn_add);
		
		btn_edit = new JButton("수정");
		btn_edit.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btn_edit.setBounds(104, 55, 80, 27);
		panel.add(btn_edit);
		
		btn_del = new JButton("삭제");
		btn_del.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btn_del.setBounds(209, 55, 80, 27);
		panel.add(btn_del);
		
		btn_close = new JButton("닫기");
		btn_close.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btn_close.setBounds(308, 55, 80, 27);
		panel.add(btn_close);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);		
		
		btn_add.addActionListener(this);
		btn_edit.addActionListener(this);
		btn_del.addActionListener(this);
		btn_close.addActionListener(this);
		selectAllItem();
		
		table.addMouseListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_add) {
			if(!tf_name.getText().isEmpty() && !tf_price.getText().isEmpty()) {
				String name = tf_name.getText();
				String price = tf_price.getText();
				
				Item item = new Item(name, price);
				if (dao.insertItem(item)) {
					JOptionPane.showMessageDialog(this, "상품추가가 완료되었습니다.");
					selectAllItem();
					tf_name.setText("");
					tf_price.setText("");
				}else
					JOptionPane.showMessageDialog(this, "상품추가 실패.. 개발자도 떨고있습니다..");
			}
			else
				JOptionPane.showMessageDialog(this, "빈칸을 입력해주세요.");
		}else if(e.getSource() == btn_edit) {
			int row = table.getSelectedRow();
			String no = (String) m.getValueAt(row, 0);
			String name = tf_name.getText();
			String price = tf_price.getText();
			
			Item item = new Item(no, name, price);
			if(dao.updateItem(item)) {
				JOptionPane.showMessageDialog(this, "상품수정가 완료되었습니다.");
				selectAllItem();
				tf_name.setText("");
				tf_price.setText("");
			}else
				JOptionPane.showMessageDialog(this, "상품수정 실패.. 개발자도 떨고있습니다..");
		}else if(e.getSource() == btn_del) {
			int row = table.getSelectedRow();
			String no = (String) m.getValueAt(row, 0);
			
			if(dao.deleteItem(no)) {
				JOptionPane.showMessageDialog(this, "상품삭제가 완료되었습니다.");
				selectAllItem();
				tf_name.setText("");
				tf_price.setText("");
			}else
				JOptionPane.showMessageDialog(this, "상품삭제 실패.. 개발자도 떨고있습니다..");
		}else if(e.getSource() == btn_close) {
			frame.dispose();
		}
		
	}
	public void selectAllItem() {
		dao.selectAllItem();
		ArrayList<Item> items = dao.selectAllItem();
		//테이블에 데이터 추가하기
		m = (DefaultTableModel)table.getModel();	//모델에 데이터 추가 , 1번째 출에 새로운 데이터를 추가합니다
		m.setRowCount(0);

		for(int i = 0; i < items.size(); i++)
			m.insertRow(i, new Object[]{items.get(i).getItemNo(), items.get(i).getItemName(), items.get(i).getPrice()});
	    table.updateUI();
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		int row = table.getSelectedRow();
		tf_name.setText((String) m.getValueAt(row, 1));
		tf_price.setText((String) m.getValueAt(row, 2));
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	}
}
