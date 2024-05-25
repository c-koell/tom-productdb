package at.stams.tomi.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileLeser {

	public static void main(String[] args) {
		FileLeser fileReader = new FileLeser();
		fileReader.leseFile();
	}

	private void leseFile() {
		URL resource = getClass().getResource("tomi.txt");
		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Path.of(resource.toURI()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		verarbeiteText(allLines);
	}

	private void verarbeiteText(List<String> lines) {
		Stream<Integer> of = Stream.of(1,2,3);
		of.forEach(tomi -> {
			//tomi.
		});
		
		lines.forEach(System.out::println);
		lines.stream().forEach(System.out::println);
		lines.stream().forEach(l -> {
			System.out.println(l);
		});
		for (String zeile : lines) {
			System.out.println(zeile);
		}
	}

	private void leseFileAlt() {
		List<String> allLines = new ArrayList<>();
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader("tomi.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				allLines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		verarbeiteText(allLines);
	}
}
