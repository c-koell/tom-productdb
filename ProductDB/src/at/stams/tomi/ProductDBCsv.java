package at.stams.tomi;

public class ProductDBCsv extends ProductDB {
	
	@Override
	public String export() {
		StringBuilder builder = new StringBuilder();
		db.values().stream().sorted().forEach(p -> builder.append(p.getId()).append(",").append(p.getName()).append(",").append(p.getPrice()).append(System.lineSeparator()));
		return builder.toString();
	}
}
