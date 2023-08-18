package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
import java.util.concurrent.TimeUnit;
public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.exe", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http:\\www.salonlet.com");
        WebElement login=driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[6]/a[1]"));
        login.click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        Thread.sleep(3000);
        email.sendKeys("shivani@ypomail.com");
        
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("12345678");
        Thread.sleep(3000);
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div[1]/input"));
        loginButton.click();
        email.clear();
       }

}
//WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"Signup_btn_user\"]"));
//signupButton.click();
//email.clear();
