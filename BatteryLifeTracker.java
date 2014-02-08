interface BatteryLifeTracker {
	final int MAX_NUMBER_OF_RECHARGES = 300;

	// increments the charge counter
	public void chargeBattery();

	public int getRemainingLife();
}
