package Basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonutils.PropertyFileUtil;
import commonutils.WebDriverUtil;

public class OrganizationTest {

	

	
		//PropertyFileUtil pu = new PropertyFileUtil();
		
		//WebDriverUtil wu = new WebDriverUtil();
		
		
		@Test
		public void organizationTest() throws IOException, InterruptedException {
			
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.get("http://localhost:8888/");
			d.findElement(By.name("user_name")).sendKeys("admin");
			d.findElement(By.name("user_password")).sendKeys("admin");
			d.findElement(By.id("submitButton")).click();
			
//			WebDriver d = new ChromeDriver();
//			wu.maximize(d);
//			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			//TO READ THE DATA FROM PROPERTY FILE
//			String url = pu.getDataFromProertyfile("Url");
//			String username = pu.getDataFromProertyfile("Username");
//			String pass = pu.getDataFromProertyfile("Password");
//			
		
	}
}
}
