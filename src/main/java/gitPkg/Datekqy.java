package gitPkg;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Datekqy {
@Test
public static void chkDate(){
//public static void main(String[] args) {	
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/");
			driver.manage().window().maximize();
			driver.findElementByLinkText("Datepicker").click();
			driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
			driver.findElementByClassName("hasDatepicker").click();
			
			WebElement tables=driver.findElementByXPath("//table[@class='ui-datepicker-calendar']/tbody");
			List <WebElement>rw =tables.findElements(By.tagName("tr"));
			System.out.println(rw.size());
			List <WebElement>col =driver.findElements(By.tagName("td"));
			for(WebElement r:col){
				if(r.getText().equals("31")){
					r.findElement(By.linkText("31")).click();
					break;
				}
			}
			//driver.findElementByXPath("//table[@class='ui-datepicker-calendar']/tbody//tr[5]//td[3])/a").click();
			//driver.close();
		}
	}

