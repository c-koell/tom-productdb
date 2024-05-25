package at.stams.tomi;

public class Test {

	public static void main(String[] args) {
//		ProductDBHtml productDBCsv = new ProductDBHtml();
//		productDBCsv.addProduct(new Product("1", "Produkt A", 12));
//		productDBCsv.addProduct(new Product("2", "Produkt C", 12));
//		productDBCsv.addProduct(new Product("3", "Produkt D", 12));
//		productDBCsv.addProduct(new Product("4", "Produkt B", 12));
//		productDBCsv.addProduct(new Product("5", "Produkt E", 12));
//		System.out.println(productDBCsv.export());
		Test test = new Test();
		//try {
		test.machMalWas();
		//} catch (RuntimeException re) {
		//	System.out.println("das ist aber böse");
		//}
		System.out.println("nicht programm ende");
	}
	
	public void machMalWas() {
		String input = "a";
		try {
			Integer zahl = convertString(input);
			System.out.println(zahl);
		} catch (InvalidInputException e) {
			System.out.println("Das war keine Zahl");
		} catch (NumberFormatException nfe) {
			throw new RuntimeException("LMAA");
		} finally {
			System.out.println("das will ich unbedingt machen");
		}
		System.out.println("weiter gehts");
	}
	
	public Integer convertString(String input) throws InvalidInputException {
		if (input == null) {
			throw new InvalidInputException("Input darf nicht null sein");
		}
		return Integer.valueOf(input);
	}

}
