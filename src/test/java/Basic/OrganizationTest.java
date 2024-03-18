package Basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class OrganizationTest {

		@Test
		public void organizationTest() throws IOException, InterruptedException {
			
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.get("http://localhost:8888/");
			d.findElement(By.name("user_name")).sendKeys("admin");
			d.findElement(By.name("user_password")).sendKeys("admin");
			d.findElement(By.id("submitButton")).click();
			
//		
//			
		
	}
}

