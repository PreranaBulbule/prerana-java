class Courier{
	public static void pickUp(String item)
	{
		System.out.println("received courier from Station");
		Station.send(item);
		System.out.println(" Name :" +item);
	}
}