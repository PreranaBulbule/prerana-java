class Laptop
{
	public static void main(String[] args)
	{
	 String[] laptops = 
	 {
		"Apple",
		"Dell",
		"HP (Hewlett-Packard)",
		"Lenovo",
		"Asus",
		"Acer",
		"MSI",
		"Razer",
		"Samsung",
		"Microsoft Surface" 
	 };
		System.out.println("List of Laptops:");
		
		for(String laptop : laptops)
		{
			System.out.println(laptop);
		}
	}
}