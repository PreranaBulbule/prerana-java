class SubRegionalPostOffice {
    void deliver(String customerName, String address) {
        System.out.println("Sub-Regional Post Office processes delivery for " + customerName);
        RegionalPostOffice regionalPostOffice = new RegionalPostOffice();
        regionalPostOffice.deliver(customerName, address);
    }
}