package mywork.encapsulation.ex3;

public class IDGenerator {
	
	private static int idNumber = 100;
	
	private String prefix;
	
	public String issueNext() {
		return this.prefix + idNumber++;
	}
	
	public String viewNext() {
		return this.prefix + idNumber;
	}
	
	public IDGenerator(String prefix, int startId) {
		this.prefix = prefix;
		idNumber = startId;
	}
	
	public IDGenerator(String prefix) {
		this(prefix,100);
	}
	
	public IDGenerator() {
		this("id",100);
	}
}
