
public class MemorySize {
//referenced from igastelum
	public static void main(String[] args) {

		String hardDrive1 = "32GB";
		String hardDrive2 = "2GB";
		String hardDrive3= "70GB";
		String hardDrive4= "1GB";
		String hardDrive5 = "10MB";
		String hardDrive6 = "256MB";

		
			System.out.println("32GB -> Actual memory: " + actualMemorySize(hardDrive1));
			System.out.println("2GB -> Actual memory: " + actualMemorySize(hardDrive2));
			System.out.println("70GB -> Actual memory: " + actualMemorySize(hardDrive3));
			System.out.println("1GB -> Actual memory: " + actualMemorySize(hardDrive4));
			System.out.println("10MB -> Actual memory: " + actualMemorySize(hardDrive5));
			System.out.println("256MB -> Actual memory: " + actualMemorySize(hardDrive6));

		

	}

	private static String actualMemorySize(String ms) throws NumberFormatException {
		
		String Unit = ms.substring(ms.length()-2, ms.length());
		String unitValue = ms.substring(0, ms.length() - 2);
		double space = Double.valueOf(unitValue);

		if (Unit.equals("GB") || Unit.equals("MB")) {
			double memory = (double)space - ((double)space * 7.0)/100;
			if (memory < 1.0 && Unit.equals("GB")) {
				Unit = "MB";
				memory = memory * 1000;
			}
			if(memory<1.0 && Unit.equals("MB")) {
				Unit = "GB";
				memory = memory * 1000;
			}
			double roundedResult = Math.round(memory*100.0)/100.0;
			return Double.toString(roundedResult) + Unit;

		}
		return "" ;
	}
}
