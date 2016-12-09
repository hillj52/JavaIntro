package mywork.exceptions.ex2;

public class BadDateException extends RuntimeException {

	private static final long serialVersionUID = 4263761700191314249L;
	
	public BadDateException(String msg) {
		super(msg);
	}

}
