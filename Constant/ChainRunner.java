class ChainRunner {
	
    public static void main(String[] args) {
		
        int length1 = 10;
        float weight1 = 1.4f;
        char grade1 = 'A';
        Chain chain1 = new Chain(length1, weight1, grade1);
        System.out.println("Chain length: " + length1);
        System.out.println("Chain weight: " + weight1);
        System.out.println("Chain grade: " + grade1);

        int length2 = 15;
        float weight2 = 0.8f;
        char grade2 = 'B';
        Chain chain2 = new Chain(length2, weight2, grade2);
        System.out.println("Chain length: " + length2);
        System.out.println("Chain weight: " + weight2);
        System.out.println("Chain grade: " + grade2);

        int length3 = 20;
        float weight3 = 1.2f;
        char grade3 = 'C';
        Chain chain3 = new Chain(length3, weight3, grade3);
        System.out.println("Chain length: " + length3);
        System.out.println("Chain weight: " + weight3);
        System.out.println("Chain grade: " + grade3);

        int length4 = 25;
        float weight4 = 2.0f;
        char grade4 = 'D';
        Chain chain4 = new Chain(length4, weight4, grade4);
        System.out.println("Chain length: " + length4);
        System.out.println("Chain weight: " + weight4);
        System.out.println("Chain grade: " + grade4);

        int length5 = 30;
        float weight5 = 3.5f;
        char grade5 = 'E';
        Chain chain5 = new Chain(length5, weight5, grade5);
        System.out.println("Chain length: " + length5);
        System.out.println("Chain weight: " + weight5);
        System.out.println("Chain grade: " + grade5);
    }
}