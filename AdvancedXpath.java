package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com");
	driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("dilip@testleaf.com");
    driver.findElement(By.xpath("//div[@id='theloginform']//input[contains(@name,'pw')]")).sendKeys("testleaf@2024");
	driver.findElement(By.xpath("//div[@id='theloginform']//input[contains(@name,'Login')]")).click();
	driver.close();
	}
}
