package model;

public class Product {
	private String id;
	private String name;
	private double netPrice;
	private VAT vat;
	private double price;
	
	public Product(String id, String name, double netPrice, VAT vat) {
		super();
		this.id = id;
		this.name = name;
		this.netPrice = netPrice;
		this.vat = vat;
		this.price = netPrice * (1 + vat.getTax());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	public VAT getVat() {
		return vat;
	}

	public void setVat(VAT vat) {
		this.vat = vat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
