package POM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {
	@Test
	public void test1() {
		System.out.println("Test1 executed");
	}
	@Test
	public void test2() {
		System.out.println("Test2 executed");
		
	}
	@Test
	public void test() {
		System.out.println("Test executed");
		}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class executed");
	}	
	@AfterClass
	public void afterclass() {
		System.out.println("after class executed");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before execute method");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after execute method");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test executed");
		}
	@AfterTest
	public void aftertest() {
		System.out.println("after test executed");
	}
}