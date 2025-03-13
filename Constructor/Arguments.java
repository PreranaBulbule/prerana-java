class Arguments {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        System.out.println("Arguments passed:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}