import java.util.ArrayList;

public class JavaBrushupIFELSE {

	public static void main(String[] args) {
		
		int[] arr2 = {2,4,5,6,8,9,14,22,56,77,89};
		
		//check if any multiples of 2
		
		for(int i=0; i<arr2.length; i++)
		
		{
			if(arr2[i]%2 == 0)
			{
			System.out.println(arr2[i]);	
			}
		
		
	
		else
			
		{
			System.out.println(arr2[i] +"is not multiple of 2");
			
		}
			//
			{
			ArrayList<String> a = new ArrayList<String>();
			a.add("Sagar");
			a.add("Tandu");
			a.add("HSBC");
			
			System.out.println(a.get(2));
			}
			
		
		}
		
	}
	
}

