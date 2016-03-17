package com.yyl.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.yyl.utils.ThreadUtil;

public class Test {

	// http://www.testwo.com/blog/6931
	public static void main(String[] args) {

		String chromPath = System.getProperty("user.dir") + File.separator
				+ "tools" + File.separator + "chromedriver.exe";

		String iePath = "C:\\Program Files\\Internet Explorer\\iexplore.exe";
		System.out.println(chromPath);

		// ChromeDriverService service = new ChromeDriverService.Builder()
		// .usingDriverExecutable(new File(chromPath)).usingAnyFreePort()
		// .build();
		try {
			// service.start();
			// System.setProperty("webdriver.chrome.driver", chromPath);
			// WebDriver driver = new ChromeDriver();

			// System.setProperty("webdriver.firefox.driver", chromPath);
			// WebDriver driver = new FirefoxDriver();

			System.setProperty("webdriver.ie.driver", iePath);
			WebDriver driver = new InternetExplorerDriver();

			driver.get("http://www.baidu.com");

			driver.manage().window().maximize();

			WebElement txtbox = driver.findElement(By.id("kw"));
			txtbox.sendKeys("wifi是个大傻逼吗？");

			WebElement btn = driver.findElement(By.id("su"));
			btn.click();

			ThreadUtil.sleep(5);
			driver.quit();
			// service.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
