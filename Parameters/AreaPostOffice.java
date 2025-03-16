class AreaPostOffice {
    void deliver(String customerName, String address) {
        System.out.println("Area Post Office processes delivery for " + customerName);
        SubRegionalPostOffice subRegionalPostOffice = new SubRegionalPostOffice();
        subRegionalPostOffice.deliver(customerName, address);
    }
}
