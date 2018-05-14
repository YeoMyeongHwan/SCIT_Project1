package shopping.dao;

import java.util.ArrayList;

import shopping.vo.Customer;
import shopping.vo.Item;

public interface ShoppingMapper {
	public int loginCustomer(Customer customer);
	public int checkCustomerID(String id);
	public int insertCustomer(Customer customer);
	public ArrayList<Customer> selectAllCustomer();
	public ArrayList<Item> selectAllItem();
	public int insertItem(Item item);
	public int updateItem(Item item);
	public int deleteItem(String itemNo);
}