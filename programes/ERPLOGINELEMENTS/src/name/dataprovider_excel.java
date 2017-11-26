package name;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_excel {
	
	@Test(dataProvider="getdata")
	public void logincredentials(String email,String password) throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://myswaastherp.sia.co.in/#/login");
//		driver.findElement(By.cssSelector("[placeholder='Enter Email Address']")).sendKeys(email);
//		driver.findElement(By.cssSelector("[placeholder=' Password']")).sendKeys(password);
//		driver.findElement(By.xpath(".//*[@type='submit']")).click();
//		Thread.sleep(3000);
//		driver.get("https://myswaastherp.sia.co.in/#/login");
//		driver.findElement(By.xpath("")).sendKeys("");
//		driver.findElement(By.xpath("")).sendKeys("");
//	
	}

	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		String Excelfile="/home/aj/Desktop/23.xlsx";
		String Sheetname="Sheet2";
		Object[][] ob=getexceldata(Excelfile,Sheetname) ;		
		return ob;
		
	}
	
	private static XSSFWorkbook ExcelWbook;
	private static XSSFSheet ExcelSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public String[][] getexceldata(String filename,String sheetname) throws IOException
	{
		String[][] xldata;
		FileInputStream xlfile=new FileInputStream(filename);
		ExcelWbook=new XSSFWorkbook(xlfile);
		ExcelSheet=ExcelWbook.getSheet(sheetname);
		int Rows=ExcelSheet.getLastRowNum()+1;
		int Cols=ExcelSheet.getRow(0).getLastCellNum();
		System.out.println("Total no of Rows="+Rows);
		System.out.println("Total no of Columns="+Cols);
		xldata=new String[Rows-1][Cols]; 
		for(int i=1;i<Rows;i++)
		{
			for(int j=0;j<Cols;j++)
			{
				xldata[i-1][j]=ExcelSheet.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
    return xldata;
	}
}
