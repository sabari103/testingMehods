package com.example.testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Day-4:
//Tasks-3.1,3.2,3.3,3.4

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
		//Launchig the url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		search.sendKeys("Sabari");
		
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("KG");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800)", "");
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("mail@email.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("K12345");

		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();

		//to scroll down

	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement returns =driver.findElement(By.linkText("Returns"));
		returns.click();

		
		  driver.navigate().back();
		  driver.quit();
		WebElement gift =driver.findElement(By.linkText("Gift Certificates"));
			gift.click();  
		  
    }
}
