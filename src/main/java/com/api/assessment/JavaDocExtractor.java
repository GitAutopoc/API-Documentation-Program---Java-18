package com.api.assessment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDocExtractor {

	public static void main(String[] args) {
		// Array of file paths pointing to "File1.java", "File2.java", and "File3.java"
		// in the current directory
		String[] filePaths = { "./File1.java", "./File2.java", "./File3.java" };

		for (String filePath : filePaths) {
			try {
				System.out.println("Processing file: " + filePath);
				String content = new String(Files.readAllBytes(Paths.get(filePath)));
				List<String> comments = extractMethodCommentsWithCode(content);
				comments.forEach(comment -> {
					System.out.println("Found comment and method:");
					System.out.println(comment);
					System.out.println("--------------------------------");
				});
				System.out.println("----------------------------------------------------------");
			} catch (IOException e) {
				System.out.println("Error reading the file " + filePath + ": " + e.getMessage());
			}
		}
	}

	public static List<String> extractMethodCommentsWithCode(String fileContent) {
		List<String> matches = new ArrayList<>();
		// Regex pattern to match Java method comments and the method signature
		Pattern pattern = Pattern.compile(
				"(?s)/\\*\\*([^*]|\\*(?!/))*\\*/\\s*(public|private|protected)\\s+[\\w<>,\\s]+\\s+\\w+\\([^)]*\\)\\s*\\{[^}]*\\}");
		Matcher matcher = pattern.matcher(fileContent);

		while (matcher.find()) {
			matches.add(matcher.group());
		}
		return matches;
	}
}
