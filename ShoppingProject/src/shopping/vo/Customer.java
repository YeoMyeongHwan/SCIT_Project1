package shopping.vo;

public class Customer {
	private String id;
	private String password;
	private String birth;
	private String address;
	private String phone;
	private String email;
	private String name;
	public Customer() {
	}
	public Customer(String id, String password, String name, String birth, String address, String phone, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return password;
	}
	public void setPw(String pw) {
		this.password = pw;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
