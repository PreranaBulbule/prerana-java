package Software.Intern;

public class RechargeableBattery extends Battery {
    public RechargeableBattery() {
        super();
        System.out.println("No-args constructor of RechargeableBattery");

        super.providePower();
        System.out.println("Providing reusable power for multiple charge cycles");

        super.deplete();
        System.out.println("Rechargeable battery discharging after prolonged use");

        super.dispose();
        System.out.println("Recycling the rechargeable battery properly");

        super.store();
        System.out.println("Keeping the rechargeable battery in a safe storage area");
    }
}