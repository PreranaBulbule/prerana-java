class WhatsappRunner{
	public static void main(String[] values)
	{
	long phoneNumber1 = 7628977;
	float appVersion1 = 2.45f;
	String status1 = "online";
	Whatsapp contact = new Whatsapp(phoneNumber1,appVersion1,status1);
	System.out.println("Whatsapp used for:"+phoneNumber1);
	System.out.println("Whatsapp used for:"+appVersion1);
	System.out.println("Whatsapp used for:"+status1);

	long phoneNumber2 = 6247764;
	float appVersion2 = 6.45f;
	String status2 = "offline";
	Whatsapp community = new Whatsapp(phoneNumber2,appVersion2,status2);
	System.out.println("Whatsapp used for:"+phoneNumber2);
	System.out.println("Whatsapp used for:"+appVersion2);
	System.out.println("Whatsapp used for:"+status2);
	
	long phoneNumber3 = 9125374;
	float appVersion3 = 4.35f;
	String status3 = "online";
	Whatsapp videoCall = new Whatsapp(phoneNumber3,appVersion3,status3);
	System.out.println("Whatsapp used for:"+phoneNumber3);
	System.out.println("Whatsapp used for:"+appVersion3);
	System.out.println("Whatsapp used for:"+status3);
	
	long phoneNumber4 = 4675237;
	float appVersion4 = 9.3f;
	String status4 = "online";
	Whatsapp archive = new Whatsapp(phoneNumber4,appVersion4,status4);
	System.out.println("Whatsapp used for:"+phoneNumber4);
	System.out.println("Whatsapp used for:"+appVersion4);
	System.out.println("Whatsapp used for:"+status4);
	
	long phoneNumber5 = 8135857;
	float appVersion5 = 5.46f;
	String status5 = "offline";
	Whatsapp chatLock = new Whatsapp(phoneNumber5,appVersion5,status5);
	System.out.println("Whatsapp used for:"+phoneNumber5);
	System.out.println("Whatsapp used for:"+appVersion5);
	System.out.println("Whatsapp used for:"+status5);
	}
}