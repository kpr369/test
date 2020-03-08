package javaclasses;

public class SwitchStatment {

	
	public static void main(String[] args) {
		
		String day ="Fri";
		
		switch(day) //strng
		{
		
		case "Mon" :
			System.out.println(1);
			break;
		case "Tue" :
			System.out.println(2);
			break;
		case "Wed" :
			System.out.println(3);
			break;
		
			default :
				System.out.println("Invalid Day");
		}
		
		//swithc outside
	}
}
