
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Signup {
	@Test

	public void signup() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajat.kulkarni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://mobileworld.banyanpro.com/");
		
		 Thread.sleep(1000);
         driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("a[href='signup.html']")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("myName")).sendKeys("Rajat");
         driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("KK");
         driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("rajat@gmail.com");
         driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("34//497");
         driver.findElement(By.cssSelector("input[type='date']")).sendKeys("o1/19/1972");
         driver.findElement(By.cssSelector("div[class='col-md-2'] input[name='gender']")).click();
         driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("6638095678");
         driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("Welcome to Qualitest");
         Thread.sleep(1000);
         
         
         driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
         Thread.sleep(5000);
         
        
        
         
	}

}
