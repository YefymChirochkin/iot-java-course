package ua.lviv.iot.firstLab;

public class WaterPumpOrganizer {
	private final static int countOfDetails = 4;

	public static void main(String[] args) {

		// create 3 objects WaterPump
		WaterPump emptyWaterPump = new WaterPump();
		WaterPump WaterPumpWithFourFeatures = new WaterPump(2500.0, "Grundfos UPS", 27.5, 13625);
		WaterPump WaterPumpWithSevenFeatures = new WaterPump(3700.5, "Optima", 35, 21400, 365, true, 120);

		// print 3 objects WaterPump
		System.out.println(emptyWaterPump);
		System.out.println(WaterPumpWithFourFeatures);
		System.out.println(WaterPumpWithSevenFeatures);

		// print static fields by printStaticField() and printField()
		WaterPump.printStaticyearOfManufacture();
		emptyWaterPump.printyearOfManufacture();
		System.out.println("\n");

		// task 14 with array
		WaterPump[] arrayOfDetails = new WaterPump[countOfDetails];
		int currentCountOfDetails = 0;
		while (currentCountOfDetails < countOfDetails) {
			arrayOfDetails[currentCountOfDetails] = new WaterPump();
			currentCountOfDetails++;
		}

		for (WaterPump currentCount : arrayOfDetails) {
			System.out.println(currentCountOfDetails);
		}

	}
}
