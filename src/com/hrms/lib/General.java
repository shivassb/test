package com.hrms.lib;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class General extends Global {

public void openapplication() throws Exception{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\srire\\Documents\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("opened url");
	Thread.sleep(3000);

}
public void login()throws Exception{

	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("login success");
	Thread.sleep(3000);

}

public void logout() 	throws Exception{
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("logout success");
	Thread.sleep(3000);
	
}
public void addemp() {
System.out.println("employee added");	

}
public void deltemp() {
	System.out.println("emp deleted");
}
public void closebrowser() {
	driver.close();
	System.out.println("browser closed");
}

}
