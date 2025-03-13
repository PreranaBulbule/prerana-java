class Bitcoin {
    static void showBitcoin() {
        System.out.println("Bitcoin balance checked.");
    }

    static void buyBitcoin() {
        System.out.println("Bitcoin purchased.");
    }

    static void useLipstick() {
        Lipstick.pinkLipstick();
    }

    static void usePineapple() {
        Pineapple.sourPineapple();
    }
}

 class Main {
    public static void main(String[] args) {
        System.out.println("Invoking all 44 static methods ");

        Lipstick.redLipstick();
        Lipstick.pinkLipstick();
        Lipstick.useBrand();
        Lipstick.usePerfume();

        TrafficSignal.redSignal();
        TrafficSignal.greenSignal();
        TrafficSignal.checkCurrency();
        TrafficSignal.checkBitcoin();

        Brand.showBrand();
        Brand.brandValue();
        Brand.useWallet();
        Brand.useBracelet();

        Pineapple.sweetPineapple();
        Pineapple.sourPineapple();
        Pineapple.useWire();
        Pineapple.useGold();
		
        Gold.wearGold();
        Gold.buyGold();
        Gold.usePerfume();
        Gold.useLipstick();

        Wire.connectWire();
        Wire.disconnectWire();
        Wire.useBitcoin();
        Wire.useCurrency();

        Bracelet.wearBracelet();
        Bracelet.removeBracelet();
        Bracelet.usePineapple();
        Bracelet.useTrafficSignal();

        Perfume.sprayPerfume();
        Perfume.openPerfume();
        Perfume.useWallet();
        Perfume.useBrand();

        Wallet.openWallet();
        Wallet.closeWallet();
        Wallet.useGold();
        Wallet.useWire();

        Currency.showCurrency();
        Currency.countCurrency();
        Currency.usePerfume();
        Currency.useBracelet();

        Bitcoin.showBitcoin();
        Bitcoin.buyBitcoin();
        Bitcoin.useLipstick();
        Bitcoin.usePineapple();
    }
}

