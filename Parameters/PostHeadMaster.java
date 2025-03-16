class PostHeadMaster {
    void deliver(String customerName, String address) {
        System.out.println("Post Head Master processes delivery for " + customerName);
        PostMaster postMaster = new PostMaster();
        postMaster.deliver(customerName, address);
    }
}