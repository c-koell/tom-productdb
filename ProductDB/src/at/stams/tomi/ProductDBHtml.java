package at.stams.tomi;

public class ProductDBHtml extends ProductDB {
	
	@Override
	public String export() {
		StringBuilder builder = new StringBuilder();
		builder.append("<table>").append(System.lineSeparator());
		builder.append("<tr><th>NAME</th><th>Price</th></tr>");
		db.values().stream().sorted().forEach(p -> builder.append("<tr><td>").append(p.getName()).append("</th></td>").append(System.lineSeparator()));
		return builder.toString();
	}
}
