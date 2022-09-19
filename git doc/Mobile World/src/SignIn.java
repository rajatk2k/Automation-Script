import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn{
	
	@Test
	
	public void SignIn() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajat.kulkarni\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rajat@gmail.com");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qztf#4389");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//a[@type='submit']")).click();
    Thread.sleep(5000);
    

}
}
