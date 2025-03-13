 class Laptop {
	 private String brand;
	 private int batteryPercentage;
	 
	 public Laptop(String brand,int batteryPercentage){
		 this.brand = brand;
		 this.batteryPercentage = batteryPercentage;
	 }
	 public String getBrand(){
		 return brand;
	 }
	 public void powerOn(){
		System.out.println(brand +"laptop is powering on."); 
	 }
	 public void powerOff(){
		System.out.println(brand +"laptop is shutting down."); 
	 }
	 public void chargeBattery(int amount){
		 batteryPercentage += amount;
		 if(batteryPercentage > 100)
			 batteryPercentage = 100;
		System.out.println("Battery charged to" +batteryPercentage+"%.");
	 }
	 public void showBatteryStatus(){
		System.out.println("Battery is at" +batteryPercentage+ "%."); 
	 }
	 public void openApplication(String appName){
		System.out.println("Opening" +appName+ "on" +brand+ "laptop."); 
	 }
	 
	  public void useExternalMethods() {
        LaptopUtilities utils = new LaptopUtilities();

        utils.connectToWiFi("HomeNetwork");
        utils.checkForUpdates();
        utils.cleanTemporaryFiles();
        utils.optimizePerformance();
        utils.displayLaptopInfo(this);
    }

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", 50);

        myLaptop.powerOn();
        myLaptop.showBatteryStatus();
        myLaptop.chargeBattery(20);
        myLaptop.openApplication("Chrome");
        myLaptop.powerOff();

        myLaptop.useExternalMethods();
    }
}
