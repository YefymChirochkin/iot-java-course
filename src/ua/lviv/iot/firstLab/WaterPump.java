package ua.lviv.iot.firstLab;

public class WaterPump {

	// default fields
	private static final int DEFAULT_SERIAL_NUMBER = 0;
	private static final boolean DEFAULT_CAPABILITY = true;
	private static final double DEFAULT_SPEED = 0.0;

	// 3 default private fields
	private double powerOfWaterPumpInWatt;
	private String waterPumpBrand;
	private double volumeOfWaterPerOneHourInLiters;

	// 2 additional private fields
	private double waterPumpPrice;
	private int serialNumberOfWaterPump;

	// 1 static field
	private static int yearOfManufacture;

	// 2 additional protected fields
	protected boolean workingCapability;
	protected double waterPumpSpeed;

	// default constructor
	public WaterPump() {
	}

	// constructor with 4 fields
	public WaterPump(double powerOfWaterPumpInWatt, String waterPumpBrand, double volumeOfWaterPerOneHourInLiters,
			double waterPumpPrice) {
		this(powerOfWaterPumpInWatt, waterPumpBrand, volumeOfWaterPerOneHourInLiters, waterPumpPrice,
				DEFAULT_SERIAL_NUMBER, DEFAULT_CAPABILITY, DEFAULT_SPEED);
	}

	// constructor with all fields
	public WaterPump(double powerOfWaterPumpInWatt, String waterPumpBrand, double volumeOfWaterPerOneHourInLiters,
			double waterPumpPrice, int serialNumberOfWaterPump, boolean workingCapability, double waterPumpSpeed) {
		this.powerOfWaterPumpInWatt = powerOfWaterPumpInWatt;
		this.waterPumpBrand = waterPumpBrand;
		this.volumeOfWaterPerOneHourInLiters = volumeOfWaterPerOneHourInLiters;
		this.waterPumpPrice = waterPumpPrice;
		this.serialNumberOfWaterPump = serialNumberOfWaterPump;
		this.workingCapability = workingCapability;
		this.waterPumpSpeed = waterPumpSpeed;
		WaterPump.yearOfManufacture++;
	}

	// setters and getters to all fields
	public double getPowerOfWaterPumpInWatt() {
		return powerOfWaterPumpInWatt;
	}

	public void setPowerOfWaterPumpInWatt(double powerOfWaterPumpInWatt) {
		this.powerOfWaterPumpInWatt = powerOfWaterPumpInWatt;
	}

	public String getWaterPumpBrand() {
		return waterPumpBrand;
	}

	public void setWaterPumpBrand(String waterPumpBrand) {
		this.waterPumpBrand = waterPumpBrand;
	}

	public double getVolumeOfWaterPerOneHourInLiters() {
		return volumeOfWaterPerOneHourInLiters;
	}

	public void setVolumeOfWaterPerOneHourInLiters(double volumeOfWaterPerOneHourInLiters) {
		this.volumeOfWaterPerOneHourInLiters = volumeOfWaterPerOneHourInLiters;
	}

	public double getWaterPumpPrice() {
		return waterPumpPrice;
	}

	public void setWaterPumpPrice(double waterPumpPrice) {
		this.waterPumpPrice = waterPumpPrice;
	}

	public int getSerialNumberOfWaterPump() {
		return serialNumberOfWaterPump;
	}

	public void setSerialNumberOfWaterPump(int serialNumberOfWaterPump) {
		this.serialNumberOfWaterPump = serialNumberOfWaterPump;
	}

	public static int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public static void setYearOfManufacture(int yearOfManufacture) {
		WaterPump.yearOfManufacture = yearOfManufacture;
	}

	public boolean isWorkingCapability() {
		return workingCapability;
	}

	public void setWorkingCapability(boolean workingCapability) {
		this.workingCapability = workingCapability;
	}

	public double getWaterPumpSpeed() {
		return waterPumpSpeed;
	}

	public void setWaterPumpSpeed(double waterPumpSpeed) {
		this.waterPumpSpeed = waterPumpSpeed;
	}

	// method toString()
	@Override
	public String toString() {
		return "power: " + powerOfWaterPumpInWatt + "," + "brand: " + waterPumpBrand + "," + "volume: "
				+ volumeOfWaterPerOneHourInLiters + "," + "price: " + waterPumpPrice + "," + "serialnumber: "
				+ serialNumberOfWaterPump + "," + "capability: " + workingCapability + "," + "speed: " + waterPumpSpeed;
	}

	// static method printStaticField()
	public static void printStaticyearOfManufacture() {
		System.out.println("\nStatic method (printStaticField) \nYearOfManufacture: " + WaterPump.yearOfManufacture);
	}

	// static method printField()
	public void printyearOfManufacture() {
		System.out.println("\nStatic method (printField) \nYearOfManufacture: " + WaterPump.yearOfManufacture);
	}

	// resetValues method
	public void resetValues(double power, String brand, double volume, double price, int serialnumber,
			boolean capability, double speed) {
		this.powerOfWaterPumpInWatt = power;
		this.waterPumpBrand = brand;
		this.volumeOfWaterPerOneHourInLiters = volume;
		this.waterPumpPrice = price;
		this.serialNumberOfWaterPump = serialnumber;
		this.workingCapability = capability;
		this.waterPumpSpeed = speed;
	}
}
