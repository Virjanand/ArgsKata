package main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Parser;

public class ArgsParserTest {

	@Test
	public void booleanArgument() {
		Parser parser = new Parser();
		assertEquals(true, parser.parse("-l"));
	}

}
