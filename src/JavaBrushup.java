
public class JavaBrushup {

	public static void main(String[] args) {
		
		int num = 7;
		char letter = 'A';
		String website = "We are together";
		double dec = 26.27;
		boolean output = true;
		
		System.out.println(num);
		System.out.println(letter+website);
		System.out.println(output);
	
	//Arrays
		
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr[2]);		
		
		int[] arr2 = {1,2,3};
		
		System.out.println(arr2[1]);
		
//for loop
		
		for(int i=0; i<arr.length; i++)
		{
			
		System.out.println(arr[i]);
		
		}
	

		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
			
		}
		
		String name[] = {"Sagar", "Tandu", "HSBC"};
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
			
		}
			
		for(String S: name)
		{
			System.out.println(S);
			
		}
		

		char[] single = {'S', 'T', 'A'};
		
		for(int i=0; i<single.length; i++)
		{
			System.out.println(single[i]);
			
		}
		
		for(char N: single)
		
		{
			System.out.println(N);
			
		}
			
			
			
		
		
		
	
			
			
		
			
		
		

	}

}
