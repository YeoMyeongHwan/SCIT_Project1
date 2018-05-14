package shopping.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import shopping.vo.Customer;
import shopping.vo.Item;

public class ShoppingDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	private SqlSession session = null;
	private int res = 0;
	public boolean loginCustomer(Customer customer) {
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			res = mapper.loginCustomer(customer);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		if (res != 0)
			return true;
		else
			return false;
	}
	public boolean checkCustomerID(String id) {
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			res = mapper.checkCustomerID(id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		if (res == 0)
			return true;
		else
			return false;
	}
	public boolean insertCustomer(Customer customer) {
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			res = mapper.insertCustomer(customer);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		if (res != 0)
			return true;
		else
			return false;
	}
	public ArrayList<Customer> selectAllCustomer() {
		ArrayList<Customer> customers = new ArrayList<>();
		Customer cus = new Customer();
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			customers = (mapper.selectAllCustomer());
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return customers;
	}
	public ArrayList<Item> selectAllItem(){
		ArrayList<Item> items = new ArrayList<>();
		Item item = new Item();
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			items = (mapper.selectAllItem());
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return items;
	}
	public boolean insertItem(Item item){
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			res = mapper.insertItem(item);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		if (res != 0)
			return true;
		else
			return false;
	}
	public boolean updateItem(Item item) {
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			res = mapper.updateItem(item);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		if (res != 0)
			return true;
		else
			return false;
	}
	public boolean deleteItem(String itemNo) {
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			res = mapper.deleteItem(itemNo);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		if (res != 0)
			return true;
		else
			return false;
	}
}
