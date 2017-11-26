package demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  
 @Test(enabled=false)
  public void testcase1() 
  {
	  System.out.println("testcase1");
  }
 
 @Test(enabled=false)
 
 public void testcase2() 
 {
	  System.out.println("testcase2");
 }
 

 @Test(enabled=true)
 public void testcase3() 
 {
	  System.out.println("testcase3");
 }
}
