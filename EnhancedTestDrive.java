public class EnhancedTestDrive {

	public static void main(String[] args) {
		GasVehicle gasolineVehicle = new GasVehicle();
		gasolineVehicle.makeTrip();
		System.out.printf("Efficiency of Gas Vehicle (miles/gallon): %.02f%n",
				gasolineVehicle.getMilesPerGallon());
		ElectricVehicle electricVehicle = new ElectricVehicle();
		electricVehicle.makeTrip();
		System.out.printf("Efficiency of Electric Vehicle (miles/kw): %.02f%n",
				electricVehicle.getMilesPerGallon());
		HybridVehicle hybridVehicle = new HybridVehicle();
		hybridVehicle.makeTrip();
		System.out.printf(
				"Efficiency of Hybrid Vehicle (miles/EnergyConsumed): %.02f%n",
				hybridVehicle.getMilesPerGallon());

	}

}
