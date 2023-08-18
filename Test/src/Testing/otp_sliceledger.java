package Testing;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class otp_sliceledger {
public static void main(String[] args)throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver. manage(). window(). maximize();
driver.get("https://bharattoken.org/sliceLedger/");
Thread.sleep(2000);
WebElement login=driver.findElement((By.xpath("//*[@id=\"navbarScroll\"]/div/a[10]")));
login.click();
WebElement email=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[1]/input")));
email.sendKeys("shivi111@yopmail.com");
WebElement password=driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/div[2]/input")));
password.sendKeys("123456789");
WebElement loginButton= driver.findElement((By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[2]/form/input")));
loginButton.click();
Scanner sc = new java.util.Scanner(System.in);
System.out.println("Enter the otp");
String otp = sc.next();
driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[3]/form/div/input")).sendKeys(otp);
driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div[2]/div/div[3]/form/input")).click();
Thread.sleep(2000);
}
}
