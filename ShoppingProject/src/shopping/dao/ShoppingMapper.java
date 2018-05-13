package shopping.dao;

import java.util.ArrayList;

import shopping.vo.Customer;

public interface ShoppingMapper {
	public int loginCustomer(Customer customer);
	public int checkCustomerID(String id);
	public int insertCustomer(Customer customer);
	public ArrayList<Customer> selectAllCustomer();
}