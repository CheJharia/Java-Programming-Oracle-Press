interface MileageEfficiency {
	public float getMilesPerGallon();
}

// an interface that extends the MileageEfficiency interface
interface ExtendedMileageEfficiency extends MileageEfficiency {
	public float getFuelEfficiency();

	public float getElectricEfficiency();
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

class HybridVehicle implements ExtendedMileageEfficiency {
	private float tripCounter;
	private float fuelConsumed;
	private float kwPowerConsumed;

	@Override
	public float getMilesPerGallon() {
		return 0.8f * getFuelEfficiency() + 1.12f % getElectricEfficiency();
	}

	@Override
	public float getFuelEfficiency() {
		return tripCounter / fuelConsumed;
	}

	@Override
	public float getElectricEfficiency() {
		return tripCounter / kwPowerConsumed;
	}
	
	public void makeTrip(){
		tripCounter = 100;
		fuelConsumed = 4.1f;
		kwPowerConsumed = 3.4f;
	}

}

