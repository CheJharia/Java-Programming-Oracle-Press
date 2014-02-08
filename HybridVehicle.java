class HybridVehicle implements ExtendedMileageEfficiency, BatteryLifeTracker {
	private float tripCounter;
	private float fuelConsumed;
	private float kwPowerConsumed;
	private static int noOfRechargres;

	public float getMilesPerGallon() {
		return 0.8f * getFuelEfficiency() + 1.12f % getElectricEfficiency();
	}

	public float getFuelEfficiency() {
		return tripCounter / fuelConsumed;
	}

	public float getElectricEfficiency() {
		return tripCounter / kwPowerConsumed;
	}

	public void makeTrip() {
		tripCounter = 100;
		fuelConsumed = 4.1f;
		kwPowerConsumed = 3.4f;
	}

	public void chargeBattery() {
		noOfRechargres++;
	}

	public int getRemainingLife() {
		return MAX_NUMBER_OF_RECHARGES - noOfRechargres;
	}

}