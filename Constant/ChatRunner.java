class ChatRunner{
	public static void main(String[] values)
	{
		String name1="Prerana";
		double time1=2.30;
		String topic1="pg";
		Chat angry = new Chat(name1,time1,topic1);
		System.out.println("Chat requires:"+name1);
		System.out.println("Chat requires:"+time1);
		System.out.println("Chat requires:"+topic1);
		
		String name2="Varsha";
		double time2=1.00;
		String topic2="salary";
		Chat happy = new Chat(name2,time2,topic2);
		System.out.println("Chat requires:"+name2);
		System.out.println("Chat requires:"+time2);
		System.out.println("Chat requires:"+topic2);
		
		String name3="Geetha";
		double time3=12.00;
		String topic3="food";
		Chat smile = new Chat(name3,time3,topic3);
		System.out.println("Chat requires:"+name3);
		System.out.println("Chat requires:"+time3);
		System.out.println("Chat requires:"+topic3);
		
		String name4="Naya";
		double time4=4.45;
		String topic4="shopping";
		Chat excited = new Chat(name4,time4,topic4);
		System.out.println("Chat requires:"+name4);
		System.out.println("Chat requires:"+time4);
		System.out.println("Chat requires:"+topic4);
		
		String name5="Divya";
		double time5=9.45;
		String topic5="rent";
		Chat nervous = new Chat(name5,time5,topic5);
		System.out.println("Chat requires:"+name5);
		System.out.println("Chat requires:"+time5);
		System.out.println("Chat requires:"+topic5);
		
		
		
	}
}