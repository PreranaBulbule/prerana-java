class BakeryRunner{
	public static void main(String[] args)
	{
		String itam = "Cake";
		int quality = 3;
		Bakery.buy(itam,quality);
		
		boolean value = true;
		Bakery.open(value);
		
		Boolean result = false;
		Bakery.close(result);
		
		String name = "prerana";
		Bakery.owner(name);
		
		String cashierName = "shwetha";
		Bakery.cashier(cashierName);
	}
}