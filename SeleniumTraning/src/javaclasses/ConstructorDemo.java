package javaclasses;

class ConstructorDemo {
	int m_x, m_y;

	public ConstructorDemo(int x, int y) { // arg con
		m_x = x;
		m_y = y;
	}

	public ConstructorDemo() {  // non arg
		this(10);
	}
	
	public ConstructorDemo(int b) // signature = name+parameters
	{
		
	}

	public int getX() {  //m1
		return m_x;
	}

	public int getY() {  //m2
		return m_y;
	}

	public static void main(String args[]) {
		ConstructorDemo p = new ConstructorDemo();  // non arg
		System.out.println(0.0);
	}
}