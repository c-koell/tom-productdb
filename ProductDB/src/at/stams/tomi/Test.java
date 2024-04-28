package at.stams.tomi;

public class Test {

	public static void main(String[] args) {
		ProductDBHtml productDBCsv = new ProductDBHtml();
		productDBCsv.addProduct(new Product("1", "Produkt A", 12));
		productDBCsv.addProduct(new Product("2", "Produkt C", 12));
		productDBCsv.addProduct(new Product("3", "Produkt D", 12));
		productDBCsv.addProduct(new Product("4", "Produkt B", 12));
		productDBCsv.addProduct(new Product("5", "Produkt E", 12));
		System.out.println(productDBCsv.export());
	}

}
