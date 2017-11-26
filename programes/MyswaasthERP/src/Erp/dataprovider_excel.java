package Erp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_excel {
	
	@Test(dataProvider="getdata")
	public void logincredentials(String username,String password)
	{
		System.out.println("User Name:"+username);
		System.out.println("Password:"+password);
	}

	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		String Excelfile="D:\\inputsheet.xlsx";
		String Sheetname="Sheet1";
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
