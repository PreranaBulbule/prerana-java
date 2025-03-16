class RegionalPostOffice {
    void deliver(String customerName, String address) {
        System.out.println("Regional Post Office processes delivery for " + customerName);
        PostHeadMaster headMaster = new PostHeadMaster();
        headMaster.deliver(customerName, address);
    }
}
