import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class run 
{
@Test
	public void smoke() throws InterruptedException, IOException 
	{
		
		WebDriver driver=Browser.browsernames("chrome", "https://dribbble.com/session/new");

		PageFactory.initElements(driver, headless.class);
	}
	
}
