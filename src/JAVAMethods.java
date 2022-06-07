
public class JAVAMethods {

	public static void main(String[] args) {
		
		JAVAMethods d = new JAVAMethods();
		int mynum = d.getData();
		System.out.println(mynum);
		JAVAMethods2 d2 = new JAVAMethods2();
		d2.getuserData();
		getData();
		getData2();
		
		
		
	}
	
	public static int getData()
	{
		System.out.println("hello world");
		return (9019);
	}
	
	public static int getData2()
	{
		System.out.println("in the own world");
		return (9019);
	}

}
