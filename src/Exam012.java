import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

class Exam012 {

	@Test
	void Exam01() throws InterruptedException {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://nxtgenaiacademy.com/demo-site/");

		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Nattaphong");
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Sriphaophan");
//		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"vfb-31-1\"]"));
//		radio1.click();
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("144 m.5");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("not have");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("null");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("null");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("suphan buri");
//		Select option1 = new Select(driver.findElement(By.xpath("//*[@class=\"select2-selection select2-selection--single\"]")));
//		option1.selectByVisibleText("Andorra");
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("644259012@webmail.npru.ac.th");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("08/02/66");
//		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-hour-container\"]")));
//		option1.selectByVisibleText("01");
//		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-min-container\"]")));
//		option1.selectByVisibleText("01");
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0928983405");
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]"));
		radio7.click();
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("hello	");
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();

		assertEquals("Dynamic Transaction Verification", result);
		
//		Thread.sleep(4000);
		driver.quit();
		driver = null;
	}
}