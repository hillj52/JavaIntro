package mywork.io.ex1;

public class FileCounter {

	private int numLines;
	private int numChars;
	private int numWords;
	
	public void addLine(String line) {
		this.numLines++;
		this.numChars += line.length();
		this.numWords += line.split(" ").length;
	}
	
	public int getNumLines() {
		return this.numLines;
	}
	
	public int getNumWords() {
		return this.numWords;
	}
	
	public int getNumChars() {
		return this.numChars;
	}
	
	public FileCounter() {
		this.numLines = 0;
		this.numChars = 0;
		this.numWords = 0;
	}
}
