package main.java;

public class Parser {

	public boolean parse(String argument) {
		if (argument != null && argument.equals("-l"))
			return true;
		return false;
	}

}
