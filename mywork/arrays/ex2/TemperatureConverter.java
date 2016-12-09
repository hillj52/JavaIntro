package mywork.arrays.ex2;

public class TemperatureConverter {

	public static void main(String[] args) {
		if(args.length!=3) {
			System.out.println("Invalid command line arguments!");
			System.exit(99);
		} else {
			double startTemp = Double.parseDouble(args[0]);
			double endTemp = Double.parseDouble(args[1]);
			double delta = Double.parseDouble(args[2]);
			
			System.out.println("CELSIUS\tFAHRENHEIT");
			for(double temp=startTemp;temp<=endTemp;temp+=delta) {
				System.out.println(temp + "\t" + TempCalc.cToF(temp));
			}
		}
	}

}
