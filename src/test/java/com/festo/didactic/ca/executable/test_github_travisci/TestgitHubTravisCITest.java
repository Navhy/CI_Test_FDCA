package com.festo.didactic.ca.executable.test_github_travisci;

import org.junit.Assert;
import org.junit.Test;

public class TestgitHubTravisCITest
{

	public static final String CORRECT_HELLO_WORLD = "Hello World !";
	public static final String INCORRECT_WORD = "Incorrect Word !";

	@Test
	public void whenWritingHelloWorldInConsole_shouldReturnWordsWrittenInConsole()
	{
		new TestGitHubTravisCI();

		String result = TestGitHubTravisCI.writeHelloWorldInConsole();

		Assert.assertEquals(CORRECT_HELLO_WORLD, result);
	}
}
