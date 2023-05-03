package CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc1_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		name.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement pwd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pwd.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		btn.click();
		Thread.sleep(1000);
		WebElement c1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		c1.click();
		Thread.sleep(1000);
		WebElement c2=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
		c2.click();
		Thread.sleep(1000);
		String e1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("A to Z Order's 1st Product Title: "+e1);
		WebElement c3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
		c3.click();
		Thread.sleep(1000);
		String e2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println("Z to A Order's 1st Product Title: "+e2);
		Thread.sleep(1000);
		WebElement c4=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
		c4.click();
		Thread.sleep(1000);
		String e3=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		System.out.println("Low to High Order's 1st Product Title: "+e3);
		WebElement c5=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
		c5.click();
		Thread.sleep(1000);
		String e4=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println("High to Low Order's 1st Product Title: "+e4);
		Thread.sleep(1000);
		
		

	}

}