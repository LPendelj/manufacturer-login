package model;

public class VAT {
	private String cat;
	private double tax;
	
	public VAT(String cat) {
		super();
		this.cat = cat;
		switch (cat) {
		case "A": tax = 0.1;
			break;
		case "B": tax = 0.15;
			break;
		case "C": tax = 0.18;
			break;
		case "D": tax = 0.2;
			break;
		case "E": tax = 0.25;
			break;
		
		default: tax = 0;	
		}
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
}
