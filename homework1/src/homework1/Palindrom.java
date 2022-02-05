package homework1;

public class Palindrom {

	public static void main(String[] args) {
		
		     
      
		int birler_Basamagi;
		int onlar_Basamagi;

		for(int i=10;i<=100;i++)
		{
		birler_Basamagi = i%10;
		onlar_Basamagi = i/10;
		if(birler_Basamagi==onlar_Basamagi) {
		System.out.println(i);
		}
		
		}
	
	}

}