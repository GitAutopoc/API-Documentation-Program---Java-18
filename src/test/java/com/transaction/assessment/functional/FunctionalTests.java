package com.transaction.assessment.functional;

import static com.streams.assessment.testutils.TestUtils.businessTestFile;
import static com.streams.assessment.testutils.TestUtils.currentTest;
import static com.streams.assessment.testutils.TestUtils.yakshaAssert;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.api.assessment.JavaDocExtractor;

public class FunctionalTests {

	@Test
	public void testProcessFileContent() throws IOException {
		String testInput = "/**\n" + " * This is a method comment\n" + " */\n" + "public void exampleMethod() {\n"
				+ "    // method body\n" + "}\n";

		JavaDocExtractor obj = new JavaDocExtractor();
		List<String> output = obj.extractMethodCommentsWithCode(testInput);
//        assertTrue(output.size() == 1, "Should find one method comment");
//        assertTrue(output.get(0).contains("This is a method comment"), "Comment should match expected content");
		yakshaAssert(currentTest(), output.size() == 1 ? "true" : "false", businessTestFile);
	}
}