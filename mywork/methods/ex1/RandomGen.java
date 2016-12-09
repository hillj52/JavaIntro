package mywork.methods.ex1;

public class RandomGen {

	private int highs;
	private int lows;
	private double runtime;

	public int getStatus() {
		if(highs==lows)
			return 1;
		else
			return 2;
	}
	
	public double getRuntime() {
		return this.runtime;
	}
	
	public String toString() {
		return new StringBuilder(60).append("Highs: ")
				.append(highs).append("\nLows: ")
				.append(lows).append("\nRuntime: ")
				.append(runtime).toString();
	}
	
	private double getRandom() {
		return Math.random();
	}
	
	private void inc() {
		if(getRandom()>.5)
			highs++;
		else
			lows++;
	}
	
	public RandomGen() {
		this.runtime = System.currentTimeMillis();
		this.highs = 0;
		this.lows = 0;
		for(int i=0;i<10000;i++) {
			inc();
		}
		while(highs!=lows&&(highs+lows)<1000000){
			inc();
		}
		this.runtime = System.currentTimeMillis()-runtime;
	}
}
