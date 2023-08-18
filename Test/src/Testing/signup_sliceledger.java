package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class signup_sliceledger {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver" , "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://bharattoken.org/sliceLedger/");
		WebElement signup=driver.findElement((By.xpath("//*[@id=\"navbarScroll\"]/div/a[9]")));
		signup.click();
		WebElement firstname=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[1]/input")));
		firstname.sendKeys("Shivani");
		Thread.sleep(1000);
		WebElement lastname=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[2]/input")));
		lastname.sendKeys("Sahu");
		Thread.sleep(1000);
		 WebElement email=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[3]/input")));
		 email.sendKeys("shivi111@yopmail.com");
		 Thread.sleep(1000);
		 WebElement phonenumber=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[4]/input")));
		 phonenumber.sendKeys("4553299009");
		 Thread.sleep(1000);
		 WebElement password=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[5]/input")));
		 password.sendKeys("123456789");
		WebElement confirmpassword=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[6]/input")));
		confirmpassword.sendKeys("123456789");
		Thread.sleep(1000);
		Select se = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[7]/select")));
		se.selectByIndex(2);
		Thread.sleep(1000);
		WebElement signupButton=driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/input"));
		signupButton.click();
		
	}

}
