package ShoppingOnline;

/**
 * @author Hien Ho 
 * Manage customer's information
 */
public class CustomerHo {

	private String name;
	private String phone;
	private String email;
	private String address;
	
	/**
	 * empty constructor
	 */
	public CustomerHo() {

	}

@Override
	public String toString() {
		return "Your info: Name: " + name + ", Phone: " + phone + ", Email: " + email + ", Address: " + address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
