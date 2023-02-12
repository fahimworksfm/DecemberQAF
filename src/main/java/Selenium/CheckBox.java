package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		
		WebElement check1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		Thread.sleep(2000);
		
		if (check1.isSelected()) {
			
			System.out.println("CheckBox 1 is already selected");
		}
			
		else if (check2.isSelected()){
			
			System.out.println("Checkbox 2 is already selected");
			
		}
		
		else { 
			check1.click();
			
		}

	}

}
