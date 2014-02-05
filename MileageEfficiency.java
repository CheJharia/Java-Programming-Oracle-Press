interface MileageEfficiency {
	public float getMilesPerGallon();
}

class GasVehicle implements MileageEfficiency {

	private float fuelConsumed;
	private float tripCounter;

	@Override
	public float getMilesPerGallon() {
		return tripCounter / fuelConsumed;
	}

	public void makeTrip() {
		tripCounter = 100;
		fuelConsumed = 8.5f;
	}
}

class ElectricVehicle implements MileageEfficiency {

	private float kwPowerConsumed;
	private float tripCounter;

	@Override
	public float getMilesPerGallon() {
		return tripCounter / kwPowerConsumed;
	}
	
	public void makeTrip() {
		tripCounter = 100;
		kwPowerConsumed = 5.6f;
	}

}