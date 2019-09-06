package com.crm.qa.base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	
	
	public TestBase()
	{
	System.out.println("This is TestBaseClass");
	}
	
@BeforeMethod
public void newTest()
{
	System.out.println("This is newtest method");
}

@Test
public void newTest1()
{
	System.out.println("This is newtest1 method");
}

@Test
public void newTest3()
{
	System.out.println("This is newtest1 method");
}


@AfterMethod
public void newTest2()
{
	System.out.println("This is newtest3 method");
}

}
