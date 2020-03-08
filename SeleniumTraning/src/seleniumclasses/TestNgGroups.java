package seleniumclasses;

@org.testng.annotations.Test(groups="AllMethods")
public class TestNgGroups {

	@org.testng.annotations.Test(groups= {"sanity"})
	public void testColor()
	{
		System.out.println("Color");
	}
	@org.testng.annotations.Test(groups= {"regression"})
	public void testFood()
	{
		System.out.println("Food");
	}
	@org.testng.annotations.Test(groups= {"smoke","regression"})
	public void testFlowers()
	{
		System.out.println("Flowers");
	}
	@org.testng.annotations.Test(groups= {"smoke"})
	public void testFlowers1()
	{
		System.out.println("Flowers1");
	}
}
