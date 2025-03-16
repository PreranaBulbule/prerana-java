class FestivalRunner{
	public static void main(String[] args)
	{	
		String name1="Diwali";
		double day1=5;
		String Country1="India";
		Festival Fest=new Festival(name1,day1,Country1);
		System.out.println("the festival of the country :"+name1);
		System.out.println("the festival of the country :"+day1);
		System.out.println("the festival of the country :"+Country1);
		
		
		String name2="Christmas";
		double day2=1;
		String Country2="Global";
		Festival lighting=new Festival(name2,day2,Country2);
		System.out.println("the festival of the country :"+name2);
		System.out.println("the festival of the country :"+day2);
		System.out.println("the festival of the country :"+Country2);
	
	
		String name3="Ugadi";
		double day3=5;
		String Country3="India";
		Festival light=new Festival(name3,day3,Country3);
		System.out.println("the festival of the country :"+name3);
		System.out.println("the festival of the country :"+day3);
		System.out.println("the festival of the country :"+Country3);
		
		String name4="Eid al-Fitr";
		double day4=1-3;
		String Country4="Global" ;
		Festival fasting=new Festival(name4,day4,Country4);
		System.out.println("the festival of the country :"+name4);
		System.out.println("the festival of the country :"+day4);
		System.out.println("the festival of the country :"+Country4);
	
	
		String name5="Holi";
		double day5=2;
		String Country5="India, Nepal";
		Festival colour=new Festival(name5,day5,Country5);
		System.out.println("the festival of the country :"+name5);
		System.out.println("the festival of the country :"+day5);
		System.out.println("the festival of the country :"+Country5);
	
	
	}
	
}