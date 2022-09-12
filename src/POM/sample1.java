package POM;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample1 {
	@Test(dependsOnMethods = {"test2"})
	public void test1() {
		System.out.println("test1 executed");
	}
	@Test(priority = 3, timeOut=2000)
	public void test2() throws InterruptedException {
		Thread.sleep(2500);
		System.out.println("test2 executed");
}
	@Test()
	@Parameters({"a","b"})
	public void test3(int a,int b) {
		System.out.println(a+b);
		System.out.println("test3 executed");
}
	@Test()
	@Parameters({"a","b"})
	public void test(int a,int b) {
		System.out.println(a-b);
		System.out.println("test executed");
}
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("before method executed");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("after method executed");
	}
}