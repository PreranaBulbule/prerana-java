class Station{
	public static void send(String name)
	{
		System.out.println("send documents to station");
		DeliveryGuy.accept(name);
	}
}