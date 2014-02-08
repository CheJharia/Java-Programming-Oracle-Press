public class FurtherEnhancedTestDrive {

	public static void main(String[] args) {
		GasVehicle gasolineVehicle = new GasVehicle();
		gasolineVehicle.makeTrip();
		System.out.printf("Efficiency of Gas Vehicle (miles/gallon): %.02f%n",
				gasolineVehicle.getMilesPerGallon());
		ElectricVehicle electricVehicle = new ElectricVehicle();
		electricVehicle.makeTrip();
		System.out.printf("Efficiency of Electric Vehicle (miles/kw): %.02f%n",
				electricVehicle.getMilesPerGallon());
		for (int i = 0; i < 78; i++) {
			electricVehicle.chargeBattery();
		}
		System.out.printf("The battery can be charged %d more times %n",
				electricVehicle.getRemainingLife());
		HybridVehicle hybridVehicle = new HybridVehicle();
		hybridVehicle.makeTrip();
		System.out.printf("%nEfficiency of Hybrid Vehicle (miles/EnergyConsumed): %.02f%n",
				hybridVehicle.getMilesPerGallon());
		for (int i = 0; i < 15; i++) {
			hybridVehicle.chargeBattery();
		}
		System.out.printf("The battery can be charged %d more times %n",
				hybridVehicle.getRemainingLife());		
	}

}
