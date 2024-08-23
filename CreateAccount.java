package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys( "Selenium Automation Tester");
        WebElement aa=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
        Select ind=new Select(aa);
        ind.selectByValue("IND_SOFTWARE");
        WebElement own=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
        Select own1=new Select(own);
        own1.selectByVisibleText("S-Corporation");
        WebElement sou=driver.findElement(By.xpath("//select[(@name='dataSourceId')]"));
        Select emp=new Select(sou);
        emp.selectByValue("LEAD_EMPLOYEE");
        WebElement mar=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
        Select cam=new Select(mar);
        cam.selectByIndex(5);
        WebElement sta=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
        Select tex=new Select(sta);
        tex.selectByValue("TX");
        driver.findElement(By.xpath("//input[@class='smallSubmit']/parent::td")).click();
        String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Account details")) {
			System.out.println("Name is displayed correctly");
		}else {
			System.out.println("Name is displayed incorrectly");
		}
 		driver.close();   
       
        
        
        
	
	
	
	
	}

}
