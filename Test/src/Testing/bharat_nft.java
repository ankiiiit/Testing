package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bharat_nft {
public static void main(String[] org) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
 WebDriver  driver=new ChromeDriver();
 driver. manage(). window(). maximize();
driver.get("https://bharatnft.store/");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/button")).click();
//WebElement search=driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[1]/div[1]/input"));//
driver.get("https://metamask.io");
driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/header/div[2]/nav/div/div[5]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div[2]/div/a/span")).click();
driver.findElement(By.className("g-c-x")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div/div")).click();
driver.findElement(By.className("\"dd-Va g-c-wb g-eg-ua-Uc-c-za g-c-Oc-td-jb-oa g-c\"")).click();

}
}
///html/body/div[3]/div[2]/div/div/div[2]/div[2]/div/div
///html/body/div[3]/div[2]/div/div/div[2]/div[2]/div//