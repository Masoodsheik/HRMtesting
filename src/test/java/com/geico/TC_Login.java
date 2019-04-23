package com.geico;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC_Login extends Beaseclass {

	@Test
	public void LoginTest() {

		LoginPage login = new LoginPage(driver);
		login.SetUserName("Admin");
		login.SetPassword("admin123");
		login.ClickSubmit();
	}

}
