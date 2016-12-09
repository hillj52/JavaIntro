package mywork.io.ex2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MyKeyboardReader {
	
	private BufferedReader br;
	
	public String readLine() {
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	
	}
	
	public void close() {
		try {
			if(this.br != null)
				this.br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public MyKeyboardReader() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}
}