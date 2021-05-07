package com.LumensSite.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.LumensSite.Base.BaseClass;
import com.LumensSite.Pages.LumensPgObj;

public class FiltersVerfy extends BaseClass {
	@BeforeTest
	public void bTest() throws IOException {

		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test
	public void login() throws Throwable {

		
		LumensPgObj lumen = new LumensPgObj(driver);
		lumen.getAcctdrp().click();
		lumen.getLoginbtn().click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		lumen.getClosePopup().click();
		lumen.getEmailtxtbox().sendKeys(prop.getProperty("email"));
		lumen.getPasstxtbox().sendKeys(prop.getProperty("pwd"));
		lumen.getSignupbtn().click();
		Thread.sleep(10000);

		lumen.getGoToHome().click();
		lumen.getLighting().click();
		lumen.getCeilingLights().click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		lumen.getChandeliers().click();
		lumen.getLargeChandeliers().click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lumen.getFilterReadyToShip().click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		lumen.getStyle().click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		lumen.getSelectItem().click();
		lumen.getAddTocart().click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void aTest() {
		driver.close();
	}

}
