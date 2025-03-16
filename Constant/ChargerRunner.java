class ChargerRunner{
	public static void main(String[] values)
	{
	String brand1="Apple";
	int percentage1=90;
	boolean trueorfalse1=true;
	Charger charge=new Charger(brand1,percentage1,trueorfalse1);
	System.out.println("Charger needs to be:"+brand1);
	System.out.println("Charger needs to be:"+percentage1);
	System.out.println("Charger needs to be:"+trueorfalse1);
	
	String brand2="Samsung";
	int percentage2=100;
	boolean trueorfalse2=false;
	Charger charge1=new Charger(brand2,percentage2,trueorfalse2);
	System.out.println("Charger needs to be:"+brand2);
	System.out.println("Charger needs to be:"+percentage2);
	System.out.println("Charger needs to be:"+trueorfalse2);
	
	String brand3="ugreen";
	int percentage3=80;
	boolean trueorfalse3=true;
	Charger charge2=new Charger(brand3,percentage3,trueorfalse3);
	System.out.println("Charger needs to be:"+brand3);
	System.out.println("Charger needs to be:"+percentage3);
	System.out.println("Charger needs to be:"+trueorfalse3);
	
	String brand4="belkin";
	int percentage4=65;
	boolean trueorfalse4=false;
	Charger charge3=new Charger(brand4,percentage4,trueorfalse4);
	System.out.println("Charger needs to be:"+brand4);
	System.out.println("Charger needs to be:"+percentage4);
	System.out.println("Charger needs to be:"+trueorfalse4);
	
	String brand5="anker";
	int percentage5=50;
	boolean trueorfalse5=true;
	Charger charge4=new Charger(brand5,percentage5,trueorfalse5);
	System.out.println("Charger needs to be:"+brand5);
	System.out.println("Charger needs to be:"+percentage5);
	System.out.println("Charger needs to be:"+trueorfalse5);
	}
}