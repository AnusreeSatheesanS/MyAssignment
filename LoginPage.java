package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http:www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("anuswthrt19@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("XXXXXXX");
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	String title =driver.getTitle();
	if(title.contains("Facebook")) {
		System.out.println("Login Successfull");
	}
	else {
		System.out.println("Login Unsuccessfull");
	}
	driver.close();
	
	
	

	}

}
