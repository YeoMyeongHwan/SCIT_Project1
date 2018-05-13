package shopping.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import shopping.vo.Customer;

public class ShoppingDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	SqlSession session = null;
	
	public boolean loginCustomer(Customer customer) {
		int res = 0;

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
		int res = 0;

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
		Customer cus = new Customer();
		cus = customer;
		int res = 0;
		try {
			session = factory.openSession();
			ShoppingMapper mapper = session.getMapper(ShoppingMapper.class);
			
			res = mapper.insertCustomer(cus);
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
}
