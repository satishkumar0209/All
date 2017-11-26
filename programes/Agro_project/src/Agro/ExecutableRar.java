package Agro;

import com.beust.testng.TestNG;

public class ExecutableRar {

	public static void main(String[] args) 
	{
				TestNG testng=new  TestNG();
				Class[] classes=new Class[]{Login.class};
				testng.setTestClasses(classes);
				testng.run();

			}

}
