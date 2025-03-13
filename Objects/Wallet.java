class Wallet {
    static void openWallet() {
        System.out.println("Wallet opened.");
    }

    static void closeWallet() {
        System.out.println("Wallet closed.");
    }

    static void useGold() {
        Gold.wearGold();
    }

    static void useWire() {
        Wire.connectWire();
    }
}
