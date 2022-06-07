
public class JAVAStrings {

	public static void main(String[] args) {
		// 
		
		String S = "Sagar Tandu HSBC";
		
	 String[] splittedString  = S.split("Tandu");
	 System.out.println(splittedString[0]);
	 System.out.println(splittedString[1].trim());
	 
	 
	 for (int i=0; i<S.length(); i++)
	 {
		 System.out.println(S.charAt(i));
	 }
	 	 
	 for(int i=S.length()-1; i>=0; i--)
	 {
		System.out.println(S.charAt(i));
		 
	 }	 
	}
		

}
