class ElectricVehicle implements MileageEfficiency, BatteryLifeTracker {

	private float kwPowerConsumed;
	private float tripCounter;
	private static int numberOfRecharges;

	public float getMilesPerGallon() {
		return tripCounter / kwPowerConsumed;
	}

	public void makeTrip() {
		tripCounter = 100;
		kwPowerConsumed = 5.6f;
	}

	public void chargeBattery() {
		numberOfRecharges++;
		System.out.println(MAX_NUMBER_OF_RECHARGES);
	}

	public int getRemainingLife() {
		return MAX_NUMBER_OF_RECHARGES - numberOfRecharges;
	}

}