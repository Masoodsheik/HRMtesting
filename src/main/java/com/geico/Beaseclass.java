package com.geico;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.Readconfig;

public class Beaseclass {
	Readconfig objconfig = new Readconfig();
	public static WebDriver driver;
	String browsername="firefox";
	String baseUrl = "https://opensource-demo.orangehrmlive.com";
	@Parameters("browser")
	@BeforeClass
	public void setUp(String brname) {

		
			
		if(brname.equals(browsername))
		{
		System.setProperty("webdriver.gecko.driver", objconfig.getfirefoxpath());
		driver = new FirefoxDriver();
		
		}else if(brname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", objconfig.getChromepath());
			driver=new ChromeDriver();
		}
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public void teardown() {
		driver.close();
		
	}
}
