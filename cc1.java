package CC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc1 {
	WebDriver driver;
	
	
	@Test(priority = 1)
	public void test1() {
		WebElement name = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		WebElement button_1 = driver.findElement(By.id("login-button"));
		button_1.click();
		
	}
	
	@Test(priority = 2) 
	public void test2() {
		WebElement cart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		cart.click();
	}
	
	@Test(priority = 3) 
	public void test3() {
		WebElement cart = driver.findElement(By.className("shopping_cart_link"));
		cart.click();
		String a_url = "https://www.saucedemo.com/cart.html";
		String e_url = driver.getCurrentUrl();
		Assert.assertEquals(a_url, e_url);
	}
	@Test(priority = 4)
	public void test4() {
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		String a_url  = driver.getCurrentUrl();
		String e_url = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertEquals(a_url, e_url);
		WebElement fname = driver.findElement(By.id("first-name"));
		WebElement lname = driver.findElement(By.id("last-name"));
		WebElement postcode = driver.findElement(By.id("postal-code"));
		WebElement button = driver.findElement(By.name("continue"));
//		WebElement cont = driver.findElement(By.name("continue"));
		fname.sendKeys("Vimal");
		lname.sendKeys("Kamal");
		postcode.sendKeys("789421");
		
		button.click();
//		String pName = driver.
//		System.out.println("Sauce Labs Backpack");
//		System.out.println("$ 29.99");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
		String t_url = "https://www.saucedemo.com/checkout-step-two.html";
		String t_url_a = driver.getCurrentUrl();
		Assert.assertEquals(t_url, t_url_a);
		String title = "Swag Labs";
		String titl = driver.getTitle();
		Assert.assertEquals(title, titl);
		System.out.println(t_url);
		System.out.println(titl);
		
	}
	  @BeforeSuite
	  public void setup() {
		  WebDriverManager.edgedriver().setup();
			EdgeOptions co = new EdgeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			
	  }
	  
	  @AfterSuite
	  public void teardown() {
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		  driver.close();
//		  driver.close();
	  }
}
