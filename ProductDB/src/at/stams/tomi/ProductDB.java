package at.stams.tomi;

import java.util.HashMap;
import java.util.List;

public class ProductDB {

	protected HashMap<String, Product> db = new HashMap<>();

	public ProductDB() {
	}

	public ProductDB(List<Product> products) {
		products.stream().forEach(p -> addProduct(p));
	}

	public boolean addProduct(Product p) {
		Product put = db.put(p.getId(), p);
		if (put == null) {
			return true;
		} else {
			return false;
		}
	}

	public Product getProductById(String id) {
		return db.get(id);
	}

	public List<Product> search(String namePart) {
		return db.values().stream().filter(p -> p.getName().contains(namePart)).toList();
	}

	public String export() {
		return "LMA";
	}

	public HashMap<String, Product> getDb() {
		return db;
	}
}
