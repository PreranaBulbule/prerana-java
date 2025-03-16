class HarpicRunner{
	public static void main(String[] values)
	{
	String fragrance1="Lemon";
	int volume1=500;
	boolean isDisinfected1=true;
	Harpic harpic1=new Harpic(fragrance1,volume1,isDisinfected1);
	System.out.println("Harpic consists of:"+fragrance1);
	System.out.println("Harpic consists of:"+volume1);
	System.out.println("Harpic consists of:"+isDisinfected1);
	
	String fragrance2="Lavender";
	int volume2=1000;
	boolean isDisinfected2=false;
	Harpic harpic2=new Harpic(fragrance2,volume2,isDisinfected2);
	System.out.println("Harpic consists of:"+fragrance2);
	System.out.println("Harpic consists of:"+volume2);
	System.out.println("Harpic consists of:"+isDisinfected2);
	
	String fragrance3="Rose";
	int volume3=800;
	boolean isDisinfected3=true;
	Harpic harpic3=new Harpic(fragrance3,volume3,isDisinfected3);
	System.out.println("Harpic consists of:"+fragrance3);
	System.out.println("Harpic consists of:"+volume3);
	System.out.println("Harpic consists of:"+isDisinfected3);
	
	String fragrance4="Ocean fresh";
	int volume4=650;
	boolean isDisinfected4=false;
	Harpic harpic4=new Harpic(fragrance4,volume4,isDisinfected4);
	System.out.println("Harpic consists of:"+fragrance4);
	System.out.println("Harpic consists of:"+volume4);
	System.out.println("Harpic consists of:"+isDisinfected4);
	
	String brand5="watermelon";
	int volume5=500;
	boolean isDisinfected5=true;
	Harpic harpic5=new Harpic(brand5,volume5,isDisinfected5);
	System.out.println("Harpic consists of:"+brand5);
	System.out.println("Harpic consists of:"+volume5);
	System.out.println("Harpic consists of:"+isDisinfected5);
	}
}