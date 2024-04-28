package at.stams.tomi;

public class Product implements Comparable<Product> {

	private String id;
	private String name;
	private double price;

	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (obj instanceof Product) {
			Product other = (Product) obj;
			return this.id.equals(other.id);
		}
		return false;
	}

	@Override
	public int compareTo(Product other) {
		return name.compareTo(other.name);
	}
}
