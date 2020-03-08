package javaclasses;

public class VariableTypes {
	
	int a; //Globlal
	
	static int b;//static variable //  
	
	static String schoolName;
	int rollNo;
	String name;

	public static void main(String[] args) {
		
		VariableTypes st1 = new VariableTypes();
		VariableTypes st2 = new VariableTypes();
		VariableTypes st3 = new VariableTypes();

		st1.name="ABC";
		st1.rollNo=20;
		st1.schoolName="Selenium";

		st2.rollNo=21;
		st2.schoolName="Java";
		
		st3.name="DGP";
		st3.rollNo=22;
		
		/*
		 * VariableTypes variableTypes = new VariableTypes();
		 * 
		 * System.out.println(variableTypes.a);
		 */
		
		System.out.println(st1.schoolName);
		System.out.println(st2.name);
		System.out.println(st3.schoolName);

	}

}


//this
//super