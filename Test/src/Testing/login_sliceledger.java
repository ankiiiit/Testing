package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login_sliceledger { 
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://bharattoken.org/sliceLedger/");
 WebElement login=driver.findElement((By.xpath("//*[@id=\"navbarScroll\"]/div/a[10]")));
 login.click();
 WebElement email=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[1]/input")));
 email.sendKeys("shivi111@yopmail.com");
 WebElement password=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[2]/input")));
 password.sendKeys("123456789");
 WebElement loginButton= driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/input")));
 loginButton.click();	
	}
}