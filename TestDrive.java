public class TestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GasVehicle gasolineVehicle = new GasVehicle();
		gasolineVehicle.makeTrip();
		System.out.printf("Efficiency of Gas Vehiclem (miles/gallon): %.02f%n",
				gasolineVehicle.getMilesPerGallon());
		ElectricVehicle electricVehicle = new ElectricVehicle();
		electricVehicle.makeTrip();
		System.out.printf("Efficiency of Electric Vehicle (miles/kw): %.02f%n",
				electricVehicle.getMilesPerGallon());
	}

}
