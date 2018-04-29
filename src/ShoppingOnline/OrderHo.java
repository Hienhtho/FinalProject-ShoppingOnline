package ShoppingOnline;

/**
 * @author Hien Ho
 * Manage customer's orders
 */
public class OrderHo {

	private String code;
	private CustomerHo customer;
	private GoodLinkedListHo goodList;
	private double tax; // percent
	private double shipping; // dollars
	private double payment; // dollars

	/**
	 * empty constructor
	 */
	public OrderHo() {

	}
	
	/**
	 * count all of the payments including tax and shipping
	 * @return payment
	 */
	public double countPayment() {
		double total = goodList.total();
		payment = total - (total * tax / 100);
		payment += shipping;
		return payment;
	}
	
@Override
	public String toString() {
		return "Good order:\n" + goodList + "\ntax: " + tax + "%\nshipping: $" + shipping + "\npayment: $" + payment
				+ "\n" + customer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CustomerHo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerHo customer) {
		this.customer = customer;
	}

	public GoodLinkedListHo getGoodList() {
		return goodList;
	}

	public void setGoodList(GoodLinkedListHo goodList) {
		this.goodList = goodList;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getShipping() {
		return shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
}
