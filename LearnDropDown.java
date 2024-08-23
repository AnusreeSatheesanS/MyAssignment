package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class LearnDropDown {
		public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(3000);
		WebElement dd=driver.findElement(By.name("dataSourceId"));
		Select opt=new Select(dd);
		opt.selectByIndex(5);
		Thread.sleep(3000);
		WebElement ee=driver.findElement(By.name("marketingCampaignId"));
		Select opt1=new Select(ee);
		opt1.selectByValue("CATRQ_AUTOMOBILE");
		Thread.sleep(3000);
		WebElement ff=driver.findElement(By.name("currencyUomId"));
		Select opt2=new Select(ff);
		opt2.selectByVisibleText("KPW - North Korean Won");
		Thread.sleep(3000);
		driver.close();
		}
		}