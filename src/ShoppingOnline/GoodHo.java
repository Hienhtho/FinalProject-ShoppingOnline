package ShoppingOnline;

/**
 * @author Hien Ho 
 * Manage products
 */
public class GoodHo {

	private String code;
	private String name;
	private String size;
	private String color;
	private double price;
	
	/**
	 * empty constructor
	 */
	public GoodHo() {
		
	}

	@Override
	public String toString() {
		return "Name: " + name + ", size: " + size + ", color: " + color + ", price: " + "$" + price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
