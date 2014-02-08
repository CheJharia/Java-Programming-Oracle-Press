class GasVehicle implements MileageEfficiency {

	private float fuelConsumed;
	private float tripCounter;

	public float getMilesPerGallon() {
		return tripCounter / fuelConsumed;
	}

	public void makeTrip() {
		tripCounter = 100;
		fuelConsumed = 8.5f;
	}
}