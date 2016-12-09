package mywork.arrays.ex2;

public class TempCalc {

	public static double cToF(double temp) {
		return temp * 1.8 + 32;
	}
	
	public static double fToC(double temp) {
		return (temp - 32) / 1.8;
	}
	
	private TempCalc(){}
}
