package jdbc_product;

public class Product {
	private int id;
	private String name;
	private double price;
	private String manufacturer;
	public Product() {
		
	}
	public Product(int id, String name, double price, String manufacturer, double discount, int warrenty,
			String mandate, double gst) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.discount = discount;
		this.warrenty = warrenty;
		this.mandate = mandate;
		this.gst = gst;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	public String getMandate() {
		return mandate;
	}
	public void setMandate(String mandate) {
		this.mandate = mandate;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	private double discount;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", manufacturer=" + manufacturer
				+ ", discount=" + discount + ", warrenty=" + warrenty + ", mandate=" + mandate + ", gst=" + gst + "]";
	}
	private int warrenty;
	private String mandate;
	private double gst;
}
